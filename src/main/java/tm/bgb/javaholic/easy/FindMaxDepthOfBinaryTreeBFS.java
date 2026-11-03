package tm.bgb.javaholic.easy;

import lombok.Data;

import java.util.LinkedList;

public class FindMaxDepthOfBinaryTreeBFS {

    static void main() {
        var _9 = new TreeNode(9);
        var _15 = new TreeNode(15);
        var _7 = new TreeNode(7);
        var _20 = new TreeNode(20, _15, _7);
        var root = new TreeNode(3, _9, _20);
        System.out.println(maxDepth(root));
    }

    // note: option 2
    // time complexity: O(n)
    // space complexity: O(w)
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var list = new LinkedList<TreeNode>();
        list.add(root);
        var maxBreadthCount = 0;
        while (!list.isEmpty()) {
            maxBreadthCount++;

            int listSize = list.size();
            for (int i = 0; i < listSize; i++) {
                var currentNode = list.removeFirst();
                var leftNode = currentNode.getLeft();
                if (leftNode != null) {
                    list.add(leftNode);
                }
                var rightNode = currentNode.getRight();
                if (rightNode != null) {
                    list.add(rightNode);
                }
            }
        }

        return maxBreadthCount;
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