package tm.bgb.javaholic.easy;

public class FindMaxCountBetweenPosAndNegIntegers {

    static void main() {
        System.out.println(maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
    }

    // note: option 1
    // time complexity: O(n)
    // space complexity: O(1)
    static int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;

        for (int num : nums) {
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            }
        }

        return Math.max(posCount, negCount);
    }

}
