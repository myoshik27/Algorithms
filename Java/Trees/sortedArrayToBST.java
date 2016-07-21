/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    
    private TreeNode helper(int[] nums, int startIdx, int endIdx){
        if(startIdx > endIdx) return null;
        
        int midIdx = (startIdx + endIdx)/2;
        TreeNode node = new TreeNode(nums[midIdx]);
        
        node.left = helper(nums, startIdx, midIdx - 1);
        node.right = helper(nums, midIdx + 1, endIdx);
        
        return node;
    }
}
/*
Notes: 

1. initialize start = 0 and end = array.length - 1
2. find mididx
3. Create a tree node with mid as root
4. Set node.left with recursive call on left subarray
5. Set node.right with recursive call on right subarray

Tested at https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
Completed with O(n) time complexity and O(1) space complexity

*/