# Write a recursive Python function that returns the sum of the first n integers.
# (Hint: The function will be similar to the factorial function!)

def sum_n(n):
    if n== 0:
        return 0
    else:
        return n + sum_n(n-1)

for i in range(1,10):
    print(sum_n(i))