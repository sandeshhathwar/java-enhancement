/*
 * shows how if-else-if statement works 
 */
package com.practice.controlStatements;

/**
 * @author Suhas
 *11-May-2020 5:27:23 pm
 */
public class If_else_if_statements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=1234;
		if(num <100 && num>=1) {
		  System.out.println("Its a two digit number");
		}
		else if(num <1000 && num>=100) {
		  System.out.println("Its a three digit number");
		}
		else if(num <10000 && num>=1000) {
		  System.out.println("Its a four digit number");
		}
		else if(num <100000 && num>=10000) {
		  System.out.println("Its a five digit number");			
		}
		else {
		  System.out.println("number is not between 1 & 99999");			
		}

	}

}
