import discord,os
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Production_token')
client = discord.Client()

@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='%help'))
    print('Local bot logged in.')

#Replying to messages
@client.event
async def on_message(message):
    if message.content.find('Hi') != -1 or message.content.find('hi') != -1:
        await message.reply('Hello there!')
    if message.content.find('Ping') != -1 or message.content.find('ping') != -1:
        await message.reply('Pong!')
        
#Help menus
@client.event
async def on_message(message):
    if message.channel.id == 944823432971968523 or message.channel.id == 944825825243574292:
        if message.content.find('%help') != -1:
            if message.content.find('music') != -1:
                await message.reply('---Help Menu---\n1. Hydra = **.help** \n2. FredBoat = **;;help** \n3. Lofi Radio: = **lofi.help** & **/help**')

client.run(TOKEN)