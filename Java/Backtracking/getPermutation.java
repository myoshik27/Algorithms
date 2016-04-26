/*

The set [1,2,3,…,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order,
We get the following sequence (ie, for n = 3):

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

Note: Given n will be between 1 and 9 inclusive. Also, k will always be valid (if n = 3, k > 0 && k < 7);

*/


import java.util.*;

public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder num = new StringBuilder(); 
        for(int i=1;i<=n;i++) num.append(i);
        return getPermHelp("", num.toString(), getFactorial(n), k);
    }
    
    private String getPermHelp(String soFar, String leftover,int[] factorials, int k){
        if(leftover.length() == 0) return soFar;
        int numPerm = factorials[leftover.length()-1];
        int index = (k-1)/numPerm;
        char num = leftover.charAt(index);
        soFar = soFar + num;
        leftover = leftover.substring(0,index) + leftover.substring(index+1,leftover.length());
        return getPermHelp(soFar,leftover, factorials, k-(numPerm*index));
    }
    
    private int[] getFactorial(int n){
        int[] factorials = new int[n+1];
        factorials[0] = 1;
        for(int i=1; i<=n; i++) factorials[i] = factorials[i-1] * i;
        return factorials;
    }
}

/*

Tested at https://leetcode.com/problems/permutation-sequence/
Completed with O(n^2) time complexity (substring has a time complexity of O(n) and O(1) space complexity)

*/