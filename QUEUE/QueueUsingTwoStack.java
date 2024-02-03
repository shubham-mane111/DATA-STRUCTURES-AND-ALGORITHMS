package com.programs;

import java.util.Stack;

public class QueueUsingTwoStack {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	public void addElement(int element)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.add(element);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	public int remove()
    {
        return s1.pop();
    }
	public static void main(String[] args) {
		QueueUsingTwoStack qs = new QueueUsingTwoStack();
		qs.addElement(10);
		qs.addElement(20);
		qs.addElement(30);
		System.out.println(qs.remove());

	}

}
