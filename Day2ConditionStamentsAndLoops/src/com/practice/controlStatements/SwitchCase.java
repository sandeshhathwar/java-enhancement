/*
 * 
 */
package com.practice.controlStatements;

/**
 * @author Suhas
 *11-May-2020 5:39:21 pm
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=6;
	     switch(num+2)
	     {
	        case 1:
		  System.out.println("Case1: Value is: "+num);
		case 2:
		  System.out.println("Case2: Value is: "+num);
		case 3:
		  System.out.println("Case3: Value is: "+num);
	        default:
		  System.out.println("Default: Value is: "+num);
	      }

	}

}
