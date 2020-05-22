/**
 * 
 */
package com.accessmodifiers.practice;

/**
 * @author Sandesh
 * 11:31:46 PMMay 14, 2020
 */
 class Student 
{ 
	/* protected */ String fname = "John";
	/* protected */ String lname = "Doe";
	/* protected */ String email = "john@doe.com";
	/* protected */ int age = 24; 
} 

/**
 * @author Sandesh
 * 11:31:14 PMMay 14, 2020
 */
public class ProtectedMOdifiers extends Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* private */ int graduationYear = 2018;
		Student myObj = new Student();
		/*
		 * System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		 * System.out.println("Email: " + myObj.email); System.out.println("Age: " +
		 * myObj.age); System.out.println("Graduation Year: " + myObj.graduationYear);
		 */
		 
		 
		 System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		 System.out.println("Email: " + myObj.email);
		 System.out.println("Age: " + myObj.age);
		 //System.out.println("Graduation Year: " + myObj.graduationYear);
	}

}
