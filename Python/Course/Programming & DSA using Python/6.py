def binarySearch(ls,start,end,target):
    mid = (start+end)//2
    if start>end:
        return -1
    elif ls[mid]==target:
        return (mid+1)
    elif ls[mid]<target:
        return binarySearch(ls,mid+1,end,target)
    elif ls[mid]>target:
        return binarySearch(ls,start,mid-1,target)

listToIterate = [1,2,13,56,10]
print(f'Position: {binarySearch(listToIterate,0,len(listToIterate)-1,56)}')