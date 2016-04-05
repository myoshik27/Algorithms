/**
 * Merge two sorted linked lists of length n and m and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * 
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode root = l1;
        ListNode current1 = l1;
        ListNode current2 = l2;
        if(l1.val > l2.val){
            root = l2;
            current1 = l2;
            current2 = l1;
        }
        
        while(current2 != null){
            while(current1.next != null && current1.next.val <= current2.val) current1 = current1.next;
            ListNode temp = current1.next;
            current1.next = current2;
            current2 = temp;
        }
        return root;
    }
}


// Tested at https://leetcode.com/problems/merge-two-sorted-lists/

// Completed with O(n+m) time complexity and O(1) space complexity