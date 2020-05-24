/*
 *Write a sample program to execute all the inbuilt methods of string class 
 */
package com.strings.example;

/**
 * @author Suhas
 *24-May-2020 8:33:42 am
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "HELLO";
		String s2 = "hello";
		System.out.println("Length of string 1:"+s1.length());
		System.out.println("Length of string 2:"+s2.length());
		boolean b = s1.equals(s2);
		System.out.println("String1 = String2:"+b);
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		System.out.println("\nPrinting the character array1");
		for(int index = 0;index<c1.length;index++)
		{
			System.out.println("Character at "+index +" is "+c1[index]);
		}
		System.out.println("\nPrinting the character array2");
		for(int index = 0;index<c2.length;index++)
		{
			System.out.println("Character at "+index +" is "+c2[index]);
		}
		char c = s1.charAt(2);
		System.out.println("\nCharacter at that position: "+ c);
		boolean b2 = s1.equalsIgnoreCase(s2);
		System.out.println("Ignoring cases:"+ b2);
	}

}
