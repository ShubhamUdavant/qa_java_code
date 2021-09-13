package org.emp;

import org.client.Client;
import org.company.*;
import org.project.Project;

public class Employee {

	public void empName() {
		// TODO Auto-generated method stub
		System.out.println("RAMESH");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName();
		
		Company cp = new Company();
		cp.companyName();
		
		Client ct = new Client();
		ct.clientName();
		
		Project pj = new Project();
		pj.projectName();
	}
}
