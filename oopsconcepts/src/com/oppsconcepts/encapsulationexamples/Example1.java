/**
 * 
 */
package com.oppsconcepts.encapsulationexamples;

/**
 * @author Sandesh
 *May 12, 20207:20:25 AM
 */
class Encapsulation
{
  private String Name;
  private String Profile;
  private int Age;
  
  /**
 * @return
 */
public String getName() {
    return Name;
  }
  /**
 * @param Name
 */
public void setName(String Name) {
    this.Name = Name;
  }
  /**
 * @return
 */
public String getProfile() {
    return Profile;
  }
  /**
 * @param Profile
 */
public void setProfile(String Profile) {
    this.Profile = Profile;
  }
  /**
 * @return
 */
public int getAge() {
    return Age;
  }
  /**
 * @param Age
 */
public void setAge(int Age) {
    this.Age = Age;
  }
}
/**
 * @author Sandesh
 *May 12, 20207:40:54 AM
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation(); 
	    // setting values of the variables
	    obj.setName("Suhas");
	    obj.setAge(23);
	    obj.setProfile("data scientist"); 
	    // Displaying values of the variables
	    System.out.println(" Name: " + obj.getName());
	    System.out.println(" Age: " + obj.getAge());
	    System.out.println(" Profile: " + obj.getProfile());
	}

}
