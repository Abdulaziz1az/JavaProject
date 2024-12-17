class Student:
    def __init__(self, firstName, lastName, age):
        self.firstName = firstName
        self.lastName = lastName
        self.age = age
    
    def getFirstName(self):
        return self.firstName
    
    def getLastName(self):
        return self.lastName
    
    def getAge(self):
        return self.age
    
    def setFirstName(self, firstName):
        self.firstName = firstName
    
    def setLastName(self, lastName):
        self.lastName = lastName
    
    def setAge(self, age):
        self.age = age
        
student = Student("Az",  "Am", 21)
print(student.firstName)
print(student.lastName)
print(student.getAge())     
student.setAge(22)
print(student.getAge())   