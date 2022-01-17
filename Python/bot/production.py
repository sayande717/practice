import discord
import os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('')

client = discord.Client()

@client.event
async def on_ready():
    print('Local bot logged in.')

@client.event
async def on_message(message):
    if message.author == client.user:
        return
    if message.content.startswith('Hello!'):
        await message.channel.send('Hi there!')

client.run(TOKEN)