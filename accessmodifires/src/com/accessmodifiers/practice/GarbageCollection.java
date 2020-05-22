/**
 * 
 */
package com.accessmodifiers.practice;

/**
 * @author Sandesh
 * 11:36:45 PM May 14, 2020
 */
public class GarbageCollection {

		public void finalize() {
			System.out.println("object is garbage collected");
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollection a = new GarbageCollection();
		a = null;
		
		GarbageCollection S1 = new GarbageCollection();
		GarbageCollection S2 = new GarbageCollection();
		S1 = S2;
		
		System.gc();
	}

}
