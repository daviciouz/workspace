# Python 3: Fibonacci series up to n
def fib(n):
     a, b = 0, 1
     while a < n:
       print(a, end=', \n')
     a, b = b, a+b
     
     print()
 

#0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987

fib(1000)
