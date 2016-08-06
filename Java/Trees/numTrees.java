/*

Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

*/


import java.util.*;

public class Solution {
    public int numTrees(int n) {
        Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
        return numTreesHelp(n, table);
    }
    
    private int numTreesHelp(int n, Hashtable<Integer,Integer> table){
        if(table.containsKey(n)) return table.get(n);
        int count = 0;
        if(n == 1) return 1;
        for(int i=1; i<=n; i++){
            int left = numTreesHelp(i-1, table);
            int right = numTreesHelp(n-i, table);
            if(left == 0 || right == 0) count += left + right;
            else count += left * right;
        }
        table.put(n,count);
        return count;
    }
}

/*

Tested at https://leetcode.com/problems/unique-binary-search-trees/
Completed with O(n^2) time complexity and O(n) space complexity

*/