1) Problem
   We have a linked list. We need to check if it reads the same forwards and backwards, like a palindrome.
2) Approach
   We copy all values from the list into an array. Then we should use two pointers, one at the start and one at the end. We compare them and move them towards each other. If any pair is different, we need to return false. If all pairs match, we return true.
3) Time complexity
   O(n), where n is the number of nodes.We go through the list once to copy, and one more time to compare.
4) Space complexity
   O(n), because we store all values in an array.
5) Reflection / Improvement
   A better version can use O(1) space. It finds the middle of the list, reverses the second half, and then compares the two halves. It is faster in memory but the code is longer and harder to read.