package com.programs;

public class MinElement {

	public static void main(String[] args) {
		int arr[] = {3,5,7,9,2,3,4};
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Minimum Element is "+min);

	}

}
