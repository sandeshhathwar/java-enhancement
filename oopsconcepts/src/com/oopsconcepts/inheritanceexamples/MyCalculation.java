/**
 * 
 */
package com.oopsconcepts.inheritanceexamples;

/**
 * @author Sandesh
 *May 12, 20206:53:46 AM
 */

class Calculation {
	   int z;
		
	   /**
	 * @param x
	 * @param y
	 */
	public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	   /**
	 * @param x
	 * @param y
	 */
	public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
}


/**
 * @author Sandesh
 *May 12, 20207:37:14 AM
 */
public class MyCalculation extends Calculation {
	
	 public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z);
	   }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
	      MyCalculation demo = new MyCalculation();
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.multiplication(a, b);
	}

}
