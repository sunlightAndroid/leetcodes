package com.eric.question;

/**
 * 309. Best Time to Buy and Sell Stock with Cooldown : [1,2,3,0,2] ----> 3
 * Explanation: transactions = [buy, sell, cooldown, buy, sell]
 */
public class Leetcode00309 {

	public static void main(String[] args) {
		
	}
	
	
	/**
	 *  解法一： 暴力解法，双指针枚举每一种情况
	 *  数组的每一个索引其实就是三种情况之一：
	 *  买入、卖出、cooldown或者啥也不干  
	 */
	// [1,2,3,0,2]
	public int maxProfit1(int[] prices) {
		if (prices.length <= 1) return 0;
		int max = 0;
		int[] buy = new int[prices.length];
		int[] sell = new int[prices.length];
		int[] nothing = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			
			
		}
		return max;
	}
}
