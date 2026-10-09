class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedLists {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedLists sol = new LinkedLists();

        ListNode a = new ListNode(3);
        a.next = new ListNode(2);
        a.next.next = new ListNode(0);
        a.next.next.next = new ListNode(-4);
        a.next.next.next.next = a.next;
        System.out.println(sol.hasCycle(a));
        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        System.out.println(sol.hasCycle(b));
    }
}