# Notes: 1
# L[-1] can be used to access the last item in a list.

#  list = ['larry', 'curly', 'moe']
#  if 'curly' in list:
#    print 'yay'

# NOTES 2
# squares = [1, 4, 9, 16]
# sum = 0
# for num in squares:
#    sum += num
#print sum  ## 30

# A recursive function to find the maximum number in a list

def max(list):
    if len(list) == 2:
        return list[0] if list[0] > list[1] else list[1]
    sub_max = max(list[1:])
    return list[0] if list[0] > sub_max else sub_max

# list = [3, 4, 5, 6, 7, 10, 17, 18, 13, 49, 58, 47, 937]
list = [2, 3]
print(max(list))