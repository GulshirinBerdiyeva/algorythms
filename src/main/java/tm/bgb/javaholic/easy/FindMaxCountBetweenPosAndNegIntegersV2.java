package tm.bgb.javaholic.easy;

public class FindMaxCountBetweenPosAndNegIntegersV2 {

    static void main() {
        System.out.println(maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
    }

    // note: option 2
    // time complexity: O(log(n))
    // space complexity: O(1)
    static int maximumCount(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int negCount = left;

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int posCount = nums.length - left;

        return Math.max(negCount, posCount);
    }

}
