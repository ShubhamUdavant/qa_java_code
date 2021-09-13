package org.ssam;

import java.util.ArrayList;
import java.util.List;

public class collect {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		//print the list statement
		System.out.println(li);
		
		//print the size of list
		int si = li.size();
		System.out.println(si);
		
		Integer in = li.get(3);
		System.out.println(in);

		int io = li.indexOf(10);
		System.out.println(io);
		
		int lo = li.lastIndexOf(10);
		System.out.println(10);
		
		// to add the value between the list
		li.add(3,100);
		System.out.println(li);
		
		//to remove the value from the list
		li.remove(3);
		System.out.println(li);
		
		//to replace the value in the list
		li.set(4, 500);
		System.out.println(li);
		
		//to copy all the values from one list to other
		l2.addAll(li);
		System.out.println(l2);
		l2.add(10000);
		System.out.println(li);
		System.out.println(l2);
		
		// to remove the commen value
		l2.removeAll(li);
		System.out.println(l2);
		
		//to retain the commen value
		l2.retainAll(li);
		System.out.println(l2);
		
		//for loop in list
		for(int i = 0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
	}

}
