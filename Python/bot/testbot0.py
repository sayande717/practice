import discord
import os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Test_token')

client = discord.Client()


@client.event
async def on_ready():
    await client.change_presence(status='dnd')
    print('Test bot logged in.')

"""
@client.event
async def on_message(message):
    if message.author == client.user:
        return

    if message.content.startswith('Hello!'):
        await message.channel.send('Hi!')
"""

client.run(TOKEN)