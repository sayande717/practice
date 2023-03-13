# [1,2,3,6] - [2,4,6,8] = [1,3]

def difference(list1,list2):
    finalList = []
    for element in list1:
        if element not in list2:
            finalList.append(element)
    return finalList

print(difference([1,2,3,6],[8,4,6,2]))