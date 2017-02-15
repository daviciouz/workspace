# A recursive function to count the number of items in a list

def count(list):
    if list == []:
        return 0
    return 1 + count(list[1:])

list = [3, 4, 5, 6, 7, 10]
print(count(list))