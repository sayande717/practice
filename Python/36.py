class Person:
    # Constructor
    def __init__(self,name):
        self.name = name
        
    def talk(self):
        print(f"{self.name} is talking!")
 
ob = Person('abcd')
ob.talk()
