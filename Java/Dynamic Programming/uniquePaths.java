/*
A robot is located at the top-left corner of a m x n grid.

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid.

How many possible unique paths are there?

*/


public class Solution {
    public int uniquePaths(int m, int n) {
        int[] paths = new int[m*n];
        for(int i=0; i<m*n; i++){
            if(i % n == 0 || i / n == 0) paths[i] = 1; 
            else if (i>n) paths[i] = paths[i-n] + paths[i-1];
        }
        return paths[m*n-1];
    }
}

/*

Tested at https://leetcode.com/problems/unique-paths/

Completed with O(m*n) time complexity and O(m*n) space complexity

*/