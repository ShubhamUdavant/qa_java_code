package org.assignment8;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapKey {
	public static void main(String[] args) {
		Map<Integer, String>emp = new LinkedHashMap<Integer, String>();
		
		emp.put(10, "java");
		emp.put(20, "sql");
		emp.put(30, "oops");
		emp.put(40, "Sql");
		emp.put(50, "oracle");
		emp.put(60, "DB");
		emp.put(10, "selenuim");
		emp.put(50, "psql");
		emp.put(40, "Hadoop");
		
		System.out.println("Size of map is " +emp.size());
		System.out.println(emp);
	}

}
