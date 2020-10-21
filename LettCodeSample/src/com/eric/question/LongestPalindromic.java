package com.eric.question;

public class LongestPalindromic {

	public static void main(String[] args) {
		String test1 = "babad";
		String test2 = "cbbd";
		String test3 = "ac";
		String test4 = "bb";
		String test5 = "dsqspnkrvrhqzqvovbofdzqishgtcrvckluzpwesvartjhljqdphdupktoxdffvoqupuxmehikegjnwuheoafgqrtvuzphkikaixnjmhepeqorzjzgnrxxxirhjvboijbzftxhvtrdmbcvysxscvqmgifipwujvvktithqthujpxwwgamwqkxnnxiymtuvtyzafbxybalnjboaiyrxedviesmzzwgagilndguylskdikiocvqmjmfykakuiihuqurgqqirjoccqoixegyspftktguitqtixcsywycutcaedusndombnfzpgoklqzzqlkogpzfnbmodnsudeactucywyscxitqtiugtktfpsygexioqccojriqqgruquhiiukakyfmjmqvcoikidkslyugdnligagwzzmseivdexryiaobjnlabyxbfazytvutmyixnnxkqwmagwwxpjuhtqhtitkvvjuwpifigmqvcsxsyvcbmdrtvhxtfzbjiobvjhrixxxrngzjzroqepehmjnxiakikhpzuvtrqgfaoehuwnjgekihemxupuqovffdxotkpudhpdqjlhjtravsewpzulkcvrctghsiqzdfobvovqzqhrvrknpsqsd";
		String result = longestPalindrome(test5);
		System.out.println(test4 + " ----> " + result);
	}

	/**
	 * 最长回文子串 #5 Input: "babad" Output: "bab"
	 */
	public static String longestPalindrome(String s) {
		if (s != null && s.length() <= 1) {
			return s;
		}
		StringBuilder container = new StringBuilder();
		int max = 0;
		int temp = 0;
		String currentResultStr = "";

		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i; j <s.length(); j++) {
				char c = s.charAt(j);
				container.append(String.valueOf(c));
				if (isPalindrome(container.toString())) {
				    temp++;
					if (max < temp) {
						max = temp;
						currentResultStr = container.toString();
					}
				} else {
					temp ++ ;
				}
				if(j == s.length() -1) {
					temp = 0;
					container.delete(0, container.length());
				}
			}
		}
		return currentResultStr;
	}

	private static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
