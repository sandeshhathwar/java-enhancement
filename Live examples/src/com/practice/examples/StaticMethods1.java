/*
 *Accessing static methods present in different class 
 *Private static methods cannot be accessed in another class
 */
package com.practice.examples;

/**
 * @author Suhas
 *03-Jun-2020 8:48:37 am
 */
class Sample{
	static int x = 9;
	protected static void test() {
		System.out.println("Testing protected methods");
	}
}

public class StaticMethods1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sample.test();
		System.out.println(Sample.x);
		

	}

}
