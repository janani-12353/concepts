package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("janani");
	}
	public void studentDept() {
		System.out.println("maths");
	}
	public void StudentId() {
		System.out.println("001");
	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.collegeName();
		stud.studentName();
		stud.studentDept();
		stud.StudentId();
	}

}
