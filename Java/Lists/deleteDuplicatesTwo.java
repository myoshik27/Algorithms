/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        ListNode cur = head;
        ListNode runner = head;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                while(runner != null && runner.val == cur.val) runner = runner.next;
                if(cur == head){
                    head = runner;
                    prev = runner;
                    cur = runner;
                } else{
                    prev.next = runner;
                    cur = runner;
                }
            } else{
                if(prev == cur){
                    cur = cur.next;
                    runner = runner.next;
                } else {
                    prev = prev.next;
                    cur = cur.next;
                    runner = runner.next;
                }
            }
        }
        return head;
    }
}
/*

Tested at https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
Completed with O(n) time complexity and O(1) space complexity

*/