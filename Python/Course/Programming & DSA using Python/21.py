def nextPermutation(inputList):
    
    # Helper function swap
    def swap(arr,i,j):
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        
    # Helper function reverse
    def reverseList(inputList):
        start = 0
        end = len(inputList)-1
        while start < end:
            temp = inputList[start]
            inputList[start] = inputList[end]
            inputList[end] = temp
            start = start + 1
            end = end - 1
        return inputList

    index1 = 0
    
    # Finding index 1
    currentIndex = len(inputList) - 2
    while(currentIndex >= 0):
        if inputList[currentIndex] < inputList[currentIndex+1]:
            index1 = currentIndex
            break
        else:
            currentIndex = currentIndex - 1
    
    # Finding index 2
    index2 = index1
    currentIndex = len(inputList) - 1
    while(currentIndex > index1):
        if inputList[currentIndex] > inputList[index1]:
            index2 = currentIndex
            break
        else:
            currentIndex = currentIndex - 1
    
    # print(f'{index1},{index2}')
    swap(inputList,index1,index2)
    
    return inputList[:index1+1]+reverseList(inputList[index1+1:])


print(nextPermutation(['e','i','b','j','d','h','g','f','c','a']))