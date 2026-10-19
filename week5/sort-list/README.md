1) Problem
   We have a linked list.We need to sort it in ascending order.
2) Approach
   I copy all values from the list into an array.Then I sort the array.After that I go through the list again and put the sorted values back into the nodes. The list structure stays the same, only the values change.
3) Time complexity
   O(n log n), because sorting the array takes O(n log n) time. Copying the values takes O(n), but that is smaller.
4) Reflection / Improvement
   This solution is easy to write and easy to understand.I use a built-in sort,so I don't need to write merge sort or quick sort by hand.The list structure stays the same,I only replace the values.The only cost is that I need extra memory to store the values.