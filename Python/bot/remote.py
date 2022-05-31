import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Remote_replit')
client = discord.Client()

#Status: Active
@client.event
async def on_ready():
    #await client.change_presence(status='dnd',activity=discord.Activity(type=discord.ActivityType.listening, name='%help'))
    await client.change_presence(status='dnd')
    print('Remote bot running.')

#Test code

client.run(TOKEN)