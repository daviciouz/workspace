# Write out the code for summing a list

def sum(list):
    if list == []:
        return 0
    return list[0] + sum(list[1:])

list = [3, 4, 5, 6, 7, 10]
print(sum(list))
