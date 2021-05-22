package org.student;

import org.department.Department;

public class Student extends Department {
	public String studentName(String sname) {
		// TODO Auto-generated method stub

		//sname="Ragavan";
		System.out.println(sname);
		return sname;
		
	}
	public void studentDept() {
		// TODO Auto-generated method stub
      System.out.println("IT");
	}
	public int studentId(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return id;

	}
	public static void main(String[] args) {
		Student st=new Student();
		st.studentDept();
		st.studentId(41);
		st.studentName("Ragavan");
		st.depName("CSE");
		st.collegeName("CKCET");
		st.collegeCode("3511");
		st.collegeRank(356);
		
	}
}
