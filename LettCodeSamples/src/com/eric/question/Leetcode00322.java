package com.eric.question;

import java.util.Arrays;

public class Leetcode00322 {

	public static void main(String[] args) {

		int[] coins = { 1, 2, 5 };
		int amount = 11;

		int[] coins2 = { 2 };
		int amount2 = 3;
		
		int[] coins3 = { 186,419,83,408 };
		int amount3 = 6249;
		
	

		// int result = coinChange(coins3, amount3);
		int result = coinChange(0,coins3, amount3);
		System.out.print(result);
	}

	/**
	 * 找零钱问题
	 * 
	 * @param coins  [1,2,5]
	 * @param amount 11
	 * @return 3 (11 = 5 + 5 + 1)
	 * 
	 *         贪心算法
	 */
	public static int coinChange(int[] coins, int amount) {

		int result = 0;
		Arrays.sort(coins);
		System.out.println(Arrays.toString(coins));
		for (int i = coins.length - 1; i >= 0; i--) {
			int currentA = amount;
			result = 0;
			for (int j = i; j >=0; j--) {
				if (currentA >= coins[j]) {
					int num = currentA / coins[j];
					result = result + num;
					int rest = currentA % coins[j];
					currentA = rest;
				}
				if(currentA == 0) {
					return  result;
				}
			}
		}
		return result == 0 ? -1 : result;
	}
	
	private static int coinChange(int idxCoin, int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (idxCoin < coins.length && amount > 0) {
            int maxVal = amount / coins[idxCoin];
            int minCost = Integer.MAX_VALUE;
            for (int x = 0; x <= maxVal; x++) {
                if (amount >= x * coins[idxCoin]) {
                    int res = coinChange(idxCoin + 1, coins, amount - x * coins[idxCoin]);
                    if (res != -1) {
                        minCost = Math.min(minCost, res + x);
                    }
                }
            }
            return (minCost == Integer.MAX_VALUE)? -1: minCost;
        }
        return -1;
    }

	
	
}



