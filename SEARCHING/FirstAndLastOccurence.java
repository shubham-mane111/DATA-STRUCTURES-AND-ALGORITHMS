package com.programs;

public class FirstAndLastOccurence {

	public static void main(String[] args) {
		int arr[] = {1,5,3,4,6,5,5};
		int first = -1;
		int last = -1;
		int key =5;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key && first==-1)
			{
				first = i;
			}
			
			if(arr[i] == key && first!=-1)
			{
				last = i;
			}
			
		}
		
		System.out.println(first);
		System.out.println(last);

	}

}
