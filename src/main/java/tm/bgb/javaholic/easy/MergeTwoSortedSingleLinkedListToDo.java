package tm.bgb.javaholic.easy;

import lombok.Data;

/**
 * TODO: {@link <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">
 *  Merge two sorted single-linked list</a>}
 *  <p>Given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list
 *  <p>Input: list1 = [1,2,4], list2 = [1,3,4]
 *  <p>Output: [1,1,2,3,4,4]
 */
public class MergeTwoSortedSingleLinkedListToDo {

    static void main() {
        // todo:
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // todo:
        return null;
    }

    @Data
    static class ListNode {
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