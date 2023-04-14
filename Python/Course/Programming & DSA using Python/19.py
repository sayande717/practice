# pass = Do nothing
try:
    num = int(input('Enter a number: '))
except ValueError:
    pass

l = [1,2,3,4]
print(len(l))
del(l[3]) # Remove the element at the 3rd index
print(len(l))