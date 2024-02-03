package com.programs;

public class MergeTwoArray {

	public static void main(String[] args) {
		 int arr1[] = {3,5,7,1,9,2};
		 int arr2[] = {11,15,17,19,21};
		 int length1 = arr1.length;
		 int length2 = arr2.length;
		 int length = length1+length2;
		 int arr[] = new int[length];
		 
		 for(int i=0; i<length1; i++)
		 {
			 arr[i] = arr1[i];
		 }
		 
		 int j=0;
		 for(int i=length1; i<length; i++)
		 {
			 arr[i] = arr2[j];
			 j++;
		 }
		 
		 for(int k=0; k<arr.length; k++)
		 {
			 System.out.println(arr[k]);
		 }
		 

	}

}
