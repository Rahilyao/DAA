class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        Intersection sol = new Intersection();

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode a = new ListNode(4);
        a.next = new ListNode(1);
        a.next.next = common;

        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(1);
        b.next.next.next = common;
        System.out.println(sol.getIntersectionNode(a, b).val);

        ListNode c = new ListNode(2);
        c.next = new ListNode(6);
        c.next.next = new ListNode(4);

        ListNode d = new ListNode(1);
        d.next = new ListNode(5);
        System.out.println(sol.getIntersectionNode(c, d));
    }
}