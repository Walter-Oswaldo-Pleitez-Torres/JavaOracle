package student;

import java.util.Scanner;

public class Student {
	private int studentId;
	private String name;
	private String ssn;
	private double gpa;
	
	public final int SCHCODE = 34958;
	
	public Student() {//CONSTRUCTOR
		
		
	}
	
	//GETTERS AND SETTERS
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId 
				+ ", name=" + name + ", ssn=" 
				+ ssn + ", gpa=" + gpa + "]";
	}
	
	
	
}
