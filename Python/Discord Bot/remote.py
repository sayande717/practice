import discord, os
from dotenv import load_dotenv
from run_remote import run_bot

load_dotenv()
TOKEN = os.getenv('Remote_token')
client = discord.Client()


@client.event
async def on_ready():
    await client.change_presence(status='dnd')
    print('Remote bot logged in.')


run_bot()
client.run(TOKEN)
