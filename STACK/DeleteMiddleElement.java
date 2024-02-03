package com.programs;

import java.util.Stack;

public class DeleteMiddleElement {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        int n=s.size();
        int mid = n/2 ;
        s.remove(mid);
        
        System.out.println(s);

	}

}
