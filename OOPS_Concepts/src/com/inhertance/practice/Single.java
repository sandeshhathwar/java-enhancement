/*
 * In single inheritance, subclasses inherit the features of one superclass.
 */
package com.inhertance.practice;

/**
 * @author Suhas
 *12-May-2020 9:26:02 am
 */

	class parent // base class
	{ 
	    public void print_king() 
	    { 
	        System.out.println("King"); 
	    } 
	} 
	  
	class child extends parent // child acquires the property of parent
	{ 
	    public void print_queen() 
	    { 
	        System.out.println("Queen"); 
	    } 
	} 
	// Driver class or main class
	public class Single
	{ 
	    public static void main(String[] args) 
	    { 
	        child c = new child(); 
	        c.print_king(); 
	        c.print_queen(); 
	        c.print_king();// prints King, from method which is in base class
	    } 
	} 