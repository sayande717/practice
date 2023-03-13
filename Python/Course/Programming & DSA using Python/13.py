def divide(inputList):
    if len(inputList) == 1:
        return inputList
    mid = len(inputList)//2
    left = divide(inputList[:mid])
    right = divide(inputList[mid:])
    
    return conquer(left,right)

def conquer(inputLeft,inputRight):
    finalList = []
    leftIndex,rightIndex,finalIndex = 0,0,0
    while finalIndex <= (leftIndex+rightIndex)+1:
        if inputLeft[leftIndex] <= inputRight[rightIndex]:
            finalList.append(inputLeft[leftIndex])
            leftIndex+=1
            
        elif inputLeft[leftIndex] > inputRight[rightIndex]:
            finalList.append(inputRight[rightIndex])
            rightIndex+=1
            
        elif leftIndex < len(inputLeft):
            finalList.append(inputLeft[leftIndex])
            leftIndex+=1
            
        elif rightIndex < len(inputRight):
            finalList.append(inputRight[rightIndex])
            rightIndex+=1
            
        finalIndex+=1
    return finalList

print(divide([5,4,3,2,1]))