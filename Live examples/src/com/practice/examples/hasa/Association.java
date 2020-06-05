/*
 * 
 */
package com.practice.examples.hasa;

/**
 * @author Suhas
 *04-Jun-2020 10:43:10 am
 */
class Customer{
	String name;
	int mbl_number;
	int age;
	Customer(String name,int mbl_number,int age){
		this.age = age;
		this.mbl_number = mbl_number;
		this.name = name;
	}
	public void display() {
		System.out.println("The name of customer = "+name);
		System.out.println("The age of customer = "+age);
		System.out.println("The mobile number of customer = "+mbl_number);
	}
}

class Car{
	public static Customer C = new Customer("Sandesh",24,1234567890);
}
public class Association {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car.C.display();

	}

}
