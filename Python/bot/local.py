import discord,os,time
from dotenv import load_dotenv
#For calculations
from addons import calc

load_dotenv()
TOKEN = os.getenv('Local')

client = discord.Client()

@client.event
async def on_ready():
    await client.change_presence(status='online',activity=discord.Activity(type=discord.ActivityType.listening, name='%help'))
    print('Local bot logged in.')

@client.event
async def on_message(message):
    if message.author.bot:
        return
    else:
        '''
        ---Formatting the client's message as needed---
        msg = Original client message.
        msglow = Client message converted to lowercase.
        -----Notification at the end of messages that will be deleted-----
        msgdel3 = 3 seconds timeout.
        msgdel10 = 10 seconds timeout.
        '''
        msg = message.content
        msglow = msg.lower()
        msgdel3 = '\n\nThis message will be auto-deleted in 3 seconds.'
        msgdel10 = '\n\nThis message will be auto-deleted in 10 seconds.'

        if msglow == '%help':    
            '''
            Help index:
            1. #chat
            3. #calculations
            '''
            #For #chat
            helpstart = '-----Help-----\n'
            if message.channel.id == 944823325450977332 or message.channel.id == 940604423330222140:
                botmsg = await message.reply(helpstart+"Channel: **#chat**\nMake sure the word '**bot**' is present in your message.\n1. Hi/hello/hey bot: Say hi to the bot!\n2. Good morning/afternoon/evening/night bot: Greet the bot!"+msgdel10)            
            #For #calculations channel
            elif message.channel.id == 952095676106412042:
                botmsg = await message.reply(helpstart+"Channel: **#calculations**\nSupported operations:\n1. Addition: [**+**]\n2. Subtraction: [**-**]\n3. Multiplication: [***** or **x** or **X**]\n4. Division: [**/**]\n5. Modulus/Remainder: [**%**]\n6. X to the power Y: [**^**]\n\nSyntax: **2+3**, where **2** & **3** are the numbers you want to evaluate and **+** is the operator."+msgdel10)
            time.sleep(10)
            await botmsg.delete()
            await message.delete()

        else:
            '''
            ---Delete messages containing certain keywords---
            Messages that'll be deleted:
            1. slangs
            
            msgtodel = Stores the banned words to be deleted.
            '''
            msgtodel = ['fuck','whore','cunt']
            for i in range (len(msgtodel)):
                if msglow.find(msgtodel[i]) != -1:
                    await message.delete()
                    botmsg = await message.channel.send('**Message deleted because of banned word(s).** Check the **#rules** channel for server rules.'+msgdel3)
                    time.sleep(3)
                    await botmsg.delete()

            if message.channel.id == 940604423330222140 or message.channel.id == 944823325450977332:
                '''
                General replies:
                1. hi,hello,hola,hey
                2. good morning,afternoon,evening,night

                ---Greetings for #chat channels---
                greetings_welcome = List of hi,hello related terms.
                greetings_daywish = List of good morning, good night related terms.
                '''
                greetings_welcome = ['hi','hello','hey','hola']
                greetings_daywish = [['good morning','Good Morning! :sunrise:'],
                                    ['good afternoon','Good Afternoon! :cityscape:'],
                                    ['good evening','Good Evening! :city_dusk:'],
                                    ['good night','Good Night! :night_with_stars: :zzz:']]
                for i in range (len(greetings_welcome)):
                    if msglow.startswith(greetings_welcome[i]) and msglow.find('bot') != -1:
                        await message.reply('Hi there!')
                #Greetings 2
                for i in range (len(greetings_daywish)):
                    if msglow.startswith(greetings_daywish[i][0]) and msglow.find('bot') != -1:
                        await message.reply(greetings_daywish[i][1])
            #Calculations channel
            elif message.channel.id == 952095676106412042:
                '''
                Calculations:
                1. Addition: +
                2. Subtraction: -
                3. Multiplication: *,x,X
                4. Division: /
                5. Modulus: %
                6. x to the power y: ^
                
                calcop = List of operators for calculations.
                '''
                calcop = ['+', #Index 0
                        '-', #Index 1
                        '*', #Index 2
                        'x', #Index 3
                        'X', #Index 4
                        '/', #Index 5
                        '%', #Index 6
                        '^'] #Index 7
                flag = -1
                for i in range (len(calcop)):
                    if msg.find(calcop[i]) != -1:
                        #flag = Flag variable, used to check if a condition was true atleast once.
                        flag = 0
                        msg = msg.split(calcop[i])
                        try:
                            exp1 = float(msg[0].strip())
                            exp2 = float(msg[1].strip())
                            await message.reply(str(calc(exp1,calcop[i],exp2)))
                        except ValueError:
                            msgout = await message.reply('Invalid expression. Run **%help** for help.'+msgdel3)
                            time.sleep(3)
                            await msgout.delete()
                            await message.delete()
                if flag == -1:
                    msgout = await message.reply('Invalid Syntax. Run **%help** for help.'+msgdel3)
                    time.sleep(3)
                    await msgout.delete()
                    await message.delete()

client.run(TOKEN)