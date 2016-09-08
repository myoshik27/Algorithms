/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
var reorderList = function(head) {
    
};

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