/**
 * 
 */
package com.accessmodifiers.practice;



/**
 * @author Sandesh
 * 11:28:22 PMMay 14, 2020
 */
class A 
{ 
	//if specify it as a private then results in error
 String b = " hello ";
   /**
 * display how are you only if we remove the private modifier
 * private modifier can't be accessed directly
 */
 void display() 
    { 
        System.out.println("how are you"); 
    } 
}


/**
 * @author Sandesh
 * 11:25:51 PM May 14, 2020
 */
public class PrivateModifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A obj = new A(); 
		 System.out.println(obj.b);
		 obj.display(); 
	}

}
