//Exercise 1 : Encapsulation Student
/*
* @author: N'goran Kouadio Jean Cyrille
* 
* @description: In this example program, we are creating a class Student and declare variables 
* stdName, stdRollNo, and stdId as private
* date: 06/02/2023
*/



package exercise1;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStdName("Kiran");
		student.setStdRollNo(4);
		student.setStdID(12345);

		System.out.println("Student's Name : " + student.getStdName());
		System.out.println("Student's RollNo : " + student.getStdRollNo());
		System.out.println("Student's ID : " + student.getStdID());
	}

}
