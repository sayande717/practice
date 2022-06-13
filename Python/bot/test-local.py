import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Test_local')
client = discord.Client()

#Status
@client.event
async def on_ready():
    await client.change_presence(status='online', activity=discord.Activity(type=discord.ActivityType.listening, name='Sayan'))
    print('Local test bot running.')


@client.event
async def on_message(message):
    if message.author.bot:
        return
    # Test code
    elif message.channel.id == 985990030570975262:
        msg=message.content

client.run(TOKEN)