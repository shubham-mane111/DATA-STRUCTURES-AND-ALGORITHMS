package com.programs;

public class CircularLinkedList {
	
	Node head = null ;
	Node tail = null ; 
	
	class Node{
		
		int data;
		Node next = null;
		
		public Node(int data)
		{
			this.data = data ;
		}
	}
	
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		
		tail.next = newNode;
		tail = newNode;
		tail.next = head;
	}
	
	public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            
            newNode.next=head;
            head=newNode;
            tail.next=head;
            // System.out.println("addedd successfully"+newNode.data);
        }
    }
	
	public void deleteFirst()
	  {
	    if(head==tail)
	    {
	        head=tail=null;
	    }
	    else{
	        Node current = head;
	        head=current.next;
	        tail.next=head;

	    }
	  }
	
	public void deleteEnd()
	  {
	    if(head==tail)
	    {
	        head=tail=null;
	    }
	    else{
	        Node current = head;
	        while(!(current.next==tail)){
	             current=current.next;
	        }
	        current.next = head;
	        tail.next=null;
	        tail=current;
	    }
	  }
	
	public void display()
	{
		Node current = head;
		
		while(true)
		{
			System.out.println(current.data);
			current = current.next;
			if(current == head)
			{
				break;
			}
		}
	}
	
	

	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		cl.addLast(10);
		cl.addLast(20);
		cl.addLast(30);
		cl.display();

	}

}
