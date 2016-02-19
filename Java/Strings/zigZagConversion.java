/*

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".


*/

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        StringBuilder newString = new StringBuilder();
        int cycle = 2*numRows-2;
        for(int row=0; row<numRows; row++){
            for(int i=row; i<s.length(); i=i+cycle){
                newString.append(s.charAt(i));
                int secondCharIndex = i + cycle-2*row;
                if(row !=0 && row != numRows-1 && secondCharIndex < s.length()){
                    newString.append(s.charAt(secondCharIndex));
                }
            }
        }
        return newString.toString();
    }
}

/*

Tested at https://leetcode.com/problems/zigzag-conversion/

If string is of size n and numRows is of size m,
Completed with O(n) runtime, O(n) space

*/