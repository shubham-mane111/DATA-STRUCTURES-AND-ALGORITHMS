package com.programs;

public class InsertElement {

	public static void main(String[] args) {
		int arr[] = {10,20,40,50,60};
		int n = arr.length;
		for(int i=n-1; i>2; i--)
		{
			arr[i] = arr[i-1];
			
		}
		arr[2] = 30;
		
		for(int i : arr)
		{
			System.out.println(i);
		}

	}

}
