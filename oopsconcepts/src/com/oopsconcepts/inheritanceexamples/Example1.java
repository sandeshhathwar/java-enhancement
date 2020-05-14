/**
 * 
 */
package com.oopsconcepts.inheritanceexamples;

/**
 * @author Sandesh
 *
 */
class one{
	/**
	 * 
	 */
	public void print_car() 
    { 
        System.out.println("Car"); 
    }
}

/**
 * @author Sandesh
 *May 12, 20207:34:44 AM
 */
class two extends one 
{ 
    /**
     * 
     */
    public void print_bmw() 
    { 
        System.out.println("BMW"); 
    } 
}

/**
 * @author Sandesh
 *May 12, 20207:33:06 AM
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two g = new two(); 
        g.print_car();    
        g.print_bmw(); 	
        g.print_car();
	}

}
