package com.programs;
// program not give proper output
import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSequense {

	public static void main(String[] args) {
		int arr[] = {3,9,1,10,4,20,2};
		Arrays.sort(arr);
		int ele = arr[0];
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == ele)
			{
				al.add(arr[i]);
			}
			ele++;
		}
		System.out.println(al);
		

	}

}
