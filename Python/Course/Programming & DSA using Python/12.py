#1
def rainaverage(cityList):
    uniqueList = []
    outList = []
    for city in cityList:
        if city[0] not in uniqueList:
            uniqueList.append(city[0])
    for uniqueCity in uniqueList:
        sum,count = 0,0
        for originalCity in cityList:
            outCity = uniqueCity
            if originalCity[0] == uniqueCity:
                sum=sum+originalCity[1]
                count=count+1

        outAvg = sum/count
        outList.append((outCity,outAvg))
    return sorted(outList)

# 2
def listtype(l):
  return(type(l) == type([]))

def flatten(ls,outList = []):
    for element in ls:
        if listtype(element):
            flatten(element)
        else:
            outList.append(element)
    return outList


# def flatten(list_of_lists, flat_list=[]):
#     if flat_list == []:
#         return flat_list
#     else:
#         for item in list_of_lists:
#             if listtype(item):
#                 flatten(item)
#             else:
#                 flat_list.append(item)

#         return flat_list




        
            
# Test Cases
# print(rainaverage([('Bombay',848),('Madras',103),('Bombay',923),('Bangalore',201),('Madras',128)]))
print(flatten([1,2,[3],[4,[5,6]]])) # 2





