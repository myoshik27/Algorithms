/*

Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

Range Sum Query 2D
The above rectangle (with the red border) is defined by (row1, col1) = (2, 1) and (row2, col2) = (4, 3), which contains sum = 8.

Example:
Given matrix = [
  [3, 0, 1, 4, 2],
  [5, 6, 3, 2, 1],
  [1, 2, 0, 1, 5],
  [4, 1, 0, 1, 7],
  [1, 0, 3, 0, 5]
]

sumRegion(2, 1, 4, 3) -> 8
sumRegion(1, 1, 2, 2) -> 11
sumRegion(1, 2, 2, 4) -> 12
Note:
You may assume that the matrix does not change.
There are many calls to sumRegion function.
You may assume that row1 ≤ row2 and col1 ≤ col2.

*/


public class NumMatrix {
    
    private int[][] data;
    
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        data = new int[matrix.length][matrix[0].length];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(i == 0 && j == 0) data[i][j] = matrix[i][j];
                else if (i == 0) data[i][j] = data[i][j-1] + matrix[i][j];
                else if(j == 0) data[i][j] = data[i-1][j] + matrix[i][j];
                else data[i][j] = data[i-1][j] + data[i][j-1] - data[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // if both 0
        if(row1 == 0 && col1 == 0) return data[row2][col2];
        // if row 1 == 0
        else if(row1 == 0) return data[row2][col2] - data[row2][col1-1];
        // if col1 == 0
        else if(col1 == 0) return data[row2][col2] - data[row1-1][col2];
        // if neither
        else return data[row2][col2] - data[row2][col1-1] - data[row1-1][col2] + data[row1-1][col1-1];
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);

/*

Tested at https://leetcode.com/problems/range-sum-query-2d-immutable/

Time complexity: O(mn) time pre-computation, O(1) time per query
Space complexity: O(mn)


*/