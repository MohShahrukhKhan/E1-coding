package com.masai;

import java.util.Scanner;

public class Course {
int id;
String name;
int Fee;

void displayCourseDetails(int courseId,String courseName,int courseFee) {
	this.id=courseId;
	this.name=courseName;
	this.Fee=courseFee;
	System.out.println(id);
	System.out.println(name);
	System.out.println(Fee);
}

static void authenticate(String username,String password) {
	if(username=="Admin"&&password=="1234") {
		Course cour=new Course();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter id");
		int courseId=input.nextInt();
		System.out.println("Enter Name");
		String courseName=input.next();
		System.out.println("Enter Fee");
		int courseFee=input.nextInt();
		
		cour.displayCourseDetails(courseId,courseName,courseFee);
	}else {
		System.out.println("Invalid Username or password");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		authenticate("Admin","1234");
		authenticate("admin","1334");
	}

}
