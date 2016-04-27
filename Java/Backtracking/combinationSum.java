/*

Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 

*/

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<List<Integer>> solutions = new ArrayList<List<Integer>>();
        ArrayList<Integer> combinations = new ArrayList<Integer>();
        comboSumHelp(candidates, target, combinations, solutions, 0);
        return solutions;
    }
    
    private void comboSumHelp(int[] candidates, int target, List<Integer> combinations, List<List<Integer>> solutions, int start){
        if(target == 0) solutions.add(new ArrayList<Integer>(combinations)); // why do I need to create a new array list?
        else if (target > 0){
            for(int i=start; i<candidates.length && target >= candidates[i]; i++){
                combinations.add(candidates[i]);
                comboSumHelp(candidates, target-candidates[i], combinations, solutions, start++); // start++ makes no sense
                combinations.remove(combinations.size()-1);
            }
        }
    }
}

/*

Tested at https://leetcode.com/problems/combination-sum/
Completed with O()

*/