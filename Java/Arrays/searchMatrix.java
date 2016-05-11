

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numCol = matrix[0].length;
        int startIndex = 0;
        int endIndex = matrix[0].length * matrix.length - 1;
        
        if(startIndex == endIndex) return target == matrix[0][0];
        
        while(endIndex>startIndex){
            int midIndex = (startIndex + endIndex) / 2;
            int startRow = startIndex / numCol;
            int startCol = startIndex % numCol;
            int midRow = midIndex / numCol;
            int midCol = midIndex % numCol;
            int endRow = endIndex / numCol;
            int endCol = endIndex % numCol;
            
            if(target == matrix[midRow][midCol] || target == matrix[startRow][startCol] || target == matrix[endRow][endCol]){
                return true;   
            } else if(target > matrix[midRow][midCol]){
                startIndex = midIndex + 1;
            } else if(target < matrix[midRow][midCol]){
                endIndex = midIndex;
            }
        }
        return false;
    }    
}