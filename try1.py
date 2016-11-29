from array import array
import random

def max_subarray(A):
    max_ending_here = max_so_far = A[0]
    for x in A[1:]:
        max_ending_here = max(x, max_ending_here + x)
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far

# def max_subarray(A):
#     max_ending_here = max_so_far = 0
#     for x in A:
#         max_ending_here = max(0, max_ending_here + x)
#         max_so_far = max(max_so_far, max_ending_here)
#     return max_so_far

myArray = [18, -209, 5, -100, 98, -2000]

# my_randoms=[]
myList=[]
for a in range(-1000000, 1000000):
    my_randoms = random.uniform(-1000000, 1000000)
    myList.append(my_randoms)



print(max_subarray(myArray))

print(myList)

print(max_subarray(myList))