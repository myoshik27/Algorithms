/*

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.

*/

public class Solution{
    public int[] intersection(int[] nums1, int[] nums2){

        HashSet<Integer> nums1Set = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<Integer>();
        
        for(int i = 0; i<nums1.length; i++) nums1Set.add(nums1[i]);
        for(int j = 0; j<nums2.length; j++){
            if(nums1Set.contains(nums2[j])) intersect.add(nums2[j]);
        }

        int[] solutionArray = new int[intersect.size()];
        int k = 0;
        for(int integer : intersect) solutionArray[k++] = integer;
        return solutionArray;
    }
}

/*

Tested at https://leetcode.com/problems/intersection-of-two-arrays/
Completed with O(Math.Max(m,n)) Time complexity and O(m) space complexity where m and n are the number of elements in nums1 and nums2 respectively

*/