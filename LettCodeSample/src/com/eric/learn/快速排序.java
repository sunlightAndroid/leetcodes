package com.eric.learn;

public class 快速排序 {

	public static void main(String[] args) {
		int[] array = new int[] { 6, 5, 4, 3, 2, 1 };
		int[] array2 = new int[] { 6, 5, 3, 4, 3, 2, 1 };

		int[] array3 = new int[] { 10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19 };
		quickSort(array3, 0, array3.length - 1);
		 for (int i = 0; i < array3.length; i++) {
	             System.out.println(array3[i]);
	        }
	}

	/**
	 * https://blog.csdn.net/shujuelin/article/details/82423852
	 * 快速排序，也叫分而治之，先选出一个基准值，比他小的放左边，大的放右边，然后将左右两个数组排序 最终合起来就是有序的数组
	 */
	public static void quickSort(int[] arr, int low, int high) {
		int i, j, temp, t;
		if (low > high) {
			return;
		}
		i = low;
		j = high;
		// temp就是基准位
		temp = arr[low];

		while (i < j) {
			// 先看右边，依次往左递减
			while (temp <= arr[j] && i < j) {
				j--;
			}
			// 再看左边，依次往右递增
			while (temp >= arr[i] && i < j) {
				i++;
			}
			
			// 如果满足条件则交换
			if (i < j) {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
		
			}
		}
		// 最后将基准为与i和j相等位置的数字交换
		arr[low] = arr[i];
		arr[i] = temp;
		// 递归调用左半数组
		quickSort(arr, low, j - 1);
		// 递归调用右半数组
		quickSort(arr, j + 1, high);

	}

}
