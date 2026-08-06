package tm.bgb.javaholic.easy;

public class BinarySearchInsertPosition {

    static void main() {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    // note: option 1
    // time complexity: O(log(n))
    // space complexity: O(1)
    static int searchInsert(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;

        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

}
