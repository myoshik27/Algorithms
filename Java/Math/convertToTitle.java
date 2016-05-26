/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

*/

public class Solution {
    public String convertToTitle(int n) {
        if(n < 1) return "";
        StringBuilder col = new StringBuilder();
        for(int i = n-1; i >= 0; i = i / 26 - 1) col.append((char) ('A' + i % 26));
        return this.reverse(col.toString());
    }
    private String reverse(String str){
        char[] word = new char[str.length()];
        for(int i = 0; i < str.length(); i++) word[i] = str.charAt(str.length()-1-i);
        return new String(word);
    }
}

/*

Tested at https://leetcode.com/problems/excel-sheet-column-title/
Completed with O(log(n)) time complexity and O(n) space complexity

*/