def square(x):
    return x*x

def isEven(x):
    return (x%2==0)
# List Comprehension
# Find all the squares of x within the range (0-99), and only take the numbers which are even.

print([square(x) for x in range(100) if isEven(x)])