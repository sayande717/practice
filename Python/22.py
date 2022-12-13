list = [4,5,3,1,6,54,88,3]
numberToBeSearched = 88
itemFound = False
for index in range(len(list)):
    if numberToBeSearched == list[index]:
        itemFound = True
        print(f'Item Found at position: {index+1}')
        break

if itemFound == False:
    print('Item not found')
