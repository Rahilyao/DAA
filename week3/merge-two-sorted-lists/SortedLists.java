class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class SortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        SortedLists sol = new SortedLists();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(4);
        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);
        ListNode result = sol.mergeTwoLists(a, b);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}