package com.programs;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String str = "shubham";
		String str1="";
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<str.length(); i++)
		{
			s.push(str.charAt(i));
		}
		
		while(!s.isEmpty())
		{
			
			str1 = str1 + s.pop();
		}
		System.out.println(str1);

	}

}
