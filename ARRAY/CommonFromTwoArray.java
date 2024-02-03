package com.programs;

public class CommonFromTwoArray {

	public static void main(String[] args) {
		int arr1[] = {3,2,7,5,8};
		int arr2[] = {9,10,15,12,3};
		
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println("Common Element "+arr1[i]);
				}
			}
		}

	}

}
