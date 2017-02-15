# Now we come to implement the factorial in Python. It's as easy and elegant as the mathematical definition.

# def factorial(n):
#    if n == 1:
#       return 1
#    else:
#        return n * factorial(n-1)

# We can track how the function works by adding two print() function to the previous function definition:

def factorial(n):
    print("factorial has been called with n = " + str(n))
    if n == 1:
        return 1
    else:
        res = n * factorial(n-1)
        print("intermediate result for ", n, " * factorial(",n-1, "): ",res)
        return res	

print(factorial(5))
