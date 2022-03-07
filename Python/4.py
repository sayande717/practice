'''
Basic operations on lists.
1-D list: a = [1,2,3,4]
2-D list: b = [[1,2],[3,4],[5,6],[7,8]]

Operations:
Index related:
a[i]: Returns the element at index 'i'.
a[-1]: Returns the last element of the list.

Length related:
len(a): Returns the length of the list
len(b): Returns the total number of rows in list b.
len(b[0]): Returns the total number of columns in list b.

sorted(a): Sorts list 'a' in ascending order.
sorted(a, reverse=True): Sorts list 'a' in descending/reverse order.
'''

def list():
    #1-D List
    a = [1,3,2,4,6,5,8,7,10,9]
    #2-D List
    b = [[2,1],
        [4,3],
        [6,5],
        [8,7],
        [10,9],
        [12,11]]
    #This is same as b=[[2,1],[4,3][6,5],[8,7],[10,9],[12,11]]
    length = [len(a),len(b)]
    #Printing list 'a'
    for i in range (length[0]):
        print(a[i],end=' ')
    print('\n')
    
    #Printing list b
    for i in range (length[1]):
        for j in range (len(b[0])):
            print(b[i][j],end=' ')
        print()
    print()
    #Print sorted list
    a = sorted(a)
    for i in range (length[0]):
        print(a[i],end=' ')
    print()
    #Print reverse sorted list
    a = sorted(a, reverse=True)
    for i in range(length[0]):
        print(a[i],end=' ')
    print()

list()