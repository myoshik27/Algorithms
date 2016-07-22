/*

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null) return solution;
        queue.add(root);
        while(!queue.isEmpty()){
            int nodesInLevel = queue.size();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(int i=0; i<nodesInLevel; i++){
                TreeNode current = queue.poll();
                level.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            solution.add(level);
        }
        return solution;
    }
}

/*

Description:

1. Create ArrayList solution to hold levels
2. Create Queue to hold nodes in order
3. if root is null return a blank solution arrayList
4. add root to the queue to start things off
5. while queue is not empty
    5a. establish number of nodes in sublevel
    5b. create new level arraylist
    5c. loop through queue nodesInLevel times
        5ca. pop top node off queue
        5cb. append it to level
        5cc. add child nodes from popped node to queue
    5d. append level to solution
6. return solution 

Tested at https://leetcode.com/problems/binary-tree-level-order-traversal/
Completed with O(n) time complexity and O(n) space complexity

*/