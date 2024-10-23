package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
    id = 121,
    name = "Best Time to Buy and Sell Stock",
    url = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock"
)
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Initialize minimum price as the first element and max profit as 0
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through the price array
        for (int currentPrice : prices) {
            // Update the minimum price if a lower price is found
            minPrice = Math.min(minPrice, currentPrice);

            // Calculate the potential profit and update the maximum profit
            maxProfit = Math.max(maxProfit, currentPrice - minPrice);
        }

        // Return the maximum profit
        return maxProfit;
    }
}
