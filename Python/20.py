printF = [5, 2, 5, 2, 2]
printL = [2, 2, 2, 2, 6]
# Method 1
for iterations in printF:
    print('x' * iterations)

print()

# Method 2
for iterations in printF:
    for printx in range(iterations+1):
        print('x', end='')
    print()

print()

for iterations in printL:
    print('x' * iterations)
