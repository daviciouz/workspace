 #!/usr/bin/python

# Open a file
#anders = open("/home/stepsei/workspace/python/veronica.csv", "wb")
#print ("Name of the file: ", anders.name)

# Close opened file
#anders.close()


#!/usr/bin/python

# Open a file
anders = open("/home/stepsei/workspace/python/veronica.csv", "r+")
str = anders.read(10);
print("Read String is : ", str)

# Check current position
position = anders.tell();
print ("Current file position : ", position)

# Reposition pointer at the beginning once again
position = anders.seek(0, 0);
str = anders.read(10);
print("Again read String is : ", str)
# Close opened file
anders.close()



