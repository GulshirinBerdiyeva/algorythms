package tm.bgb.javaholic.easy;

import java.util.HashSet;

public class CheckMatrixRowColContainsAllNum {

    static void main() {
        System.out.println(checkValid(new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}));
    }

    // note: option 1
    // time complexity: O(n^2)
    // space complexity: O(n)
    static boolean checkValid(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            var rowSet = new HashSet<Integer>(length);
            var columnSet = new HashSet<Integer>(length);
            for (int j = 0; j < length; j++) {
                rowSet.add(matrix[i][j]);
                columnSet.add(matrix[j][i]);
            }
            if (rowSet.size() != length || columnSet.size() != length) {
                return false;
            }
        }
        return true;
    }
}
