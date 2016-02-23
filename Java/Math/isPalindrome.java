
// Determine whether an integer is a palindrome. Do this without extra space.

public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10 == 0)){
            return false;
        }
        int solution = 0;
        while (x > solution){
            solution = solution * 10 + x % 10;
            x = x / 10;
        }
        return x == solution || x == solution/10;
    }
}

/*

tested at https://leetcode.com/problems/palindrome-number/
Completed with O(n) runtime, O(1) space

*/