/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    if (!head) return null;
    var prev = head;
    if (!prev.next) return prev;
    var cur = prev.next;
    prev.next = null;
    if (!cur.next) {
        head = cur;
        cur.next = prev;
        return cur;
    }
    var next = cur.next;
    
    while (next) {
        cur.next = prev;
        prev = cur;
        cur = next;
        next = next.next;
    }
    
    cur.next = prev;
    head = cur;
    return head;
};

/*
Tested at https://leetcode.com/problems/reverse-linked-list/
Completed with O(n) time complexity and O(1) space complexity

Notes:

1. Properly handle cases where length of list is less than 3
2. Flip the cur.next pointer from next to prev and increment cur throughout the list until next is null
3. Establish and return new head to be cur which should be located at the end of the list
*/