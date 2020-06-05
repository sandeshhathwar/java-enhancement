/*
 *Differentiating local and global variables 
 */
package com.practice.examples;

/**
 * @author Suhas
 *04-Jun-2020 10:18:40 am
 */
public class Variables {

	int x;
	public void count(int x) {
		this.x=x;
		System.out.println(this.x);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Variables v = new Variables();
		v.count(10);

	}

}
