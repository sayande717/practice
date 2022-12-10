list = [2,3,4,6,3,56,22,10,0]
largest = list[0]
for item in list:
    if item > largest:
        largest = item

print(f'Largest element: {largest}')