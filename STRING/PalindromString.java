package com.programs;

public class PalindromString {

	public static void main(String[] args) {
		String str = "babaeb";
		char ch[] = str.toCharArray();
		int first = 0;
		int last = ch.length-1;
		int count =0;
		
		while(first<last)
		{
			if(!(ch[first]==ch[last]))
			{
				System.out.println("String is NOT Palindrom");
				count++;
				break;
			}
			
			first++;
			last--;
		}
		
		if(count == 0) {
		System.out.println("String is Palindrom");
		}

	}

}
