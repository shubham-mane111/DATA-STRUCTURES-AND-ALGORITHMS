package com.programs;

import java.util.Stack;

public class InsertInBottom {
	
	public static Stack<Integer> insertBottom(Stack<Integer> ss)
	{
		if(ss.isEmpty())
		{
			ss.push(10);
			return ss;
		}
		int element = ss.pop();
		insertBottom(ss);
		ss.push(element);
		return ss;
	}

	public static void main(String[] args) {
		Stack<Integer> ss =new Stack();
		ss.push(1);
		ss.push(2);
		ss.push(3);
		ss.push(4);
		System.out.println(insertBottom(ss));

	}

}
