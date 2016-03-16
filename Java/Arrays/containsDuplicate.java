// Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}

// tested at https://leetcode.com/problems/contains-duplicate/
// completed with O(n) runtime, O(n) space