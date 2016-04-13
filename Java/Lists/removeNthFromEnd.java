/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 *      Given linked list: 1->2->3->4->5, and n = 2.
 *      After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *      Given n will always be valid.
 *      Try to do this in one pass.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        int count = 0;
        ListNode r1 = head, r2 = head;
        while(r1.next != null){
            r1 = r1.next;
            if(count >= n) r2 = r2.next;
            count++;
        }
        if(count == n-1) head = head.next;
        else r2.next = r2.next.next;
        return head;
    }
}

/* 

Tested at https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Completed with O(n) timecomplexity and O(1) space complexity

*/