package com.programs;

public class CountNoOfWords {

	public static void main(String[] args) {
		String str = "  shubham mane is computer Engg" ; 
		str= str.strip();
		int count = 1;
		for(int i=0 ; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
