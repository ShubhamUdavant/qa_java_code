package org.assignment8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class UserDefinedMap {
	public static void main(String[] args) {
		Map<Integer, String>hmap = new LinkedHashMap<Integer, String>();
		
		Scanner sc = new Scanner(System.in);
		Integer a = 0;
		java.lang.String b = null;
		Object String = b;
		for(int i = 0; i<=3; i++)
		{
			System.out.println("Enter the value for key and space with string");
			a = sc.nextInt();
			b = sc.nextLine();
			
			hmap.put(a, b);
			
		}
		for(Map.Entry<Integer, String> m : hmap.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
