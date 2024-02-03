package com.programs;

public class FibonacciSeries {
	public static void fibonacciii(int a , int b , int n)
	{
		if(n == 0)
		{
			return;
		}
		
		int c = a+b;
		System.out.println(c);
		
		fibonacciii(b, c , n-1);
		
//		System.out.println(c);    if we want to print reverse fibonacci series
	}
	public static void main(String[] args) {
		int a = 0;
		int b= 1;
		int n=7;
		System.out.println(a);
		System.out.println(b);
		
		fibonacciii(a, b, n-2);
		

	}
}
