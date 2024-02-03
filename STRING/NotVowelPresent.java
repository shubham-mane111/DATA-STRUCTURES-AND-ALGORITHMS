package com.programs;

public class NotVowelPresent {

	public static void main(String[] args) {
		String str = "try";
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
				System.out.println("Vowels Present in String");
				count ++;
				break;
			}
		}
		if(count == 0)
		{
			System.out.println("Vowel NOT Present in a string");
		}
		

	}

}
