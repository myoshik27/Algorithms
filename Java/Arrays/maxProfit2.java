/*

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

*/
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null) return 0;
        int highest = prices[0];
        int lowest = prices[0];
        int diff = 0;
        for(int i = 1; i<prices.length; i++){
            if(i == prices.length-1){
                if(prices[i] > lowest) diff = diff + prices[i] - lowest;
            }else{
                if(prices[i] >= prices[i-1] && prices[i] > prices[i+1]){
                    // high point -- sell
                    highest = prices[i];
                    diff = diff + highest - lowest;
                    lowest = prices[i];
                } else if(prices[i] < prices[i-1] && prices[i] <= prices[i+1]){
                    // low point -- buy
                    lowest = prices[i];
                }
            }
        }
        return diff;
    }
}

/*

Tested at https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
Completed with O(n) time complexity and O(1) space complexity

*/