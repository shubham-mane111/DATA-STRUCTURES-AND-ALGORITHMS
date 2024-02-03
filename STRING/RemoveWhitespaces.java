package com.programs;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		
		String str = "shubham mane" ; 
		String str2 = "";
		for(int i=0 ; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(!(ch==' '))
			{
				str2 = str2+ch;
			}
		}
		System.out.println(str2);

	}

}
