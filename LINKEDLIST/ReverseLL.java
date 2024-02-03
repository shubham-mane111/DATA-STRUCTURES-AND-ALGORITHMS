package com.programs;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        Stack<Integer> s = new Stack<>();
        while(!(ll.isEmpty()))
        {
            s.push(ll.removeFirst());
        }
        // System.out.println(s);
        // System.out.println(ll);
        while(!(s.isEmpty()))
        {
            ll.add(s.pop());
        }
        System.out.println(ll);

    }
}