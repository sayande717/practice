# 1 - Incomplete
def primepartition(num):
    def isPrime(element):
        for i in range(2,element):
            if element%i == 0:
                return False
        return True
    numRange = num - 1
    for i in range(numRange,int(numRange/2),-1):
        if isPrime(i) and isPrime(num-i):
            return True
    return False

# 2 - Complete
def matched(inputString):
    bracketOpened = False
    for char in inputString:
        if char == '(':
            bracketOpened = True
            continue
        if bracketOpened:
            if char == ')':
                bracketOpened = False
    if bracketOpened == False:
        return True
    return False

# 3 - Complete
def rotatelist(inputList,count):
    for i in range(count):
        firstElement = inputList[0]
        inputList = inputList[1:]
        inputList.append(firstElement)
    return inputList




# Enter test cases here
# print(primepartition(185))
print(matched(str(input()))) # 2
# print(rotatelist([1,2,3,4,5],3)) # 3