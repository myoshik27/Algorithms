// Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.

import java.util.*;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(table.containsKey(nums[i]) && (i - table.get(nums[i]) <= k)){
                return true;   
            }
            table.put(nums[i],i);
        }
        return false;
    }
}

// tested at https://leetcode.com/problems/contains-duplicate-ii/
// completed with O(n) time complexity, O(n) space complexity