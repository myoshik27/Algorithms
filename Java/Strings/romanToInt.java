
// Given a roman numeral, convert it to an integer.

// Input is guaranteed to be within the range from 1 to 3999.

public class Solution {
    public int romanToInt(String s) {
        // go backwards
        // XI = 11 so add 1 then add 10
        // IV = 4 so add 5 and since I is less than V subtract 1
        if (s.isEmpty()){
            return 0;
        }
        int solution = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        solution = solution + map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                solution = solution - map.get(s.charAt(i));
            } else {
                solution = solution + map.get(s.charAt(i));
            }
        }
        return solution;
    }
}

// Tested at https://leetcode.com/problems/roman-to-integer/