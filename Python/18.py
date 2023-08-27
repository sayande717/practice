print('Car game!')
engineStatus = False
while(True):
    command = str.lower(input('> '))
    if command == 'help':
        print('\nMethod 1')
        print('---Help---\
              \nstart -> Start the car.\
              \nstop -> Stop the car.\
              \nquit/exit -> Quit the game.')

    elif command == 'start':
        if engineStatus == False:
            engineStatus = True
            print('Car started!')
        else:
            print('Car already started!')
    elif command == 'stop':
        if engineStatus == False:
            print('Car already stopped!')
        else:
            engineStatus = False
            print('Car stopped.')
    elif command == 'quit' or command == 'exit':
        # Exit the while loop.
        break
    else:
        print('Wrong command!')