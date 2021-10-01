// 배열 값 중 0 값을 찾아 배열 뒤로 배치시키기
package com.answer;

import java.util.Arrays;

public class Answer {
	
	public static void reorder(int[]arr) {
		int j = 0;
		
		for (int item : arr) {
			if(item != 0) {
				arr[j] = item;
				j++;
			}
		}
	}

	public static void main(String[] args) {
	int [] arr = {6,0,8,2,3,0,4,0,1};
	
	reorder(arr);
	
	System.out.println(Arrays.toString(arr));

	}
}
