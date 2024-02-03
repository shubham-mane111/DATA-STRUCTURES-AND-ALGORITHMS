package com.program;

public class HowManyOne {

	public static void main(String[] args) {
		int no = 7;
		int count = 0;
		
		while(no !=0)
		{
			int bit = no & 1;
			
			if(bit==1)
			{
				count++;
			}
			no = no>>1;
		}
		
		System.out.println(count);

	}

}
