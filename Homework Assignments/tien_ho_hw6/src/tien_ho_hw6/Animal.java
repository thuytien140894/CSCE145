package tien_ho_hw6;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 07 March 2014
 * This program creates the base class Animal.
 */

public class Animal 
{
	private String name;
	public static String type;
	
	/**
	 * Precondition: n is a String value.
	 * Stores the name of an animal to a specified name.
	 */
	public Animal(String n)
	{
		name = n;
	}
	
	/**
	 * Returns the name.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Precondition: s is a String value.
	 * Returns a specified sound.
	 */
	public String makeSound(String s)
	{
		return s;
	}
	
	/**
	 * Precondition: m is a String value.
	 * Returns a specified movement.
	 */
	public String move(String m)
	{
		return m;
	}
	
	/**
	 * Precondition: g is a String value.
	 * Returns a specified way of obtaining food.
	 */
	public String getFood(String g)
	{
		return g;
	}
	
	/**
	 * Precondition: e is a String value.
	 * Returns a specified way of eating food.
	 */
	public String eatFood(String e)
	{
		return e;
	}
	
	/**
	 * Describes an animal in terms of its sound, movement, way of obtaining food, and way of eating food.
	 */
	public void describe()
	{
		String s = null;
		String m = null;
		String g = null;
		String e = null;
		
		makeSound(s);
		move(m);
		getFood(g);
		eatFood(e);
	}
}
