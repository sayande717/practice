def fiboSequence(n):
    a = 0
    b = 1
    print(f'{a} {b} ',end='')
    for i in range(2,n):
        c = a+b
        print(c,end=' ')
        a = b
        b = c

def fibo(n):
    if n == 0 or n == 1:
        return n
    
    return fibo(n-1)+fibo(n-2)


    



def memoizedFibo(n):
    fiboTable = {}
    # If the value is present in the list, return the value.
    # No need to re-compute the value.
    if fiboTable[n]:
        return fiboTable[n]
    if n == 0 or n == 1:
        return n
    # Compute the value
    value = fiboSequence(n-1)+fiboSequence(n-2)
    # Store the value in the dictionary
    fiboTable[n] = value

# Dynamic Programming    
fiboTable = {}

def dynamicFiboSequence(n):
    global fiboTable
    fiboTable[0] = 0
    fiboTable[1] = 1
    for iter in range(2,n):
        fiboTable[iter] = fiboTable[iter-1] + fiboTable[iter-2]

    return list(fiboTable.values())

def dynamicFiboValue(n):
    global fiboTable
    fiboTable[0] = 0
    fiboTable[1] = 1
    
    try:
        # Base case
        return fiboTable[n]
    except KeyError:
        fiboTable[n] = dynamicFiboValue(n-1)+dynamicFiboValue(n-2)

    return fiboTable[n]
    
print(dynamicFiboSequence(int(input('Enter number of elements to print: '))))