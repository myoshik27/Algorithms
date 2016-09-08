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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> solution = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        boolean startLeft = true;
        if(root == null) return solution;
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<Integer>();
            int queueSize = queue.size();
            for(int i=0; i<queueSize; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(startLeft){
                    if(node.left != null){
                        stack.push(node.left);
                    }
                    if(node.right != null){
                        stack.push(node.right);
                    }
                }else {
                    if(node.right != null){
                        stack.push(node.right);
                    } 
                    if(node.left != null){
                        stack.push(node.left);
                    } 
                }
            }
            startLeft = !startLeft;
            solution.add(level);
            while(!stack.isEmpty()){
                queue.add(stack.pop());
            }
        }
        return solution;
    }
}