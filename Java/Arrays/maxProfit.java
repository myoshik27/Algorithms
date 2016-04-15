/*

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

*/



public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int lowest = prices[0];
        int highest = prices[0];
        int diff = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > highest){
                highest = prices[i];
                if(highest-lowest > diff) diff = highest - lowest;
            } else if (prices[i] < lowest){
                lowest = prices[i];
                highest = prices[i];
            }
        }
        return diff;
    }
}


/*

Tested at https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Completed with O(n) time complexity and O(1) space complexity

*/