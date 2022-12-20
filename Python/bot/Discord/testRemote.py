from discord.ext import commands
import discord
import os
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Test_Server')
intent = discord.Intents.default()
intent.message_content = True

bot = commands.Bot(intents=intent, command_prefix='$')
# bot.remove_command('help')


@bot.event
async def on_ready():
    await bot.change_presence(status=discord.Status.idle)

# Command: info / help

# @bot.command()
# async def info(ctx):
#     @bot.event
#     async def on_message(message):
#         if message.author.bot:
#             return
#         else:
#             # Database
#             infoDB = {
#                 'header': {
#                     'LHS': 'Information/Help for channel :-'
#                 },

#                 'scope': {
#                     'LHS': '**Scope** :-',
#                     'RHS': {
#                         'testingCommands': 'Test Commands',
#                         'stableCommands': 'Bot Commands',
#                         'chat': 'General Chat',
#                         'chat+Commands': 'General Chat & Bot Commands'
#                     }
#                 },

#                 'description': {
#                     'LHS': '**Description** :-',
#                     'RHS': {
#                         # Category: Ask The Bot!
#                         952095676106412042: '',
#                         985990030570975262: '',
#                         # Category: LoFi Zone!
#                         1052898474254938194: '',
#                         # Category: Friends ✨
#                         944823325450977332: '',
#                         # Category: Code Testing
#                         994965043588370525: 'New / modified code, running on the Test Bot, will be tested here.',
#                         994965065545547786: 'Any bot-related feature requests / suggestions for improvement are welcome!'
#                     }
#                 },
#                 'footer':'Thank You! :innocent:'
#             }
#             try:
#                 channelID = message.channel.id
#                 infoDB['description']['RHS'][channelID]  # Code will not continue if this returns a KeyError.
#                 infoMessage = f'{infoDB["header"]["LHS"]} **#{bot.get_channel(994965043588370525)}**\
#                 \n{infoDB["scope"]["LHS"]} {infoDB["scope"]["RHS"]["testingCommands"]}\
#                 \n{infoDB["description"]["LHS"]} {infoDB["description"]["RHS"][channelID]}\
#                 \n \
#                 \n{infoDB["footer"]}'
#                 await ctx.send(infoMessage)
#             except KeyError:
#                 return

# client(intents=intent).run(TOKEN)
bot.run(TOKEN)
