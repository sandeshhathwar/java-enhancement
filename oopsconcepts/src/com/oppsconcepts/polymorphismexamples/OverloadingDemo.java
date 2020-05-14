/**
 * 
 */
package com.oppsconcepts.polymorphismexamples;

/**
 * @author Sandesh
 *May 12, 20207:01:54 AM
 */
/**
 * @author Sandesh
 *May 12, 20207:42:24 AM
 */
class DemoOverload{
    /**
     * @param x
     * @param y
     * @return
     */
    public int add(int x, int y){  //method 1
    return x+y;
    }

    /**
     * @param x
     * @param y
     * @param z
     * @return
     */
    public int add(int x, int y, int z){ //method 2
    return x+y+z;
    }

    /**
     * @param x
     * @param y
     * @return
     */
    public int add(double x, int y){ //method 3
    return (int)x+y;
    }

    /**
     * @param x
     * @param y
     * @return
     */
    public int add(int x, double y){ //method 4
    return x+(int)y;
    }
}

/**
 * @author Sandesh
 *May 12, 20207:42:07 AM
 */
public class OverloadingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOverload demo=new DemoOverload();
	    System.out.println(demo.add(2,3));      //method 1 called
	    System.out.println(demo.add(2,3,4));    //method 2 called
	    System.out.println(demo.add(2,3.4));    //method 4 called
	    System.out.println(demo.add(2.5,3));    //method 3 called
	}

}
