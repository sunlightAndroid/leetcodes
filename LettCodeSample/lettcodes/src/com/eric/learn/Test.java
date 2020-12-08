package com.eric.learn;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
			
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		List<Integer> result = sort(list);
		System.out.println(result.toString());
	}

	public static List<Integer> sort(List<Integer> list){
		if(list.size() < 2) return list;
		for (int i = 1; i < list.size(); i++) {
			for (int j = i; j >0; j -- ) {
				if(list.get(j) < list.get(j-1)) {
					int temp  = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
				}
			}
		}
		return list;
	}
}
