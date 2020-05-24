/*
 * Write a function that returns true if the first and middle character of a string is same else return false 
 */
package com.strings.example;

/**
 * @author Suhas
 *24-May-2020 9:01:01 am
 */
public class Example2 {

	/**
	 * @param args
	 */
	public static boolean test(String s1)
	{
		int mid = s1.length()/2;
		if(s1.charAt(0)==s1.charAt(mid))
		{
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		String s1 = "lololol";
		boolean b = test(s1);
		System.out.println(b);
	}

}
