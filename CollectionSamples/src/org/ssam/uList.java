package org.ssam;

import java.util.ArrayList;
import java.util.List;

public class uList {
	public static void main(String[] args) {
		List<EmployeeClass> emp = new ArrayList<EmployeeClass>();
		
		EmployeeClass ec = new EmployeeClass();
		
		ec.setId(1);
		ec.setName("Java");
		ec.setGmail("java@gmail.com");
		ec.setPhoneNo(8329368424l);
		
		EmployeeClass ec2 = new EmployeeClass();
		
		ec2.setId(2);
		ec2.setName("kali");
		ec2.setGmail("kali@gmail.com");
		ec2.setPhoneNo(9999368424l);
		
		EmployeeClass ec3 = new EmployeeClass();
		
		ec3.setId(3);
		ec3.setName("Kotlin");
		ec3.setGmail("Kotlin@gmail.com");
		ec3.setPhoneNo(915679368424l);
		
		//To add to list
		emp.add(ec);
		emp.add(ec2);
		emp.add(ec3);
		
		for(EmployeeClass x: emp) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhoneNo());
			System.out.println(x.getGmail());
		}
			EmployeeClass ecm = emp.get(1);
				System.out.println(ecm.getId());
				System.out.println(ecm.getName());
				System.out.println(ecm.getPhoneNo());
				System.out.println(ecm.getGmail());
		
	}

}
