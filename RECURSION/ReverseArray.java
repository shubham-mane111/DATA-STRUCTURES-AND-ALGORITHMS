package com.programs;

public class ReverseArray {
	
	public static void reverseArr(int arr[] , int n , int i)
	{
		if(i==n)
		{
			return;
		}
		int element = arr[i];

		reverseArr(arr, n, i+1);
		System.out.print(element+" ");
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int i=0;
		reverseArr(arr, n, i);

	}

}
