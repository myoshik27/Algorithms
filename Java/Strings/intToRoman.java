// Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999

public class Solution {
    public String intToRoman(int num) {
        ArrayList<String> romNum = new ArrayList<String>();
        int count = 1;
        while (num > 0){
            int tempNum = num % 10;
            num = num / 10;
            switch(count){
                case 1:
                    appendDigits(romNum, tempNum, "I", "V", "X");
                    count = count * 10;
                    break;
                case 10:
                    appendDigits(romNum, tempNum, "X", "L", "C");
                    count = count * 10;
                    break;
                case 100:
                    appendDigits(romNum, tempNum, "C","D","M");
                    count = count * 10;
                    break;
                case 1000:
                    appendDigits(romNum, tempNum, "M","a","b");
                    break;
                default:
                    break;
            }
        }
        StringBuilder romanNumeral = new StringBuilder();
        for(int i=romNum.size()-1; i >= 0; i--){
            romanNumeral.append(romNum.get(i));
        }
        return romanNumeral.toString();
    }
    
    private void appendDigits(ArrayList romNum, int num, String ones, String fives, String tens){
        if(num < 4 && num > 0){
            appendChar(romNum, num, ones);
        } else if (num == 4){
            romNum.add(ones + fives);
        } else if(num > 4 && num < 9){
            appendChar(romNum, num-5, ones);
            romNum.add(fives);
        } else if (num == 9){
            romNum.add(ones + tens);
        }
    }
    
    private void appendChar(ArrayList romNum, int num, String character){
        for(int i = 0; i< num; i++){
            romNum.add(character);
        }
    }
}

// tested at https://leetcode.com/problems/integer-to-roman/