import discord,os
from dotenv import load_dotenv
load_dotenv()
TOKEN = os.getenv('Production_token')
client = discord.Client()

@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='%help'))
    print('Local bot logged in.')

'''
Help index:
1. #chat
2. #music-requests
'''
@client.event
async def on_message(message):
        if message.author.bot:
            return
        #Help section
        elif '%help'in message.content:
            if message.channel.id == 944823325450977332 or message.channel.id == 940604423330222140:
                await message.reply("---Help---\nChannel: **#chat**\n1. **Hi** = Say hi to the bot!\n2. **Ping** = Check if the bot is responding.")
            elif message.channel.id == 944823432971968523 or message.channel.id == 944825825243574292:
                await message.reply('---Help---\nChannel: **#music-requests**\n1. Hydra = **.help** \n2. FredBoat = **;;help** \n3. Lofi Radio: = **lofi.help** & **/help**')
        #Replying to messages
        elif 'hi' in message.content.lower():
            await message.reply('Hello there!')
        elif 'ping' in message.content.lower():
            await message.reply('Pong!')
        #Delete messages containing certain keywords
        elif 'abcd' in message.content:
            await message.delete()


client.run(TOKEN)