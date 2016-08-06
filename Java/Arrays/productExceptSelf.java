/*
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division, in O(n) time complexity and, with constant space complexity (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

For example, given [1,2,3,4], return [24,12,8,6].

*/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] output = new int[l];
        output[0] = 1;
        for(int i = 1; i < l; i++) output[i] = output[i-1] * nums[i - 1];
        int right = 1;
        for(int i = l-1; i>=0; i--){
            output[i] = output[i] * right;
            right = right * nums[i];
        }
        return output;
    }
}

/*

Tested at https://leetcode.com/problems/product-of-array-except-self/
Completed with O(n) time complexity and O(1) space complexity

Notes:

1. Initialize new output array with the same length as num and 0th index as 1
2. Set each index equal to the product of output[i-1] * nums[i - 1]
    - At the end of this loop, each index of the output array holds the product of all the values to the left of output[i]
3. Initialize int right to hold the product of all the values to the right of output[i] (start with 1 since the last index should be set to its final value);
4. Loop through output backwards and multiply output[i] by right
5. Multiply right by nums[i] to hold the product of all the values to the right of the next index

Example:

nums = [1,2,3,4]

output = [1,0,0,0] just before first loop

output = [1,1,2,6] just after first loop

indecies of output are the product of the following indecies of nums:

0: n/a
1: 0
2: 0,1
3: 0,1,2

which means they are each missing

0: 1,2,3
1: 2,3
2: 3
3: n/a

Thus we implement int right to store the product of the missing values

We move backwards during the second loop starting with i = 3 in this case

=== i = 3 ===
output[i] = 6   --> 6
right = 1       --> 4

=== i = 2 ===
output[i] = 2   --> 8
right = 4       --> 12

=== i = 1 ===
output[i] = 1   --> 12
right = 12      --> 24

=== i = 0 ===
output[i] = 1   --> 24
right = 24      --> 24

and thus we return output with values [24,12,8,6]

*/