'''
Try-Except block
A try-except block is used to catch errors. It ensures that the program keeps running even after an error has occured.
When an error is found but an 'except' block has already been defined for that particular error, the except block is executed and the rest of the program keeps running as usual.'''

try:
    #The try block will detect errors in this block.
    a = 1
    b = '2'
    c = 5
    print (a+b+c,end='')

except TypeError:
    #Statements in this block will run if a 'TypeError' is detected.
    print('TypeError')
except ValueError:
    #Statements in this block will run if a 'ValueError' is detected.
    print('ValueError')