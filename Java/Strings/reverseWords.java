/*
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
*/

public class Solution {
    public String reverseWords(String s) {
        ArrayList<String> sentence = new ArrayList<String>();
        StringBuilder word = new StringBuilder();
        boolean notFront = false;
        for(int i=0; i<s.length(); i++){
            if(Character.isWhitespace(s.charAt(i)) && notFront){
                sentence.add(word.toString());
                word.delete(0, word.length());
                while(i != s.length()-1 && Character.isWhitespace(s.charAt(i+1))) i++;
                notFront = false;
            } else if(!Character.isWhitespace(s.charAt(i))){
                word.append(s.charAt(i));
                notFront = true;
            }
            
            if(i == s.length()-1 && notFront){
                sentence.add(word.toString());
            }
        }
        StringBuilder newSentence = new StringBuilder();
        for(int j=sentence.size()-1; j>=0; j--){
            newSentence.append(sentence.get(j));
            if(j != 0) newSentence.append(" ");
        }
        
        return newSentence.toString();
    }
}

/*
Tested at https://leetcode.com/problems/reverse-words-in-a-string/
Completed with O(n) time complexity and O(n) space complexity

*/