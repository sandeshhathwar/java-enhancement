/*
 * Sample example of encapsulation
 */
package com.encapsulation.practice;

/**
 * @author Suhas
 *13-May-2020 6:29:58 pm
 */

class Person {
	   private int age;

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }
	}

public class example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
	      p1.setAge(24);
	      System.out.println("My age is " + p1.getAge());
	      
	}

}
