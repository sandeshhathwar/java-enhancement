/*
 * Program to create new string consisting of only characters at even index
 */
package com.strings.example;

/**
 * @author Suhas
 *24-May-2020 9:21:09 am
 */
public class Example3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "abcdefghijklmnop";
		String s2 = "";
		for(int index = 0;index<s1.length();index+=2)
		{
			s2 = s2+s1.charAt(index);
		}
		System.out.println(s2);
	}

}
