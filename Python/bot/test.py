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
'''
#Status: Active
@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='Admin'))
    print('Test bot running.')
    #Send the bot update message(s).
    #channel = client.get_channel(944658998550999060)
    #await channel.send("[07/03/2022 | 22:38]:\n")
'''
#Test code
@client.event
async def on_message(message):
    if message.author.bot:
        return
    elif message.channel.id == 940487185973530655:
        return

client.run(TOKEN)
