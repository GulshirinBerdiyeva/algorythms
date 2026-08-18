package tm.bgb.javaholic.easy;

import lombok.Data;

/**
 * TODO: {@link <a href="https://leetcode.com/problems/reverse-linked-list/description/">
 * Reverse single-linked list</a>}
 * <p>Given the head of a singly linked list, reverse the list, and return the reversed list
 * <p>Input: head = [1,2,3,4,5]
 * <p>Output: [5,4,3,2,1]
 */
public class ReverseSingleLinkedListToDo {

    static void main() {
        // todo:
    }

    public static ListNode reverseList(ListNode head) {
        // todo
        return null;
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
