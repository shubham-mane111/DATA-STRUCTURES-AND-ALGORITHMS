package com.programs;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {2,6,4,8,6,9,1};
		int key = 16;
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				System.out.println(key +" Is Found on INDEX " +i);
				count++;
				break;
			}
		}
		
		if(count == 0)
		{
			System.out.println("Element NoT Found");
		}

	}

}
