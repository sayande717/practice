# Tuple: Immutable list
# Immutable: We cannot change the value of element in a tuple.
numbers = (1, 2, 3)

# numbers[0] = 10 # Will result in an error
print(numbers)

# Unpacking a tuple
coordinates = (33, 44, 55)
# Put coordinates[0] in x, coordinates[1] in y, coordinates[2] in z.
x, y, z = coordinates
print(f'X: {x}, Y: {y}, Z: {z}')
