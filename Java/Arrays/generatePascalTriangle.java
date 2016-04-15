/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]

]

*/


public class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i) row.add(1);
                else row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}

/*

Tested at https://leetcode.com/problems/pascals-triangle/
Completed with O(n^2) time complexity and O(n) space complexity

*/