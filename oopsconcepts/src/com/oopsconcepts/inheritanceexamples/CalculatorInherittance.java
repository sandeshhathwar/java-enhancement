/**
 * 
 */
package com.oopsconcepts.inheritanceexamples;

/**
 * @author Sandesh
 *May 12, 20207:04:02 PM
 */
class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
}

/**
 * @author Sandesh
 *May 12, 20207:04:13 PM
 */
class AdvanceCalculator extends Calculator{
	public int sub(int i,int j) {
		return i-j;
	}
	
	public long mul(int a,int b) {
		return a*b;
	}
}

/**
 * @author Sandesh
 *May 12, 20206:53:39 PM
 */
public class CalculatorInherittance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvanceCalculator c1 = new AdvanceCalculator();
		int result1 = c1.add(5,4);
		int result2 = c1.sub(8, 3);
		long result = c1.mul(67,98);
		
		System.out.println("addition of the numbers " + result1);
		System.out.println("subtraction of the numbers " + result2);
		System.out.println("multiplication of the numbers " + result);
	}

}
