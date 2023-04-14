import random,math
def getRandomNumber(numberOfDigits=4) -> str:
    outNum = ''
    def getRandomDigit():
        return str(math.floor(random.random()*10))
    while len(outNum) < numberOfDigits:
        outNum = outNum + getRandomDigit()
    return outNum

print(getRandomNumber())