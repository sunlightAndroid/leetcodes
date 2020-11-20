package com.eric;

import java.util.ArrayList;
import java.util.List;

public class ShuffleArray {
	
	
	public static void main(String[] args) {

	}
	
	
	 public static int[] shuffle(int[] nums, int n) {
	      int[] result = new int[nums.length];
			List<Integer> list= new ArrayList<>();
			
			for (int i = 0; i < nums.length; i++) {
				 int num  = nums[i];
				 if( i <= n-1) {
					int xn = nums[i];
					int yn =nums[i+n]; 
					list.add(xn);
					list.add(yn);
				 }
			}
			
			for (int i = 0; i < list.size(); i++) {
				result[i] = list.get(i);
			}
			
			return result;
	    }
}
