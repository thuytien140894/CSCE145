package tien_ho_hw4;

import java.lang.Object;
/**
 * @author Tien Thuy Ho
 * @version 1.0, 19 February 2014
 * This program creates a class Point to represent a 2-D point by its x- and y-coordinates. 
 */

public class Point
{
	private double xcoordinate, ycoordinate;//declares the variables as double values
										//private access modifier is used to restrict access and changes to the variables.
	
	/**
	 * Precondition: x and y are real numbers.
	 * Stores two specified values as the Point object's x-coordinate and y-coordinate.
	 */
	public Point (double x, double y) 
	{
		xcoordinate = x;
		ycoordinate = y; 
	}
	
	/**
	 * Prints an instance of the Point class.
	 */
	public void display()
	{
		System.out.println("(" + xcoordinate + "," + ycoordinate + ")");
	}
	
	/**
	 * Retrieves the value of the x-coordinate.
	 */
	public double getXCoordinate()
	{
		return xcoordinate;
	}
	
	/**
	 * Retrieves the value of the y-coordinate.
	 */
	public double getYCoordinate()
	{
		return ycoordinate;
	}
}
