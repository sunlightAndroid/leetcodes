package com.eric.question;

import java.util.HashMap;

public class leetcode00121 {

	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4}; 
		int[] prices2 = new int[] {7,6,4,3,1}; 
		int max = maxProfit2(prices2);
		System.out.println(max);
	}

	/**
	 * Best Time to Buy and Sell Stock [7,1,5,3,6,4] -> 5 第二天买，第五天卖，即 6-1 =5
	 * [7,6,4,3,1] -> 0
	 */

	// 解法1 暴力解法，枚举每一种情况  Runtime: 268 ms, faster than 8.04%
	public static int maxProfit1(int[] prices) {
		if (prices.length <= 1)return 0;
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] > prices[i]) {
					max = max < prices[j] - prices[i] ? prices[j] - prices[i] : max;
				}
			}
		}
		return max;
	}
	
	
	// 解法2 [7,1,5,3,6,4] -> 5  Runtime: 1 ms, faster than 98.38% 
	public static int maxProfit2(int[] prices) {
		if (prices.length <= 1)return 0;
		int max = 0;
		int minBuy = prices[0]; // 当前买入的最小值
		for (int i = 0; i < prices.length; i++) {
			max = Math.max(max, prices[i] - minBuy);
			minBuy = Math.min(minBuy, prices[i]);
		}
		return max;
	}
	
}
