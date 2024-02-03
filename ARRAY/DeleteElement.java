package com.programs;

public class DeleteElement {

	public static void main(String[] args) {
	   int arr[] = {3,5,7,1,9,2};
	   int n = arr.length;
	   int position = 2;
	   
	   for(int i=position; i<n-1; i++)
	   {
		   arr[i] = arr[i+1];
	   }
	   
	   for(int i=0; i<n-1; i++)
	   {
		   System.out.println(arr[i]);
	   }
	   
//	   for(int i : arr)
//		{
//			System.out.println(i);
//		}

	}

}
