# Seem to be giving 6 for different inputs

def findSmallest(arr):
    smallest = arr[0]
    smallest_index = 0
    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i

    return smallest_index

# arr = [5, 6, 7, 2, 3, 4, 1, 10]

print(findSmallest([5, 10, 12, 14, 15, 6, 3]))