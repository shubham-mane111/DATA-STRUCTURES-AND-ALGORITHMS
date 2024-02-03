package com.programs;

import java.util.Scanner;

public class StackImplUsingArray {
	int top = -1;
	public void push(int arr[] , int n)
	{
		top++;
		if(top == n)
		{
			System.err.println("Stack is Overflow ");
		}
		else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element");
		int no = sc.nextInt();
		arr[top] = no;
		System.out.println("Element inserted");
		}
	}
	
	public void pop()
	{
		
		if(top==-1)
		{
			System.out.println("Stack is Underflow");
		}
		else {	
	    System.out.println("Element Deleted");
	    top--;
		}
	}
	
	public void peek(int arr[])
	{
		if(top==-1)
		{
			System.out.println("Element NOT present");
		}
		else {
			System.out.println("Peek Element "+arr[top]);
		}
	    
	}

	public static void main(String[] args) {
		StackImplUsingArray sa = new StackImplUsingArray();
		int arr[] = new int[5];
		int n = arr.length;
		sa.push(arr,n);
		sa.push(arr,n);
		sa.push(arr,n);
		sa.push(arr,n);
		sa.push(arr,n);
//		sa.push(arr,n);
		sa.pop();
		sa.pop();
		sa.pop();
//		sa.pop();
//		sa.pop();
//		sa.pop();
		sa.peek(arr);
		System.out.println("Remaining Element");
		for(int i=0; i<=sa.top; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
