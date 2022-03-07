import discord,os,time
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Local_token')

client = discord.Client()

'''
Help index:
1. #chat
2. #music-requests

General replies:
1. hi,hello,hola,hey
2. good morning,afternoon,evening,night

Messages that'll be deleted:
1. abcd
2. def
3. f
'''
@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='%help'))
    print('Local bot logged in.')

@client.event
async def on_message(message):
    '''
    ---General---
    msg = Original client message.
    msglow = Client message converted to lowercase.
    '''
    msg = message.content
    msglow = msg.lower()
    '''

    ---For greetings---
    greetings_welcome = List of hi,hello related terms.
    greetings_daywish = List of good morning, good night related terms.
    '''
    greetings_welcome = ['hi','hello','hey','hola']
    greetings_daywish = [['good morning','Good Morning! :sunrise:'],
                        ['good afternoon','Good Afternoon! :cityscape:'],
                        ['good evening','Good Evening! :city_dusk:'],
                        ['good night','Good Night! :night_with_stars: :zzz:']]
    #listmax = Stores the length of the list which has the maximum number of elements.
    listmax = max([len(greetings_welcome),len(greetings_daywish)])

    '''
    ---For Deleting banned words---
    msgtodel = Stores the banned words.
    '''
    msgtodel = ['abcd','def','fuck']
    
    if message.author.bot:
        return
    else:
        if msg == '%help':
            #For chat channels
            if message.channel.id == 944823325450977332 or message.channel.id == 940604423330222140:
                botmsg = await message.reply("---Help---\nChannel: **#chat**\n1. Hi/hello/hey: Say hi to the bot!\n2. Good morning/afternoon/evening/night: Greet the bot!\n\n**This message will disappear after 10 seconds.**")
            #For music channels
            elif message.channel.id == 944823432971968523 or message.channel.id == 944825825243574292:

                botmsg = await message.reply("---Help Commands---\nChannel: **#music-requests**\n1. Hydra = **.help** \n2. FredBoat = **;;help** \n3. Lofi Radio: = **lofi.help** & **/help**\n\n**This message will disappear after 10 seconds.**")
            await message.delete()
            time.sleep(10)
            await botmsg.delete()
                
        else:
            #Delete messages containing certain keywords
            for i in range (len(msgtodel)):
                if msglow.find(msgtodel[i]) != -1:
                    await message.delete()
                    botmsg = await message.channel.send('**Message deleted because of banned word(s).**\nNote: Check the **#rules** channel for server rules.')
                    time.sleep(4)
                    await botmsg.delete()

            #Greetings
            #'bot' word detection temporarily disabled.
            #if msglow.find('bot') != -1:
            for i in range (listmax):
                if msglow.find(greetings_welcome[i]) != -1:
                    await message.reply('Hi there!')
                elif msglow.find(greetings_daywish[i][0]) != -1:
                    await message.reply(greetings_daywish[i][1])

client.run(TOKEN)