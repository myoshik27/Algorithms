/*

Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur != null){
            list.add(cur.val);
            if(cur.right != null) stack.add(cur.right);
            if(cur.left != null) cur = cur.left;
            else {
                if(!stack.isEmpty()) cur = stack.pop();
                else cur = null;
            }
        }
        return list;
    }
}

/*

Tested at https://leetcode.com/problems/binary-tree-preorder-traversal/
Completed with O(n) time complexity and O(n) space complexity

*/