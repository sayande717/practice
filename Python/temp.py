# Code for counter
counterCheck = True
checkValue = 1
while counterCheck:
    inputValue = int(input('> '))
    if inputValue == checkValue:
        inputValue = inputValue + 1
        print(inputValue)
        checkValue = checkValue + 2
    else:
        counterCheck = False
