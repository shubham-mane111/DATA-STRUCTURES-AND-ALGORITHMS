package com.programs;

public class DoublyLinkedList {
	
	Node head = null;
	Node tail = null;
	
	class Node{
		
		int data ;
		Node next ;
		Node prev ; 
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		if(head == null )
		{
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			
		}
		
	}
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null )
		{
			head = newNode;
			tail = newNode;
		}
		else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			
		}
		
	}
	
	public void removeLast()
	{
		if(head == null)
		{
			System.out.println("List is empty ");
			return;
		}
		if(head == tail)
		{
			head=tail=null;
			System.out.println("Element deleted");
			return;
		}
		
		tail = tail.prev;
		tail.next = null;
		System.out.println("Element deleted");
	}
	
	
	public void removeFirst()
	{
		if(head == null)
		{
			System.out.println("List is empty ");
			return;
		}
		if(head == tail)
		{
			head=tail=null;
			System.out.println("Element deleted");
			return;
		}
		head = head.next;
		head.prev = null;
		System.out.println("Element deleted");
	}
	
	
	
	public void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void displayReverse()
	{
		Node current = tail;
		while(current != null)
		{
			System.out.println(current.data);
			current = current.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.addLast(10);
		dl.addLast(20);
		dl.addFirst(30);
		dl.addFirst(40);
		dl.display();
//		System.out.println("After Reverse ");
//		dl.displayReverse();
//		dl.removeFirst();
//		System.out.println("After Deletion  ");
//		dl.display();
		

	}

}
