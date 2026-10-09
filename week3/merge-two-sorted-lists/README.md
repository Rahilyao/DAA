1) Problem
   We have two sorted linked lists, and we need to merge them into one sorted list so we should reuse the same nodes, not create new ones.
2) Approach
   I go through both lists at the same time. Each step I look at the first node of each list and take the smaller one. I put it at the end of the result. I start with a dummy node so I don't need special code for the first node. When one list ends, I just attach the rest of the other list, because it is already sorted.
3) Time complexity
   O(n + m), where n and m are the lengths of the two lists.Because the while loop runs at most n + m times, one node per step (no nested loops)
4) Space complexity
   O(1), because I don't create new nodes, I just move the next pointers around.
5) Reflection / Improvement
   This is already the best solution. I could write it recursively, but that would use O(n + m) stack memory, so it's worse.