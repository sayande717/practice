class Mammal:
    def walk(self):
        print('walk')

# Inheriting properties of class Mammal        
class Dog(Mammal):
    # If class is empty, use this keyword
    pass

class Cat(Mammal):
    pass

ob = Cat()
ob.walk()