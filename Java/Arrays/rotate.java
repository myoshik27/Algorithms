/*

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

*/

public class Solution {
    // assuming positive value for k and a valid nums array
    public void rotate(int[] nums, int k) {
        int shiftNum = k % nums.length;
        int currentIndex = 0;
        int nextIndex = currentIndex + shiftNum;
        int temp = nums[currentIndex];
        for(int i=0; i<nums.length; i++){
            if((i * shiftNum) % nums.length == 0 && i != 0){
                currentIndex = (currentIndex + 1) % nums.length;
                nextIndex = (nextIndex + 1) % nums.length;
                temp = nums[currentIndex];
            }
            int dummy = nums[nextIndex]; 
            nums[nextIndex] = temp;
            temp = dummy;
            currentIndex = nextIndex;
            nextIndex = (currentIndex + shiftNum) % nums.length; 
        }
    }
}

/*

Tested at https://leetcode.com/problems/rotate-array/
Completed with O(n) time complexity and O(1) space complexity

*/