try:
    l = [1,2]
    print(l[3])
except IndexError: # Single error
    print('test')
except (ValueError,IndentationError): # 2 Errors
    print('test 2')
except: # Catch all errors
    print('test 3')
else: # This block is executed if none of the exceptions occur.
    print('test 4')
