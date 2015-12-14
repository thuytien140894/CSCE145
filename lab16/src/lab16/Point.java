package lab16;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 20 March 2014
 * This program creates the Point class defined in x and y coordinates/
 */

public class Point 
{
	public int x, y;//instance variables
	
	/**
	 * Precondition: x and y are positive integers.
	 * Stores two specified values as x and y coordinates of a point.
	 */
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Returns the value of the x coordinate.
	 */
	public int getX()//getter
	{
		return x;
	}
	/**
	 * Returns the value of the y coordinate.
	 */
	public int getY()//getter
	{
		return y;
	}
}
