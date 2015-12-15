package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates the Lizard subclass of Reptile.
 */

public class Lizard extends Reptile
{
	public static String type = "lizard";
	
	/**
	 * Precondition: n is a String value.
	 * Calls the constructor of the base class.
	 */
	public Lizard(String n)
	{
		super(n);
	}
	
	/**
	 * Prints the description of a Lizard animal.
	 */
	public void describe()
	{
		String m = "crawls on its four legs.";
		String g = "tracking down its prey.";
		
		System.out.println(getName() + " is a " + type + ".");
		super.describe();
		System.out.println(getName() + " " + move(m));
		System.out.println(getName() + " gets food by " + getFood(g));
	}
}
