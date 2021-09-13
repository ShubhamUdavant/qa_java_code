package org.ssam;

//import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapMethod {
public static void main(String[] args) {
	Map<Integer, String> ma = new LinkedHashMap<Integer, String>();
	
	//To add the values top the map
	ma.put(10, "java");
	ma.put(20, "it");
	ma.put(30, "awt");
	ma.put(40, "java");
	ma.put(10, "null");
	System.out.println(ma);
	
	//to get particular value from the map
	String s = ma.get(30);
	System.out.println(s);
	
	// to check the particular key is present or not
	boolean p = ma.containsKey(20);
	System.out.println(p);
	
	//to check particular value is present
	boolean cv = ma.containsValue("st");
	
	//to print only the key from map
	Set<Integer> ks = ma.keySet();
	System.out.println(ks);
	
	//to print only the values
	Collection<String> va = ma.values();
	System.out.println(va);
	
	//Iterate the map by using for loop
	Set<Entry<Integer, String>> es = ma.entrySet();
	for (Entry<Integer, String> x : es)
	{
		System.out.println(x.getKey());
		System.out.println(x.getValue());
	}
	
}
}
