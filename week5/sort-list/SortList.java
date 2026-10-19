import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            nums.add(current.val);
            current = current.next;
        }

        Collections.sort(nums);
        current = head;
        for (int x : nums) {
            current.val = x;
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SortList sol = new SortList();
        ListNode a = new ListNode(4);
        a.next = new ListNode(2);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(3);

        ListNode r1 = sol.sortList(a);
        while (r1 != null) {
            System.out.print(r1.val + " ");
            r1 = r1.next;
        }
        System.out.println();

        ListNode b = new ListNode(-1);
        b.next = new ListNode(5);
        b.next.next = new ListNode(3);
        b.next.next.next = new ListNode(4);
        b.next.next.next.next = new ListNode(0);

        ListNode r2 = sol.sortList(b);
        while (r2 != null) {
            System.out.print(r2.val + " ");
            r2 = r2.next;
        }
    }
}