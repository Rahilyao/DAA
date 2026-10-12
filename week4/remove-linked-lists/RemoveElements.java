class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveElements sol = new RemoveElements();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(6);
        a.next.next.next = new ListNode(3);
        a.next.next.next.next = new ListNode(4);
        a.next.next.next.next.next = new ListNode(5);
        a.next.next.next.next.next.next = new ListNode(6);

        ListNode r1 = sol.removeElements(a, 6);
        while (r1 != null) {
            System.out.print(r1.val + " ");
            r1 = r1.next;
        }
        System.out.println();
        ListNode b = new ListNode(7);
        b.next = new ListNode(7);
        b.next.next = new ListNode(7);
        ListNode r2 = sol.removeElements(b, 7);
        System.out.println(r2);
    }
}