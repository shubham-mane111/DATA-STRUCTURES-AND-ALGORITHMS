package com.programs;

public class FindVowels {

	public static void main(String[] args) {
		String str = "shubham";
		char ch[] = str.toCharArray();
		for(char cc: ch)
		{
			if(cc=='a' || cc=='e' || cc=='i' ||cc=='o' || cc=='u')
			{
				System.out.println(cc);
			}
		}

	}

}
