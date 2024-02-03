package com.programs;

import java.util.Scanner;

public class TwoStackInOneArray {
	int top1;
	int top2;
	
	public TwoStackInOneArray(int n) {
		top1 = -1;
		top2 = n;
	}
	
	public void push(int arr[] , int endLen)
	{
		top1++;
		if(top1 == endLen)
		{
			System.err.println("Stack is Overflow ");
		}
		else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element");
		int no = sc.nextInt();
		arr[top1] = no;
		System.out.println("Element inserted");
		}
	}
	
	public void push2(int arr[] , int endLen)
	{
		top2--;
		if(top2 == endLen)
		{
			System.err.println("Stack is Overflow ");
			top2++;
		}
		else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element");
		int no = sc.nextInt();
		arr[top2] = no;
		System.out.println("Element inserted");
		}
	}
	
	public void pop()
	{
		
		if(top1==-1)
		{
			System.out.println("Stack is Underflow");
		}
		else {	
	    System.out.println("Element Deleted");
	    top1--;
		}
	}
	
	public void pop2(int n)
	{
		
		if(top2==n)
		{
			System.out.println("Stack is Underflow");
		}
		else {	
	    System.out.println("Element Deleted");
	    top2++;
		}
	}
	
	public void peek(int arr[])
	{
		if(top1==-1)
		{
			System.out.println("Element NOT present");
		}
		else {
			System.out.println("Peek Element "+arr[top1]);
		}
	    
	}
	
	public void peek2(int arr[] , int n)
	{
		if(top2==n)
		{
			System.out.println("Element NOT present");
		}
		else {
			System.out.println("Peek Element "+arr[top2]);
		}
	    
	}
	 

	public static void main(String[] args) {
		int n=8;
		int arr[] = new int[n];
		int endLen = n/2;
		TwoStackInOneArray ts = new TwoStackInOneArray(n);
		
		ts.push2(arr,endLen);
		ts.push2(arr,endLen);
		ts.push2(arr,endLen);
		ts.push2(arr,endLen);
		

		ts.pop2(n);
		ts.pop2(n);
		
		

		ts.peek2(arr , n);
		System.out.println("Remaining Element");
		
		for(int i=ts.top2; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
