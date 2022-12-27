import math


def getStrMistake():
    return 'Wrong input! Please try again.'


def getChannelID(category, channel):
    channelDB = {
        'Ask The Bot!': {
            'calculations': 952095676106412042,
            'unit-conversion': 985990030570975262
        },
        'LoFi Zone! 🎶': {
            'lofi-bot-command-zone': 1052898474254938194
        },
        'Friends ✨': {
            'chat': 944823325450977332
        },
        'Bot Code Testing': {
            'test-zone': 994965043588370525,
            'code-suggestions': 994965065545547786
        },
        'Self': {
            'commands': 940487185973530655,
            'announcements': 982255693748908062
        }
    }
    try:
        return channelDB[category][channel]
    except KeyError:
        return 0

# For Calculations


def getMathResult(arg1, arg2):
    # Input: arg1
    # Scope: number1 + number2 | ... [+,-,*,/,%]
    # Example: 2+4,2%4
    if arg2 == '':
        try:
            return eval(arg1)
        except SyntaxError:
            # For the multiplication part
            # Scope: number1 x number2 | number1 X number2
            # Example: 2x4 | 2X4
            expression = str.lower(arg1).split('x')
            if len(expression) == 2:
                return eval(f'{expression[0]}*{expression[1]}')
            # ERROR: Expression / Argument is invalid.
            else:
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
