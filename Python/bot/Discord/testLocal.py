# Import from common.py
from common import getMathResult,getStrMistake,getChannelID

from discord.ext import commands
import discord
import os
import math

# Import Bot Token
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('TestLocal')

# Bot Intents
intent = discord.Intents.default()
intent.message_content = True

# Bot Command prefix
bot = commands.Bot(intents=intent, command_prefix='%%')


@bot.event
async def on_ready():
    await bot.change_presence(status=discord.Status.idle)

bot.run(TOKEN)
