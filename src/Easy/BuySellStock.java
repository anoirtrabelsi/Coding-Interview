package Easy;

public class BuySellStock {

	// Best Time to Buy and Sell Stock:
	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

	// Brute Force : O(n²):

	/*
	 * public int maxProfit(int[] prices) {
	 * 
	 * int max = 0;
	 * 
	 * for (int i = 0; i < prices.length; i++) { for (int j = i + 1; j <
	 * prices.length; j++) { max = Math.max(max, prices[j] - prices[i]); } } return
	 * max; }
	 */

	public int maxProfit(int[] prices) {

		int max = 0;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {

			if (prices[i] < min)
				min = prices[i];
			else
				max = Math.max(max, prices[i] - min);
		}

		return max;
	}

}
