import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            if (!nums.get(left).equals(nums.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome sol = new Palindrome();

        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(2);
        a.next.next.next = new ListNode(1);
        System.out.println(sol.isPalindrome(a));

        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        System.out.println(sol.isPalindrome(b));
    }
}