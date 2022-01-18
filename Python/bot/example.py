#Import the discord.py package. 'os' package is needed for importing the 'env' file.
import discord,os,time
import asyncio
#Import 'load_dotenv' function from package 'dotenv'
from dotenv import load_dotenv
#load a .env file
load_dotenv()
#Specify the name of the token here.
TOKEN = os.getenv('token')
#Specify the client to be used by the bot.
client = discord.Client()
"""
@client.event = Creates an event.
Execute these lines once the bot is ready.
"""
@client.event
#Executes on_ready() when the bot is ready.
async def on_ready():
    #Change status to - dnd,idle,online (online is default).
    await client.change_presence(status='online')
    '''Change playing/streaming status - (activity=(See below))
    discord.Game(name='Name of the game/anything')
    discord.Activity(type=discord.ActivityType.streaming, name='name', url='Stream URL/any other URL')
    discord.Activity(type=discord.ActivityType.listening, name='name')
    discord.Activity(type=discord.ActivityType.watching, name='name')
    '''
    await client.change_presence(activity=discord.Game(name='abcd'))
    #Print the text on the terminal once bot is ready.
    print('Test bot logged in.')
    #(1.2) From line 45 > Create a task to run the 'uptimefunction()' function.
    client.loop.create_task(uptimefunction())

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

#To show live uptime in 'Playing a Game' activity status on bot, define this function, then go to line 31
async def uptimefunction():
    #The while loop runs once every 30 seconds (defined in asyncio.sleep()).
    while True:
        #Execute the command 'up' in the system & read the output.
        up = os.popen('up').read()
        #Change activity status accordingly.
        await client.change_presence(activity=discord.Game(name=up))
        #Sleep for '30' seconds.
        await asyncio.sleep(30)

#If a message starts with a string, it replies to that message with another pre-defined string.
@client.event
async def on_message(message):
    #if message starts with 'abc', send the message 'def'.
    if message.author == client.user:
        return
    if message.content.startswith('abc'):
        await message.channel.send('def')

#Run the client using the token defined above.
client.run(TOKEN)