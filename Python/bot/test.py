import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Test_token')
client = discord.Client()

#Status: Active
@client.event
async def on_ready():
    #await client.change_presence(status='online')
    await client.change_presence(status='idle')
    print('Test bot running.')

#Test code

client.run(TOKEN)