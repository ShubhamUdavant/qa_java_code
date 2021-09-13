package org.tcs.canada.billing;

import com.svu.prj.login.CourseDetails;
import com.svu.prj.login.EmployeeDetails;

public class ClientDetails {

	private void clientName() {
		// TODO Auto-generated method stub
System.out.println("San");
	}
	private void clientLocation() {
		// TODO Auto-generated method stub
System.out.println("bangloru");
	}
	public static void main(String[] args) {
		ClientDetails cl = new ClientDetails();
		cl.clientLocation();
		cl.clientName();
		
		CourseDetails cou = new CourseDetails();
		cou.javaCourse();
		cou.seleniumCource();
		
		EmployeeDetails ed = new EmployeeDetails();
		ed.empID();
		ed.empName();
	}
}
