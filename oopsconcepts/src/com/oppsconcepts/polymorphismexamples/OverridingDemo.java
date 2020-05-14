/**
 * 
 */
package com.oppsconcepts.polymorphismexamples;

/**
 * @author Sandesh
 *May 12, 20207:05:42 AM
 */

class Vehicle{
    public void move(){
    System.out.println(" Vehicles can move!! ");
    }
}

/**
 * @author Sandesh
 *May 12, 20207:43:19 AM
 */
class MotorBike extends Vehicle{
    public void move(){
    System.out.println(" MotorBike can move and accelerate too!! ");
    }
}

/**
 * @author Sandesh
 *May 12, 20207:43:35 AM
 */
public class OverridingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vh=new MotorBike();
	    vh.move();    // prints MotorBike can move and accelerate too!!
	    vh=new Vehicle();
	    vh.move();    // prints Vehicles can move!!
	}

}
