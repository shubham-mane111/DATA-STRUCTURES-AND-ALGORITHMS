package com.program;

public class DecimalToBinary {

	public static void main(String[] args) {
		int no=5;
		int ans=0;
		int i=0;
		while(no!=0)
		{
			int bit = no &1;
			ans = (int) (bit*Math.pow(10 , i)) + ans;
			no = no >> 1;
			i++;
			
		}
		System.out.println(ans);

	}

}
