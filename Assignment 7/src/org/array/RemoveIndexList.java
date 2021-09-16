package org.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveIndexList {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(100);
		
		System.out.println(li);
		
		//remove the value present at 2nd index
		li.remove(3);
		System.out.println("afteer removing the index 3" +li);
		
		//remove the comman values from the list
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(li);
		l1.removeAll(li);
		System.out.println(l1);
		}


}
