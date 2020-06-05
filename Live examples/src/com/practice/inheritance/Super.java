/*
 * 
 */
package com.practice.inheritance;

/**
 * @author Suhas
 *05-Jun-2020 9:15:46 am
 */
class superclass{
	superclass(){
		System.out.println("This is the constructor of super class");
	}
	int x = 10;
	public void count() {
		System.out.println("non static method of super class");
	}
}

class subclass extends superclass{
	subclass(){
		super();
		System.out.println(super.x);
		System.out.println("This is subclass constructor");
	}
	@Override
	public void count() {
		System.out.println("This is overridden method");
	}
}
public class Super {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
subclass s = new subclass();
s.count();
	}

}
