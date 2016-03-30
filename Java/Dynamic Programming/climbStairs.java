/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/


public class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2 || n == 3){
            return n;
        } else {
            int firstNum = 2;
            int secondNum = 3;
            for(int i = 3; i < n; i++){
                int tempNum = secondNum;
                secondNum = secondNum + firstNum;
                firstNum = tempNum;
            }
            return secondNum;
        }
    }
}

// Tested at https://leetcode.com/problems/climbing-stairs/
// Completed with O(n) time complexity and O(1) space complexity