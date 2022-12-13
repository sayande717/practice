def returnWords(number):
    numberDictionary = {
        0:'zero',
        1:'one',
        2:'two',
        3:'three',
        4:'four',
        5:'five',
        6:'six',
        7:'seven',
        8:'eight',
        9:'nine'
    }
    return f"{numberDictionary.get(number,'!')}"
def main():
    inputElement = str(input('Enter a number: '))
    for number in inputElement:
        print(returnWords(int(number)),end=' ')
    print()
main()