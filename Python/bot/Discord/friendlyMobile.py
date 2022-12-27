# Import from common.py
from common import getChannelID

from discord.ext import commands
import discord
import os

# Import Bot Token
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Friendly')

# Import from common.py

# Bot Intents
intent = discord.Intents.default()
intent.message_content = True

# Bot Command prefix
bot = commands.Bot(intents=intent, command_prefix='$')


@bot.event
async def on_ready():
    await bot.change_presence(status=discord.Status.idle, activity=discord.Activity(type=discord.ActivityType.listening, name='$info'))


# @bot.command()
# async def info(ctx):
#     # Database
#     infoDB = {
#         'header': {
#             'LHS': '< **Information/Help** /> \
#                 \n> **Channel** ->'
#         },

#         'description': {
#             'LHS': '**Description** ->',
#             'RHS': {
#                 # Category: Ask The Bot!
#                 getChannelID('Ask The Bot!', 'calculations'): 'Perform calculations here!\
#                     \nCurrently supported operations: [+,-,*,/,%,^]',
#                 getChannelID('Ask The Bot!', 'unit-conversion'): 'Perform unit conversion here!\
#                     \nCurrently, these units are supported: [temperature]'
#             }
#         },
#         'footer': 'Enjoy! :innocent:'
#     }
#     try:
#         channelID = ctx.channel.id
#         infoMessage = f'{infoDB["header"]["LHS"]} #{bot.get_channel(channelID)}\
#         \n> {infoDB["description"]["LHS"]} {infoDB["description"]["RHS"][channelID]}\
#         \n \
#         \n{infoDB["footer"]}'
#         await ctx.channel.send(infoMessage)
#     except KeyError:
#         return

bot.run(TOKEN)
