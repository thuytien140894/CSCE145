package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates the Sheep subclass of Mammal.
 */

public class Sheep extends Mammal
{
	public static String type = "sheep";
	
	/**
	 * Precondition: n is a String value.
	 * Calls the constructor of the base class.
	 */
	public Sheep(String n)
	{
		super(n);
	}
	
	/**
	 * Prints the description of a Sheep animal.
	 */
	public void describe()
	{
		String s = "\"Bah! Bah! Baaaaah!\"";
		String g = "grazing.";
		
		System.out.println(getName() + " is a " + type + ".");
		super.describe();
		System.out.println(getName() + " says " + makeSound(s));
		System.out.println(getName() + " gets food by " + getFood(g));
	}
}
