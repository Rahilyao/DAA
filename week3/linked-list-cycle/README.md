1) Problem
   We have a linked list. We need to check if it has a cycle.A cycle means some node repeats if we keep going by next.We should try to use O(1) memory.
2) Approach
   I use two pointers, slow and fast. Both start at the head. Slow moves 1 node per step. Fast moves 2 nodes per step. If there is no cycle, fast reaches null and I return false. If there is a cycle, fast will catch up to slow, and when they are the same node I return true.
3) Time complexity
   O(n), where n is the number of nodes. Without a cycle, fast goes through the list in about n/2 steps. With a cycle, the pointers meet in at most n steps.
4) Space complexity
   O(1), because I only use two pointers.
5) Reflection / Improvement
   This is already optimal for memory. Another way is to save visited nodes in a HashSet, but that uses O(n) memory, so it is worse.