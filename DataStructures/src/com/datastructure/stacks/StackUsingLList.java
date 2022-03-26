package com.datastructure.stacks;

//Stack Implementation using Linked List

public class StackUsingLList {
	
    public class Node{
    	int val;
    	Node next;
    	Node(int v){
    		val=v;
    		next=null;
    	}
    }
	
    Node start = null;
	public void pop()
	{
		if(start==null)
		{
			System.out.println("Stack Empty");
		}
		else
		{
			System.out.println(start.val);
			start = start.next;
		}
	}
	
	public void push(int val)
	{
		if(start==null)
		{
			Node temp = new Node(val);
			start=temp;
			System.out.println("Stack Empty");
		}
		else
		{
			Node temp = new Node(val);
			temp.next = start;
			start = temp;
			System.out.println("Data Pushed" + val);
		}
	}
	
	

	public static void main(String[] args) {
		StackUsingLList temp = new StackUsingLList();
		temp.push(1);
		temp.push(2);
		temp.push(3);
		temp.push(4);
		temp.push(5);
		temp.pop();
		temp.pop();
		

	}

}
