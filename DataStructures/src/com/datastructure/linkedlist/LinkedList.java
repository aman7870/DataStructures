package com.datastructure.linkedlist;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void push(int number)
	{
		Node ob = new Node(number);
		ob.next = head;
		head=ob;
	}
	
	public void push_after(int prev, int number)
	{
		Node ob = new Node(number);
		Node temp = head;
		while(temp!=null)
		{
			if(temp.data == prev)
			{
				break;
			}
			temp=temp.next;
		}
		ob.next = temp.next;
		temp.next = ob;
	}
	
	public void add_last(int number)
	{
		Node ob = new Node(number);
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = ob;
	}
	
	public void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}


	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		
		li.push(1);
		li.push(2);
		li.push(3);
		li.push(4);
		li.push(5);
		li.push_after(2,9);
		li.add_last(7);
		li.printList();


	}

}
