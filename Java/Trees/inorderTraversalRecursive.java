/*

Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].


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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<Integer>();
        if(root != null) helper(root,inOrderList);
        return inOrderList;
    }
    
    private void helper(TreeNode root,List<Integer> inOrderList){
        if(root.left == null && root.right == null) inOrderList.add(root.val);
        else if(root.right == null){
            helper(root.left, inOrderList);
            inOrderList.add(root.val);
        }else if (root.left == null){
            inOrderList.add(root.val);
            helper(root.right, inOrderList);
        }else{
            helper(root.left, inOrderList);
            inOrderList.add(root.val);
            helper(root.right,inOrderList);
        }
    }
}

/*

Tested at https://leetcode.com/problems/binary-tree-inorder-traversal/
Completed with O(n) time complexity and O(n) space complexity

*/