package com.masai;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	public void overloaded() {
		System.out.println("Student Roll No :"+""+getRollNumber());
		System.out.println("Student name : "+" "+getStudentName() );
		System.out.println("Student Marks :"+" "+getMarks());
		
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
