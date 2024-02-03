package com.programs;

public class FindLengthOfString {

	public static void main(String[] args) {
		String str = "Shubham";
		char ch[] = str.toCharArray();
		int len = 0;
		for(char c : ch)
		{
			len++;
		}
		
		System.out.println(len);
		
		
		
		
//		int len = str.length();
//		System.out.println(len);
	}

}
