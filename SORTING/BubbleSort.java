package com.programs;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {6,3,9,2,1,8};
		int temp;
		for(int i=1; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
	}

}
