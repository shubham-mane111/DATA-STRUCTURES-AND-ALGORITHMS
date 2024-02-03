package com.programs;

public class SumOfnNaturalNo {
	
	public static void countSum(int sum , int n , int i)
	{
		if(i==n)
		{
			sum = sum+i;
			System.out.println(sum);
			return;
		}
		sum = sum+i;
		countSum(sum, n, i+1);
//		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n =5;
		int sum = 0;
		int i=1;
		countSum(sum, n , i);

	}

}
