import discord,os
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Test-Local')

class MyClient(discord.Client):
    async def on_ready(self):
        print(f'Logged on as Test Bot (PC)!')

    async def on_message(self, message):
        print(f'Message from {message.author}: {message.content}')

intents = discord.Intents.default()
intents.message_content = True

client = MyClient(intents=intents)
client.run(TOKEN)