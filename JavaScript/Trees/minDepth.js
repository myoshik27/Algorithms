/*

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

*/

/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var minDepth = function(root) {
    if(root === null) return 0;
    if(root.left === null && root.right === null) return 1;
    if(root.left === null) return 1 + minDepth(root.right);
    if(root.right === null) return 1 + minDepth(root.left);
    return 1 + Math.min(minDepth(root.left),minDepth(root.right));
};

/*

Description:
1. From the parent check the minDepths of its children below itself and return the minimum depth between the two
2. If there is only one child, return 1 (for itself) and the minimum depth of the children below it
2. If the root is null return 0
3. If the root is a leaf node return 1

Tested at https://leetcode.com/problems/minimum-depth-of-binary-tree/
Completed with O(n) time complexity and O(1) space complexity

*/