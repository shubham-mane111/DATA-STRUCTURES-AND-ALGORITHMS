package com.programs;

public class NotDuplicate {

	public static void main(String[] args) {
		int a[] = {5,3,1,7,1,3,5};
		int count = 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;	
				}
			}
			if(count == 0)
			{
				System.out.println("Element that appear once " +a[i]);
				break;
			}
			count = 0;
		}

	}

}
