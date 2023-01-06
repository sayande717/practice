def calc1(a,b):
    return a*b

def calc2(a,b):
    print(a*b)
    
a = int(input('Enter 1st number: '))
b = int(input('Enter 2nd number: '))
# Will return the value
print(calc1(a,b))
# Will return 'None', which is like the 'null' data type in C++/Java.
print(calc2(a,b))