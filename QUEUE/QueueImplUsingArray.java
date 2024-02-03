package com.programs;

public class QueueImplUsingArray {
	
	static int front = 0;
	static int rear = -1;
	
	public static void addElement(int element , int arr[])
	{
		if(rear == arr.length-1)
		{
			System.out.println("Queue is fulllll");
			return;
		}
		
		rear++;
		arr[rear] = element;
	}
	
	public static void deleteElement(int arr[])
	{
		if(rear == -1)
		{
			System.out.println("Queue is empty ");
			return;
		}
		for(int i=0; i<rear; i++)
		{
			arr[i] = arr[i+1];
		}
		rear--;
		System.out.println("Element deleted");
	}
	
	public static void display(int arr[])
	{
		for(int i=0; i<=rear; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void peekElement(int arr1[])
	{
		if(rear==-1)
		{
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Peek element is  "+arr1[front]);
	}
	

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		addElement(10, arr);
		addElement(20, arr);
		addElement(30, arr);
//		deleteElement(arr);
		display(arr);
		System.out.println();
		peekElement(arr);

	}

}
