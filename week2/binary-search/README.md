1) Problem
We need to find a target number in a sorted array and return its index. If the number is not in the array, we return -1.
2) Approach
I used binary search because the array is already sorted, so we don't need to check every element one by one. I made two pointers, left and right, that start at the beginning and end of the array. Then I need to use middle to find a target. 
3) Time complexity
Every time we go through the loop we cut the array in half finding out is it on the left side or the right side. So it's O(log n).
4) Space complexity
There's no any new arrays or data structures, just simple variables, so still O(1).
5) -I don't have any ideas about any improvements