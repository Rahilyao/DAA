1) Problem
   We have a sorted list and we need to remove duplicates so each number appears only once. The list must stay sorted.
2) Approach
   j points to the last unique number I kept,i goes through the list. If nums[i] is different from nums[j], I move j forward and copy nums[i] to nums[j]. If it is the same, I just skip it. At the end, the part from 0 to j is the answer.
3) Time complexity
   O(n), where n is the number of elements.It goes through the list once.
4) Space complexity
   O(1) extra space, because there are only two indexes.
5) Reflection / Improvement
   This is already the best. One pass and constant extra memory.
   No better approach is needed.