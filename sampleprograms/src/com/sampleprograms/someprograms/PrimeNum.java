/**
 * 
 */
package com.sampleprograms.someprograms;

/**
 * @author Sandesh
 *
 */
public class PrimeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tally;
		int number = 13;
		boolean flag=false;
		
		if(number == 0 || number == 1) {
			System.out.println("the given number is not a prime");
			return;
		}
		for(tally = 2; tally < (number/2); tally++) {
			if(number % tally == 0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag == false)
		{
		System.out.println("The given number is prime number");
		}
		else
		{
		System.out.println("The given number is not a prime number");
		}
	}

}
