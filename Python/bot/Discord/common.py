import math, random

# Master String Database
def getString(channelID, channelProperty=''):
    scopeDB = {
        #Scope: Bot
        'bot':{
            'commands':'bot commands',
            'code':'bot code'
        },
        # Scope: Guild members
        'human':{
            'chat': {
                'general':'general chat',
                'specific':'related chat'
            }
        }
    }
    stringDB = {
    # Scope: All channels, Channel ID = 0
        0: {
            'mistake': 'Wrong input! Please try again.'
        },
    # Scope: Specific channel
    # Category: Ask the Bot!
        # channel: #calculations
        952095676106412042: {
            'scope': str.title(scopeDB['bot']['commands']),
            'description': 
                'Perform calculations here!\
                \n Types of operations supported: \
                \n I. Basic Calculations: \
                \n> [+,-,*,/,%] \
                \n> Example: 2+4 , 4*7 , 5x2\
                \n II. Advanced Calculations: \
                \n> [log,sin,cos,tan] \
                \n> Example: log 2 , pow 2,4 \
                '
        },
        # channel: #unit-conversion
        985990030570975262: {
            'scope': str.title(scopeDB['bot']['commands']),
            'description':
                'Perform unit conversion here!\
                \nCurrently, these units are supported: [temperature]'
        },
        # channel: #random-number
        1096372904402358282: {
            'scope': str.title(scopeDB['bot']['commands']),
            'description':
                'Generate random numbers! \
                \n> Number of digits must be `atmost 2000`. \
                \n Syntax: `$gen <number-of-digits>` \
                \n Example: `$gen 5` will generate a random **5 digit** number.'
        },
        
    # Category: Bot Code Testing
        # channel: #test-zone
        994965043588370525: {
            'scope': f"{str.title(scopeDB['bot']['commands'])} | {str.title(scopeDB['human']['chat']['specific'])}",
            'description':
                'This channel is for testing new/modified bot code.'
        },
        # channel: #code-suggestions
        994965065545547786: {
            'scope': str.title(scopeDB['human']['chat']['specific']),
            'description': 'Suggestions for improving the bot code are welcome!'
        }
    }
    
    return stringDB[channelID][channelProperty]

# $calc f
# For Calculations
def getCalcResult(arg1, arg2):
    # Input: arg1
    # Scope: number1 + number2 | ... [+,-,*,/,%]
    # Example: 2+4,2%4
    if arg2 == '':
        try:
            return eval(arg1)
        except SyntaxError or NameError:
            # For the multiplication part
            # Scope: number1 x number2 | number1 X number2
            # Example: 2x4 | 2X4
            expression = str.lower(arg1).split('x')
            if len(expression) == 2:
                return eval(f'{expression[0]}*{expression[1]}')
            return False

    # Input: arg1,arg2
    else:
        # Scope: operator number | operator number1,number2
        # Example: log 2 | pow 2,4
        numbersInArg2 = arg2.split(',')

        # Scope: operator number
        # Example: log 4.5 | sin 4.5 | cos 4.5
        if len(numbersInArg2) == 1:
            number = float(numbersInArg2[0])
            operatorDB1 = {
                'log': math.log(number),
                'sin': math.sin(number),
                'cos': math.cos(number),
                'tan': math.tan(number)
            }
            return operatorDB1.get(arg1)

        # Scope: operator number1,number2
        # Example: pow 2,4 | root 2,4
        else:
            number1 = float(numbersInArg2[0])
            number2 = float(numbersInArg2[1])
            operatorDB2 = {
                'pow': math.pow(number1, number2),
                'root': math.pow(number1, 1/number2)
            }
            return operatorDB2.get(arg1)

def getRandomNumber(numberOfDigits=4) -> str:
    outNum = ''
    def getRandomDigit():
        return str(math.floor(random.random()*10))
    # Check if the number of Digits entered is a valid number.
    
    while len(outNum) < numberOfDigits and numberOfDigits<=2000:
        outNum = outNum + getRandomDigit() 
    return outNum