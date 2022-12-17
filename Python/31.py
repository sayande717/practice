def returnWrongFormat():
    return f'Wrong format!'

def unitTemperature(value,sourceParameter,destinationParameter):  
    temperatureList = [
        'celcius',
        'fahrenheit',
        'kelvin'
    ]
    Temperature = {
        temperatureList[0] : {
            temperatureList[0] : value,
            temperatureList[1] : value * (9/5) + 32,
            temperatureList[2] : value + 273.15
        },
        temperatureList[1] : {
            temperatureList[0]: value - 32 * (5/9),
            temperatureList[1]: value,
            temperatureList[2]: (5/9) * (value + 459.67)
        },  
        temperatureList[2] : {
            temperatureList[0]: value - 273.15,
            temperatureList[1]: value * (9*5) - 459.67,
            temperatureList[2]: value
        }
    }
    try:
        return f"Answer: {Temperature[sourceParameter][destinationParameter]}"
    except KeyError:
        returnWrongFormat()

def main():
    try:
        sourceUnit = str.lower(input('Enter source unit: '))
        destinationUnit = str.lower(input('Enter destination unit: '))
        value = float(input('Enter value: '))
    except ValueError:
        returnWrongFormat()
    else:
        print(unitTemperature(value,sourceUnit,destinationUnit))
        
main()
