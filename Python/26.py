originalList = [2,2,4,6,3,4,6,1]
uniquesList = []
# Method 1
for element in originalList:
    if element not in uniquesList:
        uniquesList.append(element)
        
print(uniquesList)
        
originalList2 = [3,3,5,6,6,78,89,33]
uniquesList2 = []

# Method 2
for element in originalList2:
    try:
        uniquesList2.index(element)
    except ValueError:
        uniquesList2.append(element)

print(uniquesList2)