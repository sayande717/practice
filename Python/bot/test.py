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
    print('1')
    #Send the bot update message(s).
    #channel = client.get_channel(944658998550999060)
    #await channel.send('[02.03.22 11:48]:')


#Test code
@client.event
async def on_message(message):
    if message.author.bot:
        return
    elif message.channel.id == 940487185973530655:
        return
        
client.run(TOKEN)