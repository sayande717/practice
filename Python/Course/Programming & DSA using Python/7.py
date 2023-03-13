def selectionSort(ls):
    for start in range(len(ls)):
        minIndex = start
        for index in range(start,len(ls)):
            if ls[index] < ls[minIndex]:
                minIndex = index
        ls[start],ls[minIndex] = ls[minIndex],ls[start]

ls=[55,21,-19,8,70]
selectionSort(ls)
print(f'Sorted list: {ls}')