correctNumber = 9
counter = 0
guessIsCorrect = False
while counter < 3:
    guess = int(input('Guess: '))
    counter = counter + 1
    if (guess == correctNumber):
        print("Correct guess, you win!")
        guessIsCorrect = True
        break
# Runs if while loop completes and break isn't encountered.
else:
    print("Wrong guess!")
