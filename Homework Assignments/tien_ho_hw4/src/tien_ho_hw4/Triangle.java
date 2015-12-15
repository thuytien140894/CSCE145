package tien_ho_hw4;

import java.lang.Object;
/**
 * @author Tien Thuy Ho
 * @version 1.0, 19 February 2014
 * This program creates a class Triangle to represent a triangle by the set of its three vertices. 
 */

public class Triangle 
{
	private double area, perimeter, side1, side2, side3;//declares these variables as double values
	private Point vertice1, vertice2, vertice3;//declares these variable as points
	
	/**
	 * Precondition: a, b, and c are points.
	 * Stores the specified points as the Triangle object's three vertices.
	 */
	public Triangle (Point a, Point b, Point c)
	{
		vertice1 = a;//the instance variables are initializes.
		vertice2 = b;
		vertice3 = c;
	}
	
	/**
	 * calculates and returns the length of side .
	 */
	public double side1()
	{
		side1 = Math.sqrt(Math.pow(vertice1.getXCoordinate() - vertice2.getXCoordinate(), 2) 
				+ Math.pow(vertice1.getYCoordinate() - vertice2.getYCoordinate(), 2));
		return side1;
	}
	
	/**
	 * calculates and returns the length of side 2.
	 */
	public double side2()
	{
		side2 = Math.sqrt(Math.pow(vertice1.getXCoordinate() - vertice3.getXCoordinate(), 2) 
				+ Math.pow(vertice1.getYCoordinate() - vertice3.getYCoordinate(), 2));
		return side2;
	}
	
	/**
	 * Calculates and returns the length of side 3.
	 */
	public double side3()
	{
		side3 = Math.sqrt(Math.pow(vertice2.getXCoordinate() - vertice3.getXCoordinate(), 2) 
				+ Math.pow(vertice2.getYCoordinate() - vertice3.getYCoordinate(), 2));
		return side3;
	}
	
	/**
	 * Calculates and returns the area of the triangle.
	 */
	public double area()
	{
		double s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
		return area;
	}
	
	/**
	 * Calculates and returns the perimeter of the triangle.
	 */
	public double perimeter()
	{
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
}
