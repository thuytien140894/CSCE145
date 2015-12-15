package tien_ho_hw4;

import java.lang.Object;
/**
 * @author Tien Thuy Ho
 * @version 1.0, 19 February 2014
 * This program creates a class Rectangle to represent a rectangle 
 * by its vertices at the lower left corner and upper right corner. 
 */

public class Rectangle 
{
	private double area, perimeter;//declares the variables as double values
	private Point vertice1, vertice2;//declares the variables as points
	
	/**
	 * Precondition: a and b are points.
	 * Stores two specified points as the Rectangle object's two vertices
	 */
	public Rectangle(Point a, Point b)
	{
		vertice1 = a;
		vertice2 = b;
	}
	
	/**
	 * Calculates and returns the area of the rectangle.
	 */
	public double area()
	{
		area = Math.abs((vertice2.getXCoordinate() - vertice1.getXCoordinate())
				*(vertice2.getYCoordinate() - vertice1.getYCoordinate()));
		return area;
	}
	
	/**
	 * Calculates and returns the perimeter of the rectangle.
	 */
	public double perimeter()
	{
		perimeter = 2*(Math.abs(vertice2.getXCoordinate() - vertice1.getXCoordinate())  
				+ Math.abs(vertice2.getYCoordinate() - vertice1.getYCoordinate()));
		return perimeter;			
	}
}
