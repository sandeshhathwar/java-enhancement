/**
 * 
 */
package com.oopsconcepts.abstractionexamples;

/**
 * @author Sandesh
 *May 12, 20206:01:09 PM
 */

abstract class Animal {

	/**
	 * 
	 */
	public abstract void animalSound();

	/**
	 * 
	 */
	public void sleep() {
		System.out.println("Zzz");
	}
}


/**
 * @author Sandesh
 *May 12, 20206:10:34 PM
 */
class Pig extends Animal {
	/* (non-Javadoc)
	 * @see com.oopsconcepts.abstractionexamples.Animal#animalSound()
	 */
	public void animalSound() {

		System.out.println("The pig says: wee wee");
	}
}

 public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
	    Pig myPig = new Pig(); 
	    myPig.animalSound();
	    myPig.sleep();
	}

}
