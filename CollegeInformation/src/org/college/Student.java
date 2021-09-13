package org.college;

public class Student extends Hostel{
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("Ramesh");
	}
	private void studentDept() {
		// TODO Auto-generated method stub
System.out.println("Computer Department");
	}
	private void studentId() {
		// TODO Auto-generated method stub
System.out.println("21510320181124510145");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		
		st.collegeRank();
		st.collegeCode();
		st.collegeName();
		
		st.studentDept();
		st.studentId();
		st.studentName();
		
		st.HostelName();
		
		st.deptName();
	}

}
