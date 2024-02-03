package com.programs;

import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {
		int arr[] = {5,4,2,8,6,9,1};
		Arrays.sort(arr);
		System.out.println("Second Largest Element "+ arr[arr.length-2]);
		System.out.println("Fifth Largest Element "+ arr[arr.length-5]);
		

	}

}
