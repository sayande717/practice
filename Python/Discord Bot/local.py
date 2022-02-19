import discord,os
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Production_token')
client = discord.Client()

@client.event
async def on_ready():
    await client.change_presence(status='online')
    print('Local bot logged in.')

@client.event
async def on_message(message):
    if message.content.find('Hi') != -1 or message.content.find('hi') != -1:
        await message.reply('Hello there!')
    if message.content.find('Ping') != -1 or message.content.find('ping') != -1:
        await message.reply('Pong!')

client.run(TOKEN)