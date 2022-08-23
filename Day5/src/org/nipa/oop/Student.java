package org.nipa.oop;

public class Student extends Person {
	
	//only student's attribute
	private String major; 
	private int number;
	private String school;
	
	//Constructor
	public Student(String name, int age, boolean isMale) {
		
		super(name, age, isMale); //Super class (Person)	
	}	
	
	
	//Constructor (super attribute )
	public Student(String name, int age, boolean isMale, String major, int number, String school) {
		super(name, age, isMale);
		this.major = major;
		this.number = number;
		this.school = school;
	}

	//Getters and Setters
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	

}
