package com.programs;

public class LastIndexOfOne {
	
	 public int lastIndex( String s) {
	        
	        for(int i=s.length()-1; i>=0; i--)
	        {
	            if(s.charAt(i) == '1')
	            {
	                return i;
	            }
	        }
	        return -1;
	        
	    }

	public static void main(String[] args) {
		String s = "00001";
		LastIndexOfOne l = new LastIndexOfOne();
		System.out.println(l.lastIndex(s));

	}

}
