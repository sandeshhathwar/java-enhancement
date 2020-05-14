/**
 * 
 */
package com.oppsconcepts.encapsulationexamples;

/**
 * @author Sandesh
 *May 12, 20207:14:23 AM
 */
 class Person {
	  private String name; // private = restricted access

	  // Getter
	  /**
	 * @return
	 */
	public String getName() {
	    return name;
	  }

	  // Setter
	  /**
	 * @param newName
	 */
	public void setName(String newName) {
	    this.name = newName;
	  }
	}
/**
 * @author Sandesh
 *May 12, 20207:41:17 AM
 */
public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Person myObj = new Person();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	}

}
