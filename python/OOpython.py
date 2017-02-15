# Import the time module.
# Create a time snapshot at the beginning of the program.
# Instantiate a large number of Student objects.
# Access the data inside each object.
# Take a time snapshot and subtract the original time.
# Display the time required to run the program 

import time

class Student:
    def __init__(self, name, age, major):
        self.name = name
        self.age = age
        self.major = major

    def is_old(self):
        return self.age > 100

start = time.clock()

for x in xrange(500000):
    s = Student('John', 23, 'Physics')
    print 'Student %s is %s years old and is studying %s' %(s.name, s.age, s.major)
    print 'Student is old? %d ' %(s.is_old())

stop = time.clock()

print stop - start