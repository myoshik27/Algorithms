/**
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
    
    public TreeNode sortedListToBST(ListNode head) {
        ListNode runner = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(runner != null){
            list.add(runner.val);    
            runner = runner.next;
        } 
        return toBSTHelp(0,list.size()-1,list);
    }
    
    private TreeNode toBSTHelp(int start, int end, ArrayList<Integer> list){
        if(start > end) return null;
        if(start == end) return new TreeNode(list.get(end));
        int middle = start + (end - start)/2;
        TreeNode root = new TreeNode(list.get(middle));
        root.left = toBSTHelp(start, middle-1, list);
        root.right = toBSTHelp(middle+1, end, list);
        return root;
    }
}

/*

Tested at https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
Completed with O(n) time complexity and O(n) space complexity

*/