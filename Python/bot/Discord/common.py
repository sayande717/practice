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


def getStrMistake():
    return 'Wrong input! Please try again.'
