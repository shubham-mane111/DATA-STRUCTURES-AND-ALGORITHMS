package com.programs;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2,5,7,8,10,15};
		int i=0;
		int j=arr.length-1;
		
		int key = 15;
		
		while(i<=j)
		{
			int mid = (i+j)/2;
			
			if(arr[mid] == key)
			{
				System.out.println("Element is fount at Index " +mid);
				break;
			}
			else if(key < arr[mid])
			{
				j=mid-1;
			}
			else if(key > arr[mid])
			{
				i = mid+1;
			}
		}
		if(i>j)
		{
			System.out.println("Element is not found");
		}

	}

}
