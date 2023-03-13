def insertionSort(arr):
    for limit in range(1,len(arr)):
        end = limit
        while end > 0:
            if arr[end] < arr[end-1]:
                arr[end],arr[end-1] = arr[end-1],arr[end]
            else:
                break
            end-=1

ls = [56,4,3,1]
insertionSort(ls)
print(ls)

