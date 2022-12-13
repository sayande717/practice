def binarySearch(array, elementToBeSearched):
    start = 0
    end = len(array)-1
    while (start <= end):
        mid = int(start+(end-start) / 2)
        if array[mid] < elementToBeSearched:
            start = mid + 1
        elif array[mid] > elementToBeSearched:
            end = mid - 1
        else:
            return mid
    return -1

def main():
    arr = []
    print('Make sure you enter a sorted array.')
    numberOfElements = int(input('Enter number of elements: '))
    
    for element in range(numberOfElements):
        element = arr.append(int(input(f'Enter element {element+1}: ')))

    elementToBeSearched = int(input('Enter the element to be searched: '))
    result = binarySearch(arr, elementToBeSearched)
    if result == -1:
        print('Element not found!')
    else:
        print(f'Element found at position: {result+1}')

main()