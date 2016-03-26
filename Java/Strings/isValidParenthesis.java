/*

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

*/

import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()){
                    return false;
                } else if(map.get(s.charAt(i)) == stack.peek()){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

/*

Tested at https://leetcode.com/problems/valid-parentheses/

Completed with O(n) time complexity and O(n) space complexity

*/