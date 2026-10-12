1) Problem
   We have two linked lists.They may share some nodes at the end(the same nodes, not just the same values). We need to return the first shared node, or null if they don't share anything.
2) Approach
   There are two pointers, one for each list. They walk step by step.When a pointer reaches the end of its list, I move it to the head of the other list. So both pointers walk the same total distance. If the lists share a node, the pointers meet at that node. If they don't share anything, both become null at the same time and the loop ends.
3) Time complexity
   O(m + n), where m and n are the lengths of the two lists.Each pointer walks at most m + n steps.
4) Space complexity
   O(1), because I only use two pointers.
5) Reflection / Improvement
   This is the best approach. Another way is to find the lengths first and then align the pointers, but that also takes O(m + n) time and O(1) space. This way is simpler because we don't need to count lengths.