import discord
import os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Test_token')

client = discord.Client()
##Active
'''
@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Game(name='Visual Studio Code'))
    print('Test bot logged in.')
'''
##Idle
'''
@client.event
async def on_ready():
    await client.change_presence(status='idle')
    print('Test bot logged in.')
'''
client.run(TOKEN) 