package com.programs;

public class AddAllDigit {

	public static void main(String[] args) {
//		 String s ="4PREP2INSTAA6";
//		   int sum=0;
//		   for (int i = 0; i < s.length(); i++) {
//		      if(Character.isDigit(s.charAt(i))) 
//		      sum=sum+Character.getNumericValue(s.charAt(i));
//		      }
//		   System.out.println("Sum of all the digit present in String : "+sum);
		
		String str = "java4by2ki6ran";
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch=='0'|| ch=='1'|| ch=='2'|| ch=='3'|| ch=='4'|| ch=='5'|| ch=='6'|| ch=='7'|| ch=='8'|| ch=='9')
			{
				sum = sum+Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);

	}

}
