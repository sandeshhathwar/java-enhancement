/**
 * 
 */
package com.sampleprograms.operators;

/**
 * @author Sandesh
 *
 */
public class BitwiseOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 6;
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		int f = ~a;
		int g = a << 2;
		int h = b >> 1;
		int i = a >>> 1;
		
		System.out.println(" Bitwise OR = " + c);
		System.out.println(" Bitwise AND = " + d);
		System.out.println(" Bitwise XOR = " + e);
		System.out.println(" Bitwise NOT = " + f);
		System.out.println(" Bitwise left shift = " + g);
		System.out.println(" Bitwise right shift = " + h);
		System.out.println(" Bitwise right shift with zero fill = " + i);
		
	}

}
