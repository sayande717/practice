'''
Function to demonstrate:
1. String conversion to:
a. Lowercase
b. Uppercase
c. Title case

2. Variations of the print() function.
By default, print('str') function adds '\n' after 'str' ie the cursor moves to a new line after printing 'str'.
To avoid this, we can use the 'end' parameter.
Ex. print('str',end='\t')
This replaces the end character from the default '\n' to '\t'.
'''
def strprint():
    str=['abcd','efgh','ijkl']
    #Lowercase
    print('Lowercase:',str[0].lower())
    #Uppercase
    print('Uppercase:',str[1].upper())
    #Title case
    print('Titlecase:',str[2].title())
    #Print all the elements in one line.
    for i in range (len(str)):
        print(str[i],end=' ')
    print()

'''
3. Variations of the 'for' loop: 
1. for i in range (a,b,c)
a = The initial value (included). Default = 0
b = The final value (excluded, ex. if b is 10 then loop will run till 10-1 = 9)
c = i will be incremented by this value. Default = 1
Ex. If c = 4 & b = 12 then i = (1,4,10)
Note: a,c may not be present in the definition.
'''

def forloop():
    #Only b provided.
    for i in range (10):
        print(i,end =' ')
    print()
    #Only a,b provided.
    for i in range (0,6):
        print(i,end =' ')
    print()
    #All values provided.
    for i in range (1,10,2):
        print(i,end =' ')
    print()

#Run the functions
strprint()
forloop()