/*
Write a function which returns true given 2 number are same else return false
 * 
 */
package com.methods.examples;

/**
 * @author Suhas
 *23-May-2020 11:03:11 am
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static boolean same(int a, int b)
	{
		if (a==b)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		boolean res = same(2,5);
		System.out.println(res);

	}

}
