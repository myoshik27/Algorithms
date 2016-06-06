/*

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

*/



import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        Hashtable<Integer,Integer> nums1Table = new Hashtable<Integer,Integer>();
        
        for(int i=0; i<nums1.length; i++){
            if(nums1Table.containsKey(nums1[i])){
                nums1Table.put(nums1[i], nums1Table.get(nums1[i])+1);
            } else{
                nums1Table.put(nums1[i],1);
            }
        }
        
        for(int j=0; j<nums2.length; j++){
            if(nums1Table.containsKey(nums2[j])){
                intersection.add(nums2[j]);
                nums1Table.put(nums2[j], nums1Table.get(nums2[j])-1);
                if(nums1Table.get(nums2[j]) == 0) nums1Table.remove(nums2[j]);
            }
        }
        
        int[] solution = new int[intersection.size()];
        for(int k=0; k<intersection.size(); k++) solution[k] = intersection.get(k);
        
        return solution;
    }
}

/*

Tested at https://leetcode.com/problems/intersection-of-two-arrays-ii/
Completed with O(Math.Max(m,n) time complexity and O(m) space complexity where m and n are the size of nums1 and nums2 respectively  

*/