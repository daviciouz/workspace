# Think of a recursive version of the function f(n) = 3 * n, i.e. the multiples of 3
# Mathematically, we can write it like this:
# f(1) = 3,
# f(n+1) = f(n) + 3

def mult3(n):
    if n == 1:
        return 3    # Base Case
    else:
        return mult3(n-1) + 3   # Recursive Case

for i in range(1,10):
    print(mult3(i))