import discord
import os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Test_token')

client = discord.Client()

#Status: Idle

@client.event
async def on_ready():
    await client.change_presence(status='idle')
    print('Test bot idling...')

#Status: Active
'''
@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='Admin'))
    print('Test bot logged in.')
#Push the update
@client.event
async def on_message(message):
    if message.content.find('$up') != -1:
        await message.channel.send('[21.02.22 10:36]:')
'''

client.run(TOKEN)