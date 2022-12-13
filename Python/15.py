def convertWeight():
    weight = str(input('Enter weight in the format 99kg (for kg) or 99lb (for pounds): '))
    if weight.endswith('kg'):
        return f'{float(weight[:-2]) * 2.2046}lb'
    elif weight.endswith('lb'):
        return f'{float(weight[:-2]) / 2.2046}kg'
    return 'Wrong format'

print(convertWeight())