package com.weak1day3;

public class Student {
	 int roll;
	 String name;
	 int marks;
	 void displayStudentDetails(int r , String n, int m ) {
		 System.out.println("Roll is:"+r);
		 System.out.println("Name is:"+n);
		 System.out.println("Marks is:"+m);
		 System.out.println("=============================================");
	 }
     public static void main(String[] args) {
	    Student s1=new Student();
	    s1.displayStudentDetails(s1.roll=2, s1.name="Hitendra", s1.marks=90);
	    
	    Student s2=s1;
	    s2.displayStudentDetails(s1.roll=3, s1.name="Ram", s1.marks=45);
	    s1=null;
	  
	}
}
