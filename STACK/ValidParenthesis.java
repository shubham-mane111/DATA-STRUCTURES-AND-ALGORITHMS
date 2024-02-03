package com.programs;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<>();
        String str = "{[()]}";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='{' ||ch=='[' ||ch=='(')
            {
                s.push(ch);
            }
            else 
            {
                char top = s.peek();
                if((ch=='}'&& top=='{') ||ch==']'&& top=='[' ||ch==')'&&top=='(')
                {
                    s.pop();
                }
                
            }
        }
        if(s.isEmpty())
        {
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Invalid Parenthesis");
        }
        // System.out.println(s.peek());
    }

	}


