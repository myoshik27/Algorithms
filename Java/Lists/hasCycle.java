/**
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 * 
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            for(int i=0; i<2; i++){
                if(fast == null) return false;
                fast = fast.next;
            }
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}

/*

Tested at https://leetcode.com/problems/linked-list-cycle/
Completed with O(n) time complexity and O(1) space complexity

*/