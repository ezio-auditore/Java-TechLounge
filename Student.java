//package com;
public class Student{
		private int rollNo;
		private double marks;
		private String name;
	public Student(int rollNo,String name,double marks){
		this.rollNo=rollNo;
		this.marks=marks;
		this.name=name;
	}
	public double getMarks(){
		return marks;
	}
	public void setMarks(double marks){
		this.marks=marks;
	}
	public double getrollNo(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
	
}