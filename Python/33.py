def convertEmoji(string):
    emojiDB = {
        ":)" : "😊",
        ":(" : "☹️",
        ":'(": "😭"
    }
    return emojiDB.get(string,None)

print(f"Emoji: {convertEmoji(str(input('> ')))}")
