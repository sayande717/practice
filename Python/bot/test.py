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
    print('Test bot running.')
    #Send the bot update message(s).
    #channel = client.get_channel(940487185973530655)
    #await channel.send("[07.03.22 17:10]:\n")

#Test code
@client.event
async def on_message(message):
    if message.author.bot:
        return
    elif message.channel.id == 940487185973530655:
        return

client.run(TOKEN)
