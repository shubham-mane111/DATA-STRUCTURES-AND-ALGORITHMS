package com.programs;

public class OccurenceOfEachChar {

	public static void main(String[] args) {
		String str = "shubhamsssaaaaa";
		char ch[] = str.toCharArray();
		int count=1;
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
				}
			}
			
			System.out.println("Element  "+ ch[i]+"  Found "+count +" Times");
			count=1;
		}

	}

}
