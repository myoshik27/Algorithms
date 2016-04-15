/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int newLen = nums.length;
        int replaceIndex = 0;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                newLen--;
            }else {
                nums[++replaceIndex] = nums[i+1];
            }
        }
        return newLen;
    }
}

/*

Tested at https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Completed with O(n) time complexity and O(1) space complexity

*/