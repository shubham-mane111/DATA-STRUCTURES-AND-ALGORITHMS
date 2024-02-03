package com.programs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
	
	static Stack<Integer> s = new Stack<>();
	public static Queue<Integer> reverseQueue(Queue<Integer> q)
	{
		while(!q.isEmpty())
		{
			s.push(q.remove());
		}
		
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		
		return q;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(reverseQueue(q));
		

	}

}
