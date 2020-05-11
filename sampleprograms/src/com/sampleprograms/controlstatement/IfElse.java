/**
 * 
 */
package com.sampleprograms.controlstatement;

/**
 * @author Sandesh
 *
 */
public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 4;
		String season;
		
		if(month == 12 || month == 1 || month == 2)
			season = "winter";
		else if(month == 3 || month == 4 || month == 5)
			season = "spring";
		else if(month == 6 || month == 7 || month == 8)
			season = "summer";
		else if(month == 9 || month == 10 || month == 11)
			season = "autumn";
		else 
			season = "Invalid month";
		
		System.out.println(" the given month is in " + season);
	}

}
