package lab10;

import java.util.Scanner;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 18 February 2014
 * This program creates a class InsectPopulation to simulate the growth of a population of insects.
 */

public class InsectPopulation 
{
	private double size;//declares the instance variable as a double value
	
	/**
	 * Precondition: newPopulation is a nonnegative real number.
	 * Stores the specified population of insect into the variable population.
	 */
	public InsectPopulation(double newSize) //newSize is a local variable, which can only be used within this method definition.
	{                                       //constructor
		size = newSize;	
	}
	
	/**
	 * Returns the new population after being doubled through breeding. 
	 */
	public double breed()
	{
		size = 2 * size;
		return size;
	}
	
	/**
	 * Returns the new population after being reduced by 10% by insecticide.
	 */
	public double spray()
	{
		size = size * 0.9;
		return size;
	}
	
	/**
	 * Returns the current population.
	 */
	public double getSize()
	{
		return size;
	}
	
	/**
	 * Calls the getSize method and prints the current population of the insects.
	 */
	public void display()
	{
		System.out.println(getSize());
	}
	
}
