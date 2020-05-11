/**
 * 
 */
package com.sampleprograms.someprograms;

/**
 * @author Sandesh
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempNumber;
		int rem;
		int revNumber=0;
		int number=4554;
		
		tempNumber = number;
		while(tempNumber!=0)
		{
			rem = tempNumber % 10;
			revNumber = revNumber * 10 + rem;
			tempNumber/=10;
			
		}
		
		if(revNumber == number)
		{
		System.out.println("The given number is palindrome");
		}
		else
		{
		System.out.println("The given number is not a palindrome");
		}
	}

}
