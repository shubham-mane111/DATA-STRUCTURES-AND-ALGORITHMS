package com.programs;

public class TwoDimensional {

	public static void main(String[] args) {
		int a[][] = {{9},{8,1,3},{2,4,7}};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}
		}
	

	}

}
