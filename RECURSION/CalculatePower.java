package com.programs;

public class CalculatePower {
	
	public static int calcuPower(int x , int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		// logic behind it
       //x*x^n-1 = x^n
		
		int xPownm1 = calcuPower(x, n-1);
		int xPowrn = x*xPownm1;
		
		return xPowrn;
	}

	public static void main(String[] args) {
		int ans = calcuPower(2, 5);
		System.out.println(ans);
	}

}
