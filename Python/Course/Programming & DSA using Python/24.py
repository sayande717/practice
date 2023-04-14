class Node:
    def __init__(self,val=None):
        self.val = val
        if self.val:
            self.left = Node()
            self.right = Node()
        else:
            self.left = None
            self.right = None
    def isEmpty(self):
        return (self.val == None)
    
    def findValue(self,searchVal):
        if self.isEmpty():
            return False
        
        if searchVal < self.val:
            return self.left.findValue(searchVal)
        elif searchVal > self.val:
            return self.right.findValue(searchVal)
        else:
            return True

    def findMin(self):
        if self.isEmpty():
            return
        minVal = self
        while self.left != None:
            minVal = minVal.left
        return minVal.val

    def findMax(self):
        if self.isEmpty():
            return
        maxVal = self
        while self.right != None:
            maxVal = maxVal.right
        return maxVal.val

    def findMinRecursive(self):
        if self.isEmpty():
            return
        if self.left == None:
            return self.val
        
        return self.left.findMinRecursive()
    
    def findMaxRecursive(self):
        if self.isEmpty():
            return
        if self.right == None:
            return self.val
        
        return self.right.findMaxRecursive()
    
    def insertValue(self,val):
        if self.isEmpty():
            self.val = val
            self.left = Node()
            self.right = Node()
        
        if self.left.val == None:
            self.left.val = val
            
        if self.right.val == None:
            self.right.val = val

        if val < self.val:
            return self.left.insertValue(val)
        if val > self.val:
            return self.right.insertValue(val)