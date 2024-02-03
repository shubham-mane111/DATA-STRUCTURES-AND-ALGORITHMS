package com.programs;

import java.util.Arrays;

//Input: N = 7, A = 2, B = 5
//arr[] =  {1, 4, 5, 2, 7, 8, 3}
//Output: Yes
//Explanation: It has elements between 
//range 2-5 i.e 2,3,4,5



public class ElementInTheRang {

	public static void main(String[] args) {
		int arr[] =  {1, 4, 5, 7, 8, 3};
		int A = 2;
		int B = 5;
		int count=0;
		for(int i=A; i<=B; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j] == i)
				{
					count++;
					break;
				}
				
			}
		}
		
		if(count == (B-A+1))
		{
			System.out.println("Element in Range");
		}
		else {
			System.out.println("Element NOT in Range");
		}

	}

}
