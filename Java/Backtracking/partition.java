/*

Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

  [
    ["aa","b"],
    ["a","a","b"]
  ]

*/


public class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> palindromes = new ArrayList<List<String>>();
        ArrayList<String> substrings = new ArrayList<String>();
        partitionHelp("", s, palindromes, substrings);
        return palindromes;
    }
    
    private void partitionHelp(String soFar, String leftover, ArrayList<List<String>> palindromes, ArrayList<String> substrings){
        if(leftover.length() == 0){
            if(isPalindrome(soFar)){
                substrings.add(soFar);
                palindromes.add(substrings);
            }
            return;
        }
        
        String firstChar = Character.toString(leftover.charAt(0));
        String temp = soFar + firstChar;
        String subLeftover = leftover.substring(1,leftover.length());
        
        if(isPalindrome(temp)){
            // temp not added
            partitionHelp(temp, subLeftover, palindromes , new ArrayList<String>(substrings));
            substrings.add(temp);
            // temp added
            partitionHelp("", subLeftover, palindromes, new ArrayList<String>(substrings));
        } else{
            partitionHelp(temp, subLeftover, palindromes , new ArrayList<String>(substrings));
        }
    }
    
    private boolean isPalindrome(String word){
        if(word.length() == 0) return false;
        int start = 0;
        int end = word.length()-1;
        while(end > start){
            if(word.charAt(start) != word.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}

/*

Tested at https://leetcode.com/problems/palindrome-partitioning/

*/