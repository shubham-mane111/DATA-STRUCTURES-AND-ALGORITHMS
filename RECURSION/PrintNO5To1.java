package com.programs;

public class PrintNO5To1 {
	
	public static void printNumbers(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		
		printNumbers(n-1);
//		System.out.println(n);    these print at a time of return
	}

	public static void main(String[] args) {
		int n = 5;
		printNumbers(n);

	}

}
