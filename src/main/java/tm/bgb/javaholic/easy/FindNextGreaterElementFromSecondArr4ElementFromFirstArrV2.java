package tm.bgb.javaholic.easy;

import java.util.Arrays;
import java.util.Stack;

public class FindNextGreaterElementFromSecondArr4ElementFromFirstArrV2 {

    static void main() {
        int[] resultArr = nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        Arrays.stream(resultArr).forEach(System.out::println);
    }

    // note: option 2 'monotonic decreasing stack'
    // time complexity: O(n1 + n2)
    // space complexity: O(n2)
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var nextGreater = new int[10001];
        var stack = new Stack<Integer>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            nextGreater[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }
}
