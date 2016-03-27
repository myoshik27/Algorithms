/*

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"

*/


public class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<String>();
        generateParenthesisHelper(n, n, list, "");
        return list;
    }
    
    private void generateParenthesisHelper(int open, int close, List<String> list, String parens){
        System.out.println(parens);
        if(open == 0 && close == 0){
            list.add(parens);
            return;
        } 
        if (open > 0) {
            generateParenthesisHelper(open-1, close, list, parens + '(');
        }
        if (close > open){
            generateParenthesisHelper(open, close-1, list, parens + ')');
        }
    }
}

/*

Tested at https://leetcode.com/problems/generate-parentheses/

*/