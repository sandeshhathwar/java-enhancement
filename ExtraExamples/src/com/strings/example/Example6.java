/*
 *Write a function to return the given string in upper case
 */
package com.strings.example;

/**
 * @author Suhas
 *24-May-2020 1:20:53 pm
 */
public class Example6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "hello";
		String res= "";
		for(int index = 0;index<s1.length();index++)
		{
			char c = s1.charAt(index);
			int b = c;
			if(c>96 && c<121)
			{
				b = c-32;
			}
			c= (char) b;
			res = res+c;
		}
		System.out.println(res);

	}

}
