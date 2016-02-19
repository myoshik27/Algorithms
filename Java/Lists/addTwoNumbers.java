/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

// You may assume that l1 and l2 are listNodes with a legitimate value

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode runner1 = l1;
        ListNode runner2 = l2;
        ListNode runner3 = dummy;
        int sum = 0;
        int carry = 0;
        while(runner1 != null || runner2 != null){
            sum = 0;
            if(runner1 != null){
                sum += runner1.val;
                runner1 = runner1.next;
            }
            
            if(runner2 != null){
                sum += runner2.val;
                runner2 = runner2.next;
            }
            
            sum += carry;
            
            if (sum > 9){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode newListNode = new ListNode(sum);
            runner3.next = newListNode;
            runner3 = runner3.next;
        }
        if(carry == 1){
            ListNode newListNode = new ListNode(carry);
            runner3.next = newListNode;
            runner3 = runner3.next;
        }
        return dummy.next;
    }
}

// tested at https://leetcode.com/problems/add-two-numbers/
// Completed with O(n) runtime and O(n) space