import discord
import os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Status_token')

client = discord.Client()

@client.event
async def on_ready():
    await client.change_presence(status='dnd',activity=discord.Activity(type=discord.ActivityType.watching, name='System Status'))
    print('Status bot logged in.')

@client.event
async def on_message(message):
    if (message.channel.id == 940487185973530655):
        if message.content.startswith(','):
            if message.content.find('pwan') != -1:
                await message.channel.send(os.popen('ping 1.1.1.1 -c 1').read())
            if message.content.find('plan') != -1:
                await message.channel.send(os.popen('ping 10.0.17.23 -c 1').read())
            if message.content.find('up') != -1:
                await message.channel.send(os.popen('uptime').read())
            if message.content.find('ram') != -1:
                await message.channel.send(os.popen('free -h').read())
            
client.run(TOKEN) 