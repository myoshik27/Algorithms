/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
*/

public class Solution {
    public String countAndSay(int n) {
        StringBuilder prev = new StringBuilder("1");
        StringBuilder cur = new StringBuilder();
        for(int i = 1; i < n; i++){
            int count = 1;
            char num = prev.charAt(0);
            for(int j = 1; j<prev.length(); j++){
                if(prev.charAt(j) != num){
                    cur.append(count);
                    cur.append(num);
                    count = 1;
                    num = prev.charAt(j);
                }else{
                    count++;
                }
            }
            cur.append(count);
            cur.append(num);
            prev = cur;
            cur = new StringBuilder();
        }
        return prev.toString();
    }
}

/*
Tested at https://leetcode.com/problems/count-and-say/
Completed with O(nm) time complexity where n is the number given and m is the length of the larges string
Completed with O(1) space complexity
*/