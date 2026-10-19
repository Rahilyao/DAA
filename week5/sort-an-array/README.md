1) Problem
   We have an array of numbers and we need to sort it in ascending order without using built-in sort functions.
2) Approach
   I use merge sort.It works like this: I split the array into two halves,sort each half the same way, and then merge the two sorted halves into one sorted array.Splitting stops when a part has only one element,because one element is already sorted.
   To merge,I use a small temp array and compare the first elements of both halves, taking the smaller one each time.
3) Time complexity
   O(n log n), because the array is split in half log n times, and each level of splitting does O(n) work to merge.
4) Reflection / Improvement
   This is already good.Quick sort can also do O(n log n) but it is O(n)space in the worst case because of the recursion stack.