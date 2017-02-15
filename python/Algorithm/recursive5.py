# Write a function which implements the Pascal's triangle:
#       1
#     1    1
#   1    2    1
#   1    3    3    1
#   1    4    6    4    1
#   1    5    10    10    5    1

def pascal(n):
    if n == 1:
        return [1]
    else:
        line = [1]
        previous_line = pascal(n-1)
        for i in range(len(previous_line)-1):
            line.append(previous_line[i] + previous_line[i+1])
        line += [1]
    return line

print(pascal(6))