package tm.bgb.javaholic.easy;

import lombok.Data;

public class IterativelyReverseSingleLinkedList {

    static void main() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(head));
    }

    // note: option 1
    // time complexity: O(n)
    // space complexity: O(n)
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newNext = null;
        while (head.next != null) {
            ListNode current = new ListNode(head.val, newNext);
            newNext = new ListNode(head.next.val, current);

            if (head.next.next == null) {
                return newNext;
            }

            head = head.next.next;
        }

        return new ListNode(head.val, newNext);
    }

    @Data
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
