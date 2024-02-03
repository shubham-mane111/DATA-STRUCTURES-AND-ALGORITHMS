package com.programs;

public class CommonFromThreeArray {

	public static void main(String[] args) {
		int arr1[] = {3,2,7,5,8};
		int arr2[] = {9,10,5,12,3};
		int arr3[] = {1,11,5,12,3};
		
		
//		for(int i=0; i<arr1.length; i++)
//		{
//			for(int j=0; j<arr2.length; j++)
//			{
//				if(arr1[i] == arr2[j])
//				{
//					for(int k=0; k<arr3.length; k++)
//					{
//						if(arr1[i] == arr3[k])
//						{
//							System.out.println("common Element " +arr1[i]);
//						}
//					}
//				}
//			}
//		}
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if((arr1[i] == arr2[j]) && (arr1[i] == arr3[j]))
				{
					System.out.println("common Element " +arr1[i]);
				}
			}
		}
	}

}
