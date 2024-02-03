package com.programs;

public class ReverseOrderOfWords {

	public static void main(String[] args) {
	     String str = "shubham balu mane";
	     String str1="";
	     int len = str.length();
	     for(int i=str.length()-1; i>=0; i--)
	     {
	    	 char ch = str.charAt(i);
	    	 if(ch == ' ')
	    	 {
	    		 str1 = str.substring(i+1, len);
	    		 System.out.print(str1+" ");
	    		 len = i;
	    	 }
	    	 if(i==0)
	    	 {
	    		 str1 = str.substring(0, len);
	    		 System.out.println(str1);
	    	 }
	    	 
	     }
	     
	}

}
