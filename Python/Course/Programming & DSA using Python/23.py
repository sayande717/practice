class Node:
    def __init__(self,initval=None):
        self.value = initval
        self.next = None
        
    def isEmpty(self):
        return (self.value == None)
    
    # Insert element at the end
    def appendIterative(self,val):
        if(self.isEmpty()):
            self.value = val
            return
        
        temp = self
        while temp.next != None:
            temp = temp.next
        newnode = Node(val)
        temp.next = newnode
        return
    
    def appendRecursive(self,val):
        if self.value == None:
            return
        if self.next == None:
            newnode = Node(val)
            self.next = newnode
            return
        (self.next).appendRecursive(val)
        
    # Insert element at beginning
    def insertAtHead(self,val):
        if self.value == None:
            self.value = val
        newnode = Node(val)
        (newnode.value,self.value) = (self.value,newnode.value)
        (self.next,newnode.next) = (newnode,self.next)
        
    # Delete a particular node
    def deleteIterative(self,val):
        if(self.isEmpty()):
            return
        if self.value == val:
            if self.next == None:
                self.value = None
            else:
                self.value = self.next.value
                self.next = self.next.next
                
        temp = self
        
        try:
            while temp.next.value != val:
                temp = temp.next
        except AttributeError:
            return
        
        temp.next = temp.next.next
        
    # Print the linked list
    def printList(self):
        outList = []
        if self.value == None:
            return outList

        currentNode = self
        outList.append(currentNode.value)
        while currentNode.next != None:
            currentNode = currentNode.next
            outList.append(currentNode.value)
        return outList

l = Node()
for element in range(5):
    l.appendIterative(element)

print(l.printList())
l.deleteIterative(5)
    
print(l.printList())
