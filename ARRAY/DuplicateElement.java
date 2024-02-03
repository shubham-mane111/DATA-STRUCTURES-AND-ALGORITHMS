package com.programs;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[] = {5,3,1,7,4,9,1,3,5};
		int count = 0;
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Duplicate Found " +a[i]);
					count++;
					
				}
			}
			
		}
		
		if(count == 0)
		{
			System.out.println("No Duplicate Element in ARRAY");
		}

	}

}
