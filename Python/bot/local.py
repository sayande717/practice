import discord,os,time,math
from dotenv import load_dotenv

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
        run_help = Run %help for help.
        '''
        msg = message.content
        msglow = msg.lower()
        msgdel3 = '\n\nThis message will be auto-deleted in 3 seconds.'
        msgdel10 = '\n\nThis message will be auto-deleted in 10 seconds.'
        run_help = ' Run **%help** for help.'

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
            elif message.channel.id == 985990030570975262:
                botmsg = await message.reply(helpstart+"Channel: **#unit-conversion**\nAvailable units:-\n**1**. Temperature :thermometer:\n\t**a**. Celcius > Fahrenheit, **b**. Fahrenheit > Celcius\n\t**c**. Kelvin > Celcius, **d**. Celcius > Kelvin\n\t**e**. Fahrenheit > Kelvin, **f**. Kelvin > Fahrenheit\n\n**2**. Number Systems :1234:\n\t**a**. Binary > Decimal, **b**. Decimal > Binary\n\n**3**. Weights :scales:\n\t**a**. Kilogram > Gram, **b**. Gram > Kilogram\n\t**c**. Kilogram > Ton (Metric), **d**. Ton (Metric) > Kilogram\n\t**e**. Kilogram > Pound, **f**. Pound > Kilogram\n\t**g**. Kilogram > Ounce (oz), **h**. Ounce (oz) > Kilogram\n\nSyntax: <main parameter>.<sub parameter> <value>.\nUsage: **1.a 100** converts the value '**100**' from **Celcius** to **Fahrenheit**."+msgdel10)
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
                for i in range (len(calcop)):
                    if msg.find(calcop[i]) != -1:
                        try:
                            ans=''
                            flag = 0
                            msg = msg.split(calcop[i])
                            exp1 = float(msg[0].strip())
                            exp2 = float(msg[1].strip())
                            op = calcop[i]
                            if op == '+':
                                ans = exp1 + exp2
                            elif op == '-':
                                ans =  exp1 - exp2
                            elif op == '*' or op == 'x' or op == 'X':
                                ans = exp1 * exp2
                            elif op == '/':
                                if exp2 == 0:
                                    flag = 1
                                    ans = 'Cannot divide a number by zero.'
                                else:
                                    div = int(exp1//exp2)
                                    rem = int(exp1%exp2)
                                    if rem == 0:
                                        ans = div
                                    else:
                                        ans = str(div) + '\nRemainder = ' + str(rem)
                            elif op == '%':
                                ans = int(exp1 % exp2)
                        except ValueError:
                            msgout = await message.reply('Invalid Syntax.'+run_help+msgdel3)
                            time.sleep(3)
                            await msgout.delete()
                            await message.delete()
                        if flag == 0:
                            msgout = 'Answer = '+str(ans)
                            await message.reply(msgout)

            elif message.channel.id == 985990030570975262:
                '''
                Unit Conversion:
                1. Temperature:
                    1.a - Celcius > Fahrenheit
                    1.b - Fahrenheit > Celcius

                    1.c - Kelvin > Calcius
                    1.d - Celcius > Kelvin

                    1.e - Fahrenheit > Kelvin
                    1.f - Kelvin > Fahrenheit
                2. Number Systems:
                    2.a - Binary > Decimal
                    2.b - Decimal > Binary
                
                3. Weight:
                    3.a - Kilogram > Gram
                    3.b - Gram > Kilogram
                    3.c - Kilogram > Ton (Metric)
                    3.d - Ton (Metric) > Kilogram
                    3.e - Kilogram > Pound
                    3.f - Pound > Kilogram
                    3.g - Kilogram > Ounce (oz)
                    3.h - Ounce (oz) > Kilogram
                '''
                try:
                    '''
                    split_1 = Splits the original message into 2 parts:
                    0. <main parameter>.<sub parameter>
                    1. value
                    split_2 = Splits the parameters into 2 parts:
                    0. main parameter
                    1. sub parameter
                    '''
                    split_1 = msg.split(' ')
                    split_2 = split_1[0].split('.')
                    parameter1 = int(split_2[0])
                    parameter2 = split_2[1]
                    value = float(split_1[1])
                    flag=0
                    convert_from = ''
                    convert_to = ''
                    unit = ''
                    ans = ''
                    #Temperature
                    if parameter1 == 1:
                        #Celcius > Fahrenheit
                        if parameter2 == 'a':
                            convert_from = 'Celcius'
                            convert_to = 'Fahrenheit'
                            unit = 'F'
                            ans = (value*1.8)+32.0
                        #Fahrenheit > Celcius
                        elif parameter2 == 'b':
                            convert_from = 'Fahrenheit'
                            convert_to = 'Celcius'
                            unit = "'C"
                            ans = (value-32)/1.8
                        #Kelvin > Celcius
                        elif parameter2 == 'c':
                            convert_from = 'Kelvin'
                            convert_to = 'Celcius'
                            unit = "'C"
                            ans = value - 273.15
                        #Celcius > Kelvin
                        elif parameter2 == 'd':
                            convert_from = 'Celcius'
                            convert_to = 'Kelvin'
                            unit = 'K'
                            ans = value + 273.15
                        #Fahrenheit > Kelvin
                        elif parameter2 == 'e':
                            convert_from = 'Fahrenheit'
                            convert_to = 'Kelvin'
                            ans = (value-32)/1.8 + 273.15
                        #Kelvin > Fahrenheit
                        elif parameter2 == 'f':
                            convert_from = 'Kelvin'
                            convert_to = 'Fahrenheit'
                            ans = (value-273.15) * 1.8 + 32
                        else:
                            flag=1
                    #Number Systems
                    elif parameter1 == 2:
                        #Binary > Decimal
                        if parameter2 == 'a':
                            convert_from = 'Binary'
                            convert_to = 'Decimal'
                            sum = 0
                            exponent_2 = 0
                            while value != 0:
                                mod = value % 10
                                sum = sum+(mod*math.pow(2, exponent_2))
                                exponent_2 = exponent_2+1
                                value = value//10
                                ans = int(sum)
                        #Decimal > Binary
                        elif parameter2 == 'b':
                            convert_from = 'Decimal'
                            convert_to = 'Binary'
                            while value != 0:
                                rem = int(value % 2)
                                ans=str(rem)+ans
                                value=value//2
                        else:
                            flag=1
                    elif parameter1 == 3:
                        #Kilogram to Gram
                        if parameter2 == 'a':
                            convert_from = 'Kilogram'
                            convert_to = 'Gram'
                            unit = 'g'
                            ans = value * 1000
                        #Gram to Kilogram
                        elif parameter2 == 'b':
                            convert_from = 'Gram'
                            convert_to = 'Kilogram'
                            unit = 'kg'
                            ans = value / 1000
                        #Kilogram > Ton (Metric)
                        elif parameter2 == 'c':
                            convert_from = 'Kilogram'
                            convert_to = 'Ton (Metric)'
                            unit = 't'
                            ans = value * 0.001
                        #Ton (Metric) > Kilogram
                        elif parameter2 == 'd':
                            convert_from = 'Ton (Metric)'
                            convert_to = 'Kilogram'
                            unit = 'kg'
                            ans = value * 1000
                        #Kilogram > Pound
                        elif parameter2 == 'e':
                            convert_from = 'Kilogram'
                            convert_to = 'Pound'
                            unit = 'lb'
                            ans = value * 2.2046226218
                        #Pound > Kilogram
                        elif parameter2 == 'f':
                            convert_from = 'Pound'
                            convert_to = 'Kilogram'
                            unit = 'kg'
                            ans = value * 0.45359237
                        #Kilogram > Ounce (oz)
                        elif parameter2 == 'g':
                            convert_from='Kilogram'
                            convert_to='Ounce (oz)'
                            unit = 'oz'
                            ans = value * 35.2739619496
                        #Kilogram > Ounce (oz)
                        elif parameter2 == 'h':
                            convert_from = 'Ounce (oz)'
                            convert_to = 'Kilogram'
                            unit = 'kg'
                            ans = value * 0.0283495231
                        else:
                            flag=1
                    else:
                        flag=1
                except ValueError:
                    msgout = await message.reply('Invalid Syntax.'+run_help)
                    time.sleep(3)
                    await msgout.delete()
                    await message.delete()
                if flag == 0:
                        msgout = 'Converting from '+'**{}**'.format(convert_from)+' to '+'**{}**'.format(convert_to)+' :arrows_clockwise:\nAnswer -> ' + str(ans) + unit
                        await message.reply(msgout)
                elif flag == 1:
                    msgout = await message.reply('Invalid Expression.'+run_help)
                    time.sleep(3)
                    await msgout.delete()
                    await message.delete()

client.run(TOKEN)