#Import the discord.py package. 'os' package is needed for importing the 'env' file.
import discord
import os
#Import 'load_dotenv' function from package 'dotenv'
from dotenv import load_dotenv
#load a .env file
load_dotenv()
#Specify the name of the token here.
TOKEN = os.getenv('token')
#Specify the client to be used by the bot.
client = discord.Client()
"""
@client.event = Creates an event. Everything here is an event.
Execute these lines once the bot is ready.
"""
@client.event

#Welcomes a new user.
@client.event
async def on_member_join(member):
    #Paste channel ID here
    channel = client.get_channel('channel ID')
    #Provide a title & description.
    embed=discord.Embed(title=f"Welcome {member.name}!", description=f"Thanks for joining my server!")
    #Set thumbnail to user's image.
    embed.set_thumbnail(url=member.avatar_url)
    #Send the message.
    await channel.send(embed=embed)
    
async def on_ready():
    #Change status to - dnd,idle,online (online is default).
    await client.change_presence(status='online')
    #Print the text on the terminal once bot is ready.
    print('Test bot logged in.')

#If a message starts with a string, it replies to that message with another pre-defined string.
@client.event
async def on_message(message):
    if message.author == client.user:
        return
    #if message starts with 'Hello!'
    #Send the message 'Hi!'
    if message.content.startswith('Hello!'):
        await message.channel.send('Hi!')

#Run the client using the token defined above.
client.run(TOKEN)