import discord,os
from discord.ext import commands

from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('testLocal')

intent = discord.Intents.default()
intent.message_content = True

# Set command prefix here.
bot = commands.Bot(intents=intent,command_prefix='')

@bot.event
async def on_ready():
    await bot.change_presence(status=discord.Status.online)

# Sample command
# @bot.command()
# async def ping(ctx):
#     await ctx.send('Pong!')

# Only change code below this part

  
  
# Only change code above this part

bot.run(TOKEN)
