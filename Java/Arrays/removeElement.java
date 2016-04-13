/*

Given an array and a value, "remove" all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

*/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i] == val){
                nums[i] = nums[nums.length-count-1];
                count++;
            }
        }
        return nums.length-count;
    }
}

/*

Tested at https://leetcode.com/problems/remove-element/
Completed with O(n) time complexity and O(1) space complexity

Notes:
The key is that the order of the elements can be changed and it does not matter what is beyond the new length.
*/