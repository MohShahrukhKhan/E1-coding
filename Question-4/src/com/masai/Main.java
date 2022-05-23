package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
System.out.println("Enter Number of Students you want to enter");
int number=input.nextInt();
Student stud=new Student();
for(int i=1;i<=number;i++) {
	System.out.println("Enter the Roll Number :");
	int RollNumber=input.nextInt();
	stud.setRollNumber(RollNumber);
	System.out.println("Enter the Name :");
	String name=input.next();
	stud.setStudentName(name);
	System.out.println("Enter the marks :");
	int marks=input.nextInt();
	stud.setMarks(marks);
	stud.overloaded();
	

	
}
	}

}
