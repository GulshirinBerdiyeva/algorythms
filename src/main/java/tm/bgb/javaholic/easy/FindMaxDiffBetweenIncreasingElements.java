package tm.bgb.javaholic.easy;

public class FindMaxDiffBetweenIncreasingElements {

    static void main() {
        System.out.println(maximumDifference(new int[]{1, 5, 2, 10}));
    }

    // note: option 1
    // time complexity: O(n)
    // space complexity: O(1)
    static int maximumDifference(int[] nums) {
        int minEl = nums[0];
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minEl) {
                minEl = nums[i];
            }

            if (minEl < nums[i]) {
                int tempMaxDiff = nums[i] - minEl;
                if (maxDiff == -1 || tempMaxDiff > maxDiff) {
                    maxDiff = tempMaxDiff;
                }
            }
        }

        return maxDiff;
    }
}
