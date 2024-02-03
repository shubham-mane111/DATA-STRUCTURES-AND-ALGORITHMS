package com.program;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int no= 11111;
		int ans=0;
		int i=0;
		while(no!=0)
		{
			int digit = no%10;
			
			if(digit == 1)
			{
				ans = (int)((Math.pow(2, i))+ans);
			}
			no = no/10;
			i++;
		}
		
		System.out.println(ans);

	}

}
