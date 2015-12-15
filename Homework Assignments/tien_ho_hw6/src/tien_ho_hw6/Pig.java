package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates the Pig subclass of Mammal.
 */

public class Pig extends Mammal
{
	public static String type = "pig";
	
	/**
	 * Precondition: n is a String value.
	 * Calls the constructor of the base class.
	 */
	public Pig(String n)
	{
		super(n);
	}
	
	/**
	 * Prints the description of a Pig animal.
	 */
	public void describe()
	{
		String s = "\"Oink! Oink! Oink-oink!\"";
		String g = "rummaging with its snout.";
		
		System.out.println(getName() + " is a " + type + ".");
		super.describe();
		System.out.println(getName() + " says " + makeSound(s));
		System.out.println(getName() + " gets food by " + getFood(g));
	}
}
