def returnShape(side,angle):
    if side==4 and angle==90:
        return "rectangle"
    elif side==3 and angle==60:
        return "triangle"
    return ' '
    
def main():
    print(returnShape(int(input('Enter side: ')),int(input('Enter angle: '))),end='\n')
    
main()