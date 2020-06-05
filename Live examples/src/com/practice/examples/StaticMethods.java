/*
 * Accessing static members present in same class 
 */
package com.practice.examples;

/**
 * @author Suhas
 *03-Jun-2020 8:42:04 am
 */
public class StaticMethods {
	
	static int x = 10;
	public static void count() {
		System.out.println("Static method");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(x);
		count();

	}

}
