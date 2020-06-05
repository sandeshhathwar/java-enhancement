/*
 * Accessing non static method within same class 
 */
package com.practice.examples;

/**
 * @author Suhas
 *04-Jun-2020 9:03:51 am
 */
public class NonStaticMethods {

	public void count() {
		System.out.println("Display non static method");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	NonStaticMethods N = new NonStaticMethods();
	N.count();
	System.out.println(N);
	}
}
