/*

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

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
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function(root, p, q) {
    if(root === null || root == q || root == p) return root;
    
    var left = lowestCommonAncestor(root.left, p, q);
    var right = lowestCommonAncestor(root.right, p, q);
    
    if(right !== null && left !== null) return root;
    else if (left !== null) return left;
    else return right;
};

/*
Description
1. Traverse the Tree from the bottom to the top
2. if p or q is found return it to the parent node
3. Parent will check if p or q are found on the left and right side of itself respectively
4. If this is true, parent is lowest common ancestor
5. If this is false, p or q will be passed up to the parent

Tested at https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
Completed with O(n) time complexity and O(1) space complexity

*/