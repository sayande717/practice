class Point:
    # self = Reference to the current object
    # Constructor
    def __init__(self,x,y):
        self.x = x
        self.y = y
        
    def move(self):
        print('move')
    def draw(self):
        print('draw')


ob = Point(10,20)
ob.move()
ob.draw()

print(ob.x," ",ob.y)