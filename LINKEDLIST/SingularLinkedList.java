package com.programs;

public class SingularLinkedList {
	
	Node head = null;
	Node tail = null;
	
	class Node
	{
		int data;
		Node next = null;
		
		Node(int data)
		{
			this.data = data;	
		}
	}
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	void addLast(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void deleteFirst()
	{
		if(head == tail)
		{
			head = null;
			tail = null;
		}
		
		head = head.next;
	}
	
	public void deleteEnd()
	{
		if(head == tail)
		{
			head = null;
			tail = null;
		}
		else {
		Node currentNode = head;
		while(currentNode != null)
		{
			
			if(currentNode.next == tail)
			{
				tail = currentNode;
				tail.next = null;
			}
			currentNode = currentNode.next;
			
		}
		}
	}
	
	public void deleteMid(int element)
	{
		
		if(head == tail)
		{
		 if(head.data == element)
		 {
			head = null;
			tail = null;
		 }
	    }
		
		if(head.data == element){
	           head=head.next;
	       
	        }
		Node current = head;
		
			while(current != null)
			{
				if(current.next == null)
				{
					break;
				}
				if(current.next.data == element)
				{
					current.next = current.next.next;
					break;
				}
				current = current.next;
			}
		
		
	}
	
	
	public void display()
    {
        Node current = head;

        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
              while(current != null)
              {
                 System.out.println(current.data);
                 current=current.next;
              }
        }
    }
	
	public void searchElement(int element)
	{		
		Node current = head;
		
			while(current != null)
			{
				if(current.data == element)
				{
					System.out.println("Element Found");
					break;
				}
				current = current.next;
			}
		
		
	}
	
	public void findLength()
	{
		int length = 0;
		Node current  = head;
		while(current != null)
        {
           length++;
           current=current.next;
        }
		System.out.println("Length is  "+length);
		
	}

	public static void main(String[] args) {
		SingularLinkedList sll = new SingularLinkedList();
		sll.addLast(10);
		sll.addLast(20);
		sll.addLast(30);
		
//		sll.searchElement(30);
		sll.deleteMid(20);
		System.out.println("After deletion");
		sll.display();
		sll.findLength();

	}

}
