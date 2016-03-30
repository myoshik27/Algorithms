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