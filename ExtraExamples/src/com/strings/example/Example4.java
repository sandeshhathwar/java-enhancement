/* 
 * Reverse of a string
 */
package com.strings.example;

/**
 * @author Suhas
 *24-May-2020 11:24:01 am
 */
public class Example4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String s1 = "qwerty";
		 String s2 = "";
		 int last = s1.length()-1;
		 for(int i = last; i>=0;i--)
		 {
			 s2 = s2 + s1.charAt(i);
		 }
		 System.out.println(s1);
		 System.out.println(s2);
	}

}
