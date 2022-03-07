import discord,os
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('Local_token')

client = discord.Client()

@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='%help'))
    print('Local bot logged in.')

'''
Help index:
1. #chat
2. #music-requests

General replies:
1. hi

Messages that'll be deleted:
1. abcd
2. def
'''
#Help section
@client.event
async def on_message(message):
        if message.author.bot:
            return
        else:
            '''
            Variable description: 
            msg = Original client message.
            msglow = Client message converted to lowercase.
            '''
            msg = message.content
            msglow = msg.lower()
            #Case sensitive
            if msg == '%help':
                #For chat channels
                if message.channel.id == 944823325450977332 or message.channel.id == 940604423330222140:
                    await message.reply("---Help---\nChannel: **#chat**\n(Make sure the word '**bot**' is present in your message, ex. Hi bot!)\n1. Hi/hello/hey bot: Say hi to the bot!\n2. Good morning/afternoon/evening/night bot: Greet the bot!")
                #For music channels
                elif message.channel.id == 944823432971968523 or message.channel.id == 944825825243574292:
                    await message.reply("---Help Commands---\nChannel: **#music-requests**\n1. Hydra = **.help** \n2. FredBoat = **;;help** \n3. Lofi Radio: = **lofi.help** & **/help**")
            else:
            #Non-case sensitive
                #Greetings
                '''
                Variable description:
                greetings_welcome = List of hi,hello related terms.
                greetings_daywish = List of good morning, good night related terms.
                listmax = Stores the length of the list which has the maximum number of elements.
                '''
                greetings_welcome = ['hi','hello','hey','hola']
                greetings_daywish = [['good morning','Good Morning! :sunrise:'],
                                     ['good afternoon','Good Afternoon! :cityscape:'],
                                     ['good evening','Good Evening! :city_dusk:'],
                                     ['good night','Good Night! :night_with_stars: :zzz:']]
                #Finds out which list has the maximum number of elements
                listmax = max([len(greetings_welcome),len(greetings_daywish)])
                if msglow.find('bot') != -1:
                    for i in range (listmax):
                        if msglow.find(greetings_welcome[i]) != -1:
                            await message.reply('Hi there!')
                        elif msglow.find(greetings_daywish[i][0]) != -1:
                            await message.reply(greetings_daywish[i][1])

client.run(TOKEN)