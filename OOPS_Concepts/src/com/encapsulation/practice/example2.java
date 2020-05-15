
package com.encapsulation.practice
;
/*
 * 
 */

import java.util.Scanner;

/**
 * @author Suhas
 *13-May-2020 6:36:20 pm
 */
class Coat {
    private double price;
    private String customer;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
}

public class example2 {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		Coat c = new Coat();
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the Price");
		double price = S1.nextInt();
		c.setPrice(price); 
		System.out.println("Enter the Name" );
		String customer =  S1.next();
		c.setCustomer(customer); 
		System.out.println("The customer name :" + c.getCustomer());
		System.out.println("The price amount is: " + c.getPrice());	
		S1.close();
	}		 
	
}
