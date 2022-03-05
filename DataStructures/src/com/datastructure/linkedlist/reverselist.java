package com.datastructure.linkedlist;


//reverse a linked list
class Node{
	int val;
	Node next;
	
	Node(int n)
	{
		val=n;
		next=null;
	}
}

public class reverselist {
	
	Node head;
	
	public void reverse()
	{
		Node prv=null,next=null,current=head;
		while(current!=null)
		{
			next = current.next;
			current.next = prv;
			prv=current;
			current = next;
		}
		
		head = prv;
		
	}
	
	public void add(int n)
	{
		Node ob = new Node(n);
		if(head == null)
		{
			head = ob;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=ob;
		}
		
	}
	
	public void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		
		
		reverselist ob = new reverselist();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(5);
		ob.print();
		ob.reverse();
		ob.print();
		
      
	}

}
