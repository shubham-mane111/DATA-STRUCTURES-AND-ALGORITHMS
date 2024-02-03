package com.programs;

public class MaxElement {

	public static void main(String[] args) {
		int arr[] = {3,5,7,9,2,3,4};
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Maximum Element is "+max);


	}

}
