/*

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

*/

public class Solution {
    public int minPathSum(int[][] grid){
        int numRow = grid.length;
        int numCol = grid[0].length;
        int[][] sums = new int[numRow][numCol];
        for(int i = 0; i<numRow; i++){
            for(int j = 0; j<numCol; j++){
                if(i == 0 && j == 0) sums[i][j] = grid[i][j];
                else if(j == 0) sums[i][j] = grid[i][j] + sums[i-1][j];
                else if(i == 0) sums[i][j] = grid[i][j] + sums[i][j-1];
                else sums[i][j] = Math.min(sums[i-1][j], sums[i][j-1]) + grid[i][j];
            }
        }
        return sums[numRow-1][numCol-1];
    }
}

/*

Tested at https://leetcode.com/problems/minimum-path-sum/
Completed with O(m*n) time complexity and O(m*n) space complexity

*/
