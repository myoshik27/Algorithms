/*

*/

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    if(!headA || !headB) return null;
    var lengthA = 1;
    var lengthB = 1;
    var tempA = headA;
    var tempB = headB;
    while(tempA.next !== null){
        lengthA++;
        tempA = tempA.next;
    }
    while(tempB.next !== null){
        lengthB++;
        tempB = tempB.next;
    }
    if(tempA !== tempB) return null;
    tempA = headA;
    tempB = headB;
    while(lengthA > lengthB){
        tempA = tempA.next;
        lengthA--;
    }
    while(lengthB > lengthA){
        tempB = tempB.next;
        lengthB--;
    }
    for(var i = 0; i < lengthA; i++){
        if(tempA === tempB) return tempA;
        tempA = tempA.next;
        tempB = tempB.next;
    }
    return null;
};

/*
Tested at https://leetcode.com/problems/intersection-of-two-linked-lists/
Completed with O(A+B) time complextiy where A and B are the length of ListA and ListB
Completed with O(1) space complexity

Notes:

1. return null if either headA or headB is null
2. get the length of listA and listB
3. check if the last node of listA and listB are the same. return null if they are not
4. set two pointers to the beginning of each list
5. move the pointer of the longer list to be the same distance from the intersection point as the pointer of the shorter list
6. increment both pointers forward until they are equal and return that node

*/