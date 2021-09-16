package org.assignment8;

//import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashPrintKeyOnly {
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
		
		Set<Entry<Integer, String>> es = emp.entrySet();
		for (Entry<Integer, String> x : es)
		{
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		}

}
