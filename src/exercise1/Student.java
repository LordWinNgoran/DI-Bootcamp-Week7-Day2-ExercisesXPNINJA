//Exercise 1 : Encapsulation Student
/*
* @author: N'goran Kouadio Jean Cyrille
* 
* @description: In this example program, we are creating a class Student and declare variables 
* stdName, stdRollNo, and stdId as private
* date: 06/02/2023
*/

package exercise1;

public class Student {

	private String stdName;
	private int stdRollNo;
	private int stdID;

	// constructor without parametter
	public Student() {
	}

	public Student(String stdName, int stdRollNo, int stdID) {
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdID = stdID;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
}
