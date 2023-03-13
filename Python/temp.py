ls = []

bookStart,borrowerStart,checkoutStart,itemCount = 0,0,0,0

while True:
    inputString = str(input())
    
    if inputString == 'Books':
        bookStart = itemCount
    elif inputString == 'Borrowers':
        borrowerStart = itemCount
    elif inputString == 'Checkouts':
        checkoutStart = itemCount
    elif inputString == 'EndOfInput':
        break
    else: 
        ls.append(inputString)
        itemCount = itemCount + 1
bookList = ls[bookStart:borrowerStart]
borrowerList = ls[borrowerStart:checkoutStart]
checkoutList = ls[checkoutStart:itemCount]

for item in checkoutList:
    # SLY2304~DMT-002~2019-03-27
    checkoutAttList = item.split('~')
    



# l=[]
# due_date=[]
# full_name=[]

# while True:
#     x=input()
#     l.append(x)
#     if x=="EndOfInput":
#             inde=l.index("Books")
#             inde2=l.index("Borrowers")
#             inde3=l.index("Checkouts")
#             l1=l[inde:inde2:1]
#             l2=l[inde2:inde3:1]
#             l3=l[inde3:len(l)-1:1]
#             d1={l1[0]:l1[1::]}
#             d2={l2[0]:l2[1::]}
#             d3={l3[0]:l3[1::]}
#             break


# for e in d3.values():
#     for j in e:
#         x=j.split("~")
#         x1=x[0] 
#         x2=x[2] 
#         for e1 in d2.values():
#             for j1 in e1:
#                 xx=j1.split("~")
#                 xx1=xx[1]  
#                 if x1 in xx[0]:
#                     due_date.append(x2)
#                     full_name.append(xx1)

# asscnu_title=[]
# for e in d3.values():
#     for j in e:
#         x2=j.split("~")
#         x2=x2[1]  
#         for e1 in d1.values():
#             for j1 in e1:
#                 if x2 in j1:
#                     asscnu_title.append(j1)   

# full_names=[]

# for e in full_name:

#     full_names.append("~{}".format(e))

# asscnu_titles=[]

# for e in asscnu_title:
#     asscnu_titles.append("~{}".format(e))

# final=zip(due_date,full_names,asscnu_titles)

# final=list(final)

# final.sort()

# for e in final:

#     print("".join(e))