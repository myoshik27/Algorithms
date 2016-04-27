
/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

*/

public class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int middle = (start + end)/2;
        while(end != middle){
            if(nums[start] <= nums[middle] && nums[start] < nums[end]) return nums[start];
            
            if(nums[end] < nums[middle] && nums[end] < nums[start]){
                start = middle + 1;
                middle = (start + end)/2;
            } else if (nums[middle] < nums[start] && nums[middle] < nums[end]){
                end = middle;
                middle = (start+end)/2;
            }
        }
        return nums[middle];
    }
}

/*

Tested at https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
Completed with O(log(n)) time complexity and O(1) space complexity

*/