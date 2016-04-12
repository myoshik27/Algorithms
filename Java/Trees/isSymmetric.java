/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 
 * But the following is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *     3    3
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelper(root.left, root.right);
    }
    
    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        return (left.val == right.val) && isSymmetricHelper(left.left, right.right) && isSymmetricHelper(right.left, left.right);
    }
}

/*

Tested at https://leetcode.com/problems/symmetric-tree/
Completed with O(log(n)) time complexity and O(1) space complexity

*/