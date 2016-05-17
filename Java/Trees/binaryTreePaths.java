/**
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree:
 * 
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * 
 * All root-to-leaf paths are:
 * 
 * ["1->2->5", "1->3"]
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<String>();
        if(root != null) binaryTreePathsHelper(root, list, "");
        return list;
    }
    
    public void binaryTreePathsHelper(TreeNode root, ArrayList<String> list, String path){
        if(root.left == null && root.right == null){
            //add root.val to path and add path to list
            path += Integer.toString(root.val);
            list.add(path);
        } else if(root.right == null){
            // add root.val to path
            // recurse on the left side
            path += Integer.toString(root.val) + "->";
            binaryTreePathsHelper(root.left, list, path);
        }else if(root.left == null){
            // add root.val to path
            // recurse on right side
            path += Integer.toString(root.val) + "->";
            binaryTreePathsHelper(root.right, list, path);
        } else {
            // add root.val to path
            // recurse on both sides
            path += Integer.toString(root.val) + "->";
            binaryTreePathsHelper(root.left, list, path);
            binaryTreePathsHelper(root.right, list, path);
        }
    }
}

/*

Tested at https://leetcode.com/problems/binary-tree-paths/
Completed with O(n) time complexity

*/