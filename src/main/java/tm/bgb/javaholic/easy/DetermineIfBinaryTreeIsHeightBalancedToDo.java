package tm.bgb.javaholic.easy;

import lombok.Data;

/**
 * TODO: {@link <a href="https://leetcode.com/problems/balanced-binary-tree/description/">
 *  Determine if binary tree is height-balanced</a>}
 *  <p>A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one
 *  <p>Input: root = [3,9,20,null,null,15,7]
 *  <p>Output: true
 */
public class DetermineIfBinaryTreeIsHeightBalancedToDo {

    static void main() {
        // todo:
    }

    static boolean isBalanced(TreeNode root) {
        // todo:
        return false;
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