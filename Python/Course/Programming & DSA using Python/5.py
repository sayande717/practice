def findPos(ls,target):
    for index in ls:
        if target in ls:
            return (index+1)
    return -1
    
ls = [1,2,3]
target = 3
print(f'Position: {findPos(ls,target)}')