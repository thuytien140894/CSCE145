package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates the Mammal subclass of Animal.
 */

public class Mammal extends Animal
{
	public static String type = "mammal";
	
	/**
	 * Precondition: n is a String value.
	 * Calls the constructor of the base class.
	 */
	public Mammal(String n)
	{
		super(n);
	}
	
	/**
	 * Prints the description of a Mammal animal.
	 */
	public void describe ()
	{
		String m = "walks on four legs.";
		String e = "chewing.";//walk on four legs
		
		System.out.println(getName() + " is a " + type + ".");
		System.out.println(getName() + " " + move(m));
		System.out.println(getName() + " eats food by " + eatFood(e));
	}
}
