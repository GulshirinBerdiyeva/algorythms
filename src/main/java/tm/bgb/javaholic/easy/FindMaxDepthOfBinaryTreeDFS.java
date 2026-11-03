package tm.bgb.javaholic.easy;

import lombok.Data;

public class FindMaxDepthOfBinaryTreeDFS {

    static void main() {
        var _9 = new TreeNode(9);
        var _15 = new TreeNode(15);
        var _7 = new TreeNode(7);
        var _20 = new TreeNode(20, _15, _7);
        var root = new TreeNode(3, _9, _20);
        System.out.println(maxDepth(root));
    }

    // note: option 1
    // time complexity: O(n)
    // space complexity: O(h)
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepthCount = maxDepth(root.getLeft());
        int rightDepthCount = maxDepth(root.getRight());

        return 1 + Math.max(leftDepthCount, rightDepthCount);
    }

    @Data
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}