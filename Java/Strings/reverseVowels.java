/*

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

*/

public class Solution {
    public String reverseVowels(String s) {
        if(s == null) return "";
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char[] word = s.toCharArray();
        int front = 0;
        int end = word.length-1;
        while(front < end){
            if(!vowels.contains(word[front])) front++;
            else if(!vowels.contains(word[end])) end--;
            else {
                char temp = word[front];
                word[front] = word[end];
                word[end] = temp;
                front++;
                end--;
            }
        }
        return new String(word);
    }
}
/*

Tested at https://leetcode.com/problems/reverse-vowels-of-a-string/
Completed with O(n) time complexity and O(1) space complexity

*/