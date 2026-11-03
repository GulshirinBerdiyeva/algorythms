package tm.bgb.javaholic.easy;

import lombok.Data;

/**
 * TODO: {@link <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description/">
 *  Find max depth of binary tree</a>}
 *  <p>Given the root of a binary tree, return its maximum depth
 *  <p>Input: root = [3,9,20,null,null,15,7]
 *  <p>Output: 3
 */
public class FindMaxDepthOfBinaryTreeToDo {

    static void main() {
        // todo:
    }

    static int maxDepth(TreeNode root) {
        // todo:
        return -1;
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