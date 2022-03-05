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
    if message.author.bot:
        return
    elif message.channel.id == 940487185973530655 and message.content.find(',') != -1:
        if message.content.find('help') != -1:
            await message.channel.send('1. Ping: **pwan**,**plan**\n2. **up**: uptime\n3. **log2ram**\n4. **ram**\n5. **pihole**')
        if message.content.find('pwan') != -1:
            await message.channel.send(os.popen('ping 1.1.1.1 -c 1').read())
        elif message.content.find('plan') != -1:
           await message.channel.send(os.popen('ping 192.168.1.1 -c 1').read())
        elif message.content.find('up') != -1:
            await message.channel.send(os.popen('uptime').read())
        elif message.content.find('log2ram') != -1:
            await message.channel.send(os.popen('df -h | grep log2ram').read())
        elif message.content.find('ram') != -1:
            await message.channel.send(os.popen('free -h').read())
        elif message.content.find('dns') != -1:
            await message.channel.send(os.popen('pihole status').read())
        elif message.content.find('temp') != -1:
            await message.channel.send(os.popen('vcgencmd measure_temp').read())

client.run(TOKEN) 