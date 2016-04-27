/*

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

*/

public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length-1;
        while(start < end){
            int area = Math.min(height[start], height[end])*(end-start);
            if(area > max) max = area;
            if(height[start] > height[end]) end--;
            else start++;
        }
        return max;
    }
}

/*

Tested at https://leetcode.com/problems/container-with-most-water/
Completed with O(n) time complexity and O(1) space complexity

*/