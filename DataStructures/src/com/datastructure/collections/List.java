package com.datastructure.collections;
import java.util.*;

public class List {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("grapes");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
