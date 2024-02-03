package com.programs;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {3,7,1,5,2};
		int first = 0;
		int last = arr.length-1;
		int temp;
		
		while(first<=last)
		{
			temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			
			first++;
			last--;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
