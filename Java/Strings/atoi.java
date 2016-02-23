/*

Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

*/

public class Solution {
    public int myAtoi(String str) {
        // check for empty string
        long solution = 0;
        if (str.length() == 0){
            return (int) solution;
        }
        int index = 0;
        int sign = 1;
        // handle spaces
        while(str.charAt(index) == ' '){
            index++;
        }
        // handle + or - sign
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            if(str.charAt(index) == '-'){
                sign = -1;
            }
            index++;
        }
        
        // build integer
        while(index < str.length()){
            // handle overflow
            if(str.charAt(index) <= '9' && str.charAt(index) >= '0'){
                solution = solution * 10 + (str.charAt(index) - '0');
                System.out.println(solution);
                index++;
                if(solution * sign < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }else if(solution * sign > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }
        
        solution = solution * sign;

        return (int) solution;
    }
}