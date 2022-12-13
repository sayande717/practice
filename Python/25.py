numbers = [5, 2, 1, 7, 4]
# Insert the element at the end of the list
numbers.append(20)
# Insert the element at a specific position
# Syntax: insert(index,element)
numbers.insert(4, 50)
# Remove the last element
numbers.pop()
try:
    print(numbers.index(55))
except ValueError:
    print('Element not found!')
finally:
    print(numbers)
