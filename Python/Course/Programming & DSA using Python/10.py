#1
def remdup(ls):
    targetIndex = len(ls)-1
    
    while targetIndex > 0:
        target = ls[targetIndex]
        for index in range(targetIndex):
            if ls[index] == target:
                ls[index] = None
                
        targetIndex-=1
    while None in ls:
        ls.remove(None)
    return ls

#2
def splitsum(l):
    sumOfSquares = 0
    sumOfCubes = 0
    for element in l:
        if element > 0:
            sumOfSquares = sumOfSquares + (element*element)
        elif element < 0:
            sumOfCubes = sumOfCubes + (element*element*element)
    return [sumOfSquares,sumOfCubes]

# 3: Flip a matrix
def matrixflip(inputMatrix,inputChoice='x'):
    outputMatrix = inputMatrix.copy()
    if inputChoice == 'h':
        for listElement in outputMatrix:
            length = len(listElement)
            for index in range(length//2):
                temp = listElement[index]
                listElement[index] = listElement[length-index-1]
                listElement[length-index-1] = temp

    elif inputChoice == 'v':
        length = len(outputMatrix)
        for index in range(length//2):
            temp = outputMatrix[index]
            outputMatrix[index] = outputMatrix[length-index-1]
            outputMatrix[length-index-1] = temp
    return outputMatrix
    
    
# Test Cases
print(remdup([3,5,7,5,3,7,10])) # 1
print(splitsum([1,3,-5])) # 2
print(matrixflip([[1, 2], [3, 4]],'h')) # 3
