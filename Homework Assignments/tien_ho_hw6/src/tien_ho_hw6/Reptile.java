package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates the Reptile subclass of Animal.
 */

public class Reptile extends Animal
{
	public static String type = "reptile";

	/**
	 * Precondition: n is a String value.
	 * Calls the constructor of the base class.
	 */
	public Reptile(String n)
	{
		super(n);
	}
	
	/**
	 * Prints the description of a Reptile animal.
	 */
	public void describe()
	{
		String s = "\"Ssssss! Ssssss! Ssssssssss!\"";
		String e = "swallowing.";
		
		System.out.println(getName() + " is a " + type + ".");
		System.out.println(getName() + " says " + makeSound(s));
		System.out.println(getName() + " eats food by " + eatFood(e));
	}
	
}
