
from discord.ext import commands
import discord,os

# Import Bot Token
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('TestLocal')

# Bot Intents
intent = discord.Intents.default()
intent.message_content = True

# Bot Command prefix
bot = commands.Bot(intents=intent, command_prefix='%%')
client = discord.Client(intents=intent)

@bot.event
async def on_ready():
    await bot.change_presence(status=discord.Status.online)

@bot.command()
async def echo(ctx,message):
    await ctx.channel.get_channel(994965043588370525).send(message)


bot.run(TOKEN)
