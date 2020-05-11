/**
 * 
 */
package com.sampleprograms.controlstatement;

/**
 * @author Sandesh
 *
 */
public class ArmstrongUsingDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int c;
		int d;
		int s=0;
		int num;
		
		num = n;
		do {
			d = n % 10;
			c = d* d* d;
			s = s + c;
			n /= 10;
		}while(n!=0);
		
		if(s == num) 
			System.out.println(" The number is armstrong");
		else
			System.out.println(" The number is not armstrong");
			
	}

}
