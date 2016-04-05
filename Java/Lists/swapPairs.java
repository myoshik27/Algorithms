/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        head = second;
        while(second != null){
            ListNode temp = second.next;
            second.next = first;
            first.next = temp;
            if(temp == null) return head;
            else if(temp.next == null) return head;
            else {
                first.next = temp.next;
                first = temp;
                second = first.next;
            }
        }
        return head;
    }
}

// Tested at https://leetcode.com/problems/swap-nodes-in-pairs/

// Completed with O(n) time complexity and O(1) space complexity