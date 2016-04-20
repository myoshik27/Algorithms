/*

There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). 

For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.

Example:

Given n = 3. 

At first, the three bulbs are [off, off, off].
After first round, the three bulbs are [on, on, on].
After second round, the three bulbs are [on, off, on].
After third round, the three bulbs are [on, off, off]. 

So you should return 1, because there is only one bulb is on.

*/



public class Solution {
    public int bulbSwitch(int n) {
        return ((int) Math.sqrt(n));
    }
}

/*

Tested at https://leetcode.com/problems/bulb-switcher/
Completed with O(1) time complexity and O(1) space complexity

Notes:

If the bulbs start in an off position, all integers that have an even number of factors will be left in an off position and those that have an odd number of factors will be left in the on position.
The only integers that have an odd number of factors are perfect squares. Thus, the number of perfect squares that appear before (and including) the integer n is the number of bulbs that are on.


*/