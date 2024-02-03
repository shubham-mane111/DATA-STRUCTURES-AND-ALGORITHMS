package com.programs;

public class Factorial {
	
	public static void findFact(int fact , int n)
	{
		if(n==1)
		{
			System.out.println(fact);
			return;
		}
		fact = fact*n;
		findFact(fact, n-1);
	}

	public static void main(String[] args) {
		findFact(1, 5);

	}

}
