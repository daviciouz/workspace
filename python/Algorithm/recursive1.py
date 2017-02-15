def countdown(i):
    print(i)
    if i <= 1:      # Base Case
        return
    else:
        countdown(i-1)  # Recursive Case