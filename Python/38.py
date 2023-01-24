def find_max(list):
    maxInteger = list[0]
    for index in list:
        if index > maxInteger:
            maxInteger = index
    return maxInteger


def find_min(list):
    minInteger = list[0]
    for index in list:
        if index < minInteger:
            minInteger = index
    return minInteger