1) Problem
   We have a linked list and a number val. We need to remove all nodes that have this value, and return the new head.
2) Approach
   We use a dummy node before the head. This way, even if the head itself needs to be removed, we don't need special code for it. We keep a pointer called current starting at dummy. While current.next is not null, we should check current.next.val. If it equals val, we skip that node by doing current.next = current.next.next. If it is different, we should move current forward. At the end we return dummy.next.
3) Time complexity
   O(n), where n is the number of nodes. We go through the list once.
4) Space complexity
   O(1), because we only use one extra pointer and a dummy node.
5) Reflection / Improvement
   The dummy node makes the code clean even when the head is removed.