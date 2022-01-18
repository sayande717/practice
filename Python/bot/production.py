import discord,os,time
import asyncio
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Production_token')
client = discord.Client()

async def live_uptime():
    while True:
        uptime = os.popen('up').read()
        await client.change_presence(activity=discord.Game(name=uptime))
        await asyncio.sleep(60)

@client.event
async def on_ready():
    await client.change_presence(status='online')
    print('Local bot logged in.')
    client.loop.create_task(live_uptime())

@client.event
async def on_message(message):
    if message.author == client.user:
        return
    if message.content.startswith('Hi!'):
        await message.channel.send('Hi there!')

client.run(TOKEN)