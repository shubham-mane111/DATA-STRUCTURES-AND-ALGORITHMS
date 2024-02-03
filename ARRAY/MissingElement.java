package com.programs;

public class MissingElement {
	public static void main(String[] args) {
		int a[] = {1,2,3,5};
		
		int ele = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != ele)
			{
				System.out.println("Missing Element" + ele);
				break;
			}
			
			ele++;
		}
	}

}
