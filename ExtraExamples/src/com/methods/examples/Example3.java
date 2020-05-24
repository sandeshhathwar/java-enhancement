/*
 *Write a function which return true if the sum of 3 number is divisible by 3 and return 5 if the sum i divisible by 5 
 */
package com.methods.examples;

/**
 * @author Suhas
 *23-May-2020 11:37:44 am
 */
public class Example3 {

	/**
	 * @param args
	 */
	
	public static boolean sum(int a, int b, int c)
	{
		if((a+b+c)/3 == 0)
		{
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		boolean res = sum(2,5,9);
		System.out.println(res);
	}

}
