/**
 * 
 */
package com.variables.practice;

/**
 * @author Sandesh
 *May 12, 20209:33:26 PM
 */
public class StaticVarExample {
	 public static String myClassVar="class or static variable";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      //All three will display "class or static variable"
	      System.out.println(StaticVarExample.myClassVar);
	      System.out.println(StaticVarExample.myClassVar);
	      System.out.println(StaticVarExample.myClassVar);

	      //changing the value of static variable using obj2
	      //obj2.myClassVar = "Changed Text";

	      //All three will display "Changed Text"
	      System.out.println(StaticVarExample.myClassVar);
	      System.out.println(StaticVarExample.myClassVar);
	      System.out.println(StaticVarExample.myClassVar);
	}

}
