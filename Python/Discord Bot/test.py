import discord
import os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Test_token')

client = discord.Client()

#Status: Active

@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='Admin'))
    print('Test bot logged in.')

#Test code

client.run(TOKEN)