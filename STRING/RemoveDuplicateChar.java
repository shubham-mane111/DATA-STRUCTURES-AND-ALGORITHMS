package com.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "shubhamsah";
		String str1 = "";
		Set st = new LinkedHashSet<>();
		for(int i=0; i<str.length(); i++)
		{
			st.add(str.charAt(i));
		}
		
		for(Object ch :st)
		{
			str1 = str1+ch;
		}
		
		System.out.println(str1);

	}

}
