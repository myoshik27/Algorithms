/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * 
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var sortedArrayToBST = function(nums) {
    return helper(nums, 0, nums.length-1);
};

/**
 * @param {number[]} nums
 * @param {number} start
 * @param {number} end
 * @return {TreeNode}
 */
var helper = function(nums, start, end){
    if(start>end) return null;
    var mid = Math.floor((start + end) / 2);
    
    var node = new TreeNode(nums[mid]);
    
    node.left = helper(nums, start, mid - 1);
    node.right = helper(nums, mid + 1, end);
    
    return node;
};

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