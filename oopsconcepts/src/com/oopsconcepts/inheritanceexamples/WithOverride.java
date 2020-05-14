/**
 * 
 */
package com.oopsconcepts.inheritanceexamples;


/**
 * @author Sandesh
 *May 12, 2020 6:47:27 AM
 */

class Animal {
	protected String type = "animal";

	   /**
	 * 
	 */
	public void eat() {
	      System.out.println("I can eat");
	   }

	   /**
	 * 
	 */
	public void sleep() {
	      System.out.println("I can sleep");
	   }
	}

	/**
	 * @author Sandesh
	 *May 12, 20207:39:23 AM
	 */
	class Dog extends Animal {
	  
		
	   /* (non-Javadoc)
	 * @see com.oopsconcepts.inheritanceexamples.Animal#eat()
	 */
		
	public void eat() {
	      System.out.println("I eat dog food");
	   }

	   /**
	 * 
	 */
	public void bark() {
	      System.out.println("I can bark");
	   }
	}

/**
 * @author Sandesh
 *May 12, 20207:39:44 AM
 */
public class WithOverride {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
	    dog1.eat();
	    dog1.sleep();
	    dog1.bark();
	}

}
