// Given a string, find the length of the longest substring without repeating characters. 
// For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int max = 0;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            if(map.containsKey(s.charAt(end))){
                map.put(s.charAt(end),map.get(s.charAt(end))+1);
                
                do{
                    map.put(s.charAt(start),map.get(s.charAt(start))-1);    
                    if(map.get(s.charAt(start)) == 0){
                        map.remove(s.charAt(start));
                    }
                    start++;                    
                } while(map.get(s.charAt(end)) > 1);

                end++;                
            }else{
                map.put(s.charAt(end),1);
                if(max < end-start + 1){
                    max = end-start + 1;
                }
                end++;
            }
        }
        return max;
    }
}

// Testes at https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Completed with O(n) runtime, O(n) space