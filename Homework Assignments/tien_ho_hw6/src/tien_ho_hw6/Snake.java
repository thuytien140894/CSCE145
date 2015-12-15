package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates the Snake subclass of Reptile.
 */

public class Snake extends Reptile
{
	public static String type = "snake";

	/**
	 * Precondition: n is a String value.
	 * Calls the constructor of the base class.
	 */
	public Snake(String n)
	{
		super(n);
	}
	
	/**
	 * Prints the description of a Snake animal.
	 */
	public void describe()
	{
		String m = "slithers.";
		String g = "killing its prey with venom.";
		
		System.out.println(getName() + " is a " + type + ".");
		super.describe();
		System.out.println(getName() + " " + move(m));
		System.out.println(getName() + " gets food by " + getFood(g));
	} 
}
