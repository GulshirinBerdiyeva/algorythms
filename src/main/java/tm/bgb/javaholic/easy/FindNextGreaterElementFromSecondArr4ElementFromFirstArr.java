package tm.bgb.javaholic.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class FindNextGreaterElementFromSecondArr4ElementFromFirstArr {

    static void main() {
        int[] resultArr = nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        Arrays.stream(resultArr).forEach(System.out::println);
    }

    // note: option 1
    // time complexity: O(n2^2 + n1*n2)
    // space complexity: O(n2^2)
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var elementToSubStackMap = new HashMap<Integer, Stack<Integer>>();
        for (int i = 0; i < nums2.length; i++) {
            elementToSubStackMap.put(nums2[i], subArr(nums2, i + 1));
        }

        var result = new int[nums1.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < nums1.length; i++) {
            var stack = elementToSubStackMap.get(nums1[i]);
            while (!stack.empty()) {
                var nextEl = stack.pop();
                if (nums1[i] < nextEl) {
                    result[i] = nextEl;
                }
            }
        }

        return result;
    }

    private static Stack<Integer> subArr(int[] arr, int startIdx) {
        var stack = new Stack<Integer>();
        var arrLength = arr.length;
        if (startIdx < 0 || startIdx >= arrLength) {
            return stack;
        }

        for (int i = startIdx; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        return stack;
    }

}
