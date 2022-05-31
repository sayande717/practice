import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Test_remote')
client = discord.Client()

#Status: Active
@client.event
async def on_ready():
    #await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='Sayan'))
    await client.change_presence(status='idle')
    print('Remote test bot running.')

#Test code

client.run(TOKEN)