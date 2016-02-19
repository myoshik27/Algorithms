/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */

// You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

// You may assume that l1 and l2 are listNodes with a legitimate value

var addTwoNumbers = function(l1, l2) {

    l3 = new ListNode(0)
    var runner1 = l1;
    var runner2 = l2;
    var runner3 = l3;
    var carry = 0;
    var sum;
    var newListNode;
    while(runner1 || runner2){
        sum = 0;
        if(runner1){
            sum += runner1.val;
            runner1 = runner1.next;
        } 
        if(runner2){
            sum += runner2.val;
            runner2 = runner2.next;
        }
        sum += carry;
        if(sum > 9){
            sum = sum - 10;
            carry = 1;
        } else {
            carry = 0;
        }
        
        runner3.next = new ListNode(sum);
        runner3 = runner3.next;
    }
    if (carry === 1){
        newListNode = new ListNode(1);
        runner3.next = newListNode;
    }
    return l3.next
        
};

// tested at https://leetcode.com/problems/add-two-numbers/
// Completed with O(n) runtime and O(n) space