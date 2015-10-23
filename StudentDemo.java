//package com;
public class StudentDemo{
	public static String compare(Student a,Student b,Student c){
		Student st =a;
		if(b.getMarks()>st.getMarks()){
			st=b;
		}
		if(c.getMarks()>st.getMarks()){
			st=c;
		}
		return st.getName();
	}
	
	public static void main(String args[]){
		Student one = new Student(1, "ravi", 45);
	    Student two = new Student(2, "amit", 65);
	    Student three = new Student(3, "pooja", 55);
	    
	    System.out.println("Student with Highest marks is: "+compare(one,two,three));
		
	}
}