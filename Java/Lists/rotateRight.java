/*

Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        // get length and set pointer to end node
        int length = 1;
        ListNode end = head;
        while(end.next != null){
            length++;
            end = end.next;
        }
        // find node at length - (k % length)
        ListNode middle = head;
        for(int i = 0; i<length - (k % length)-1; i++){
            middle = middle.next;
        }
        // set end.next = head
        end.next = head;
        // set head = middle.next
        head = middle.next;
        // set middle.next = null
        middle.next = null;
        return head;
    }
}