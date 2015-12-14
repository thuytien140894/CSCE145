package lab11;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 20 February 2014
 * This program performs simple operations using static methods.
 */

public class Misc 
{
	public static final int x = 9;//declares x as a constant
	public static final double GRAVITY = 9.8;//m/sec^2
	
	/**
	 * Precondition: a, b, and c are real numbers.
	 * Calculates the quadratic function given x=9.
	 */
	public static double evaluateQuadraticFormula(double a, double b, double c)
	{
		return a*Math.pow(Misc.x, 2) + b*Misc.x + c;
	}
	
	/**
	 * Precondition: a, t, and v are real numbers.
	 * a is the acceleration in meter per second per second.
	 * t is the time of acceleration in second.
	 * v is the initial speed in meter per second.
	 * Postcondition: Calculates the speed in meter per second after t seconds of acceleration.
	 */
	public static double speed(double a, double t, double v)
	{
		return v+a*t;
	}
	
	/**
	 * Precondition: a and t are real numbers.
	 * a is the acceleration in meter per second per second.
	 * t is the time of acceleration in second.
	 * Postcondition: Calculates the distance traveled in meter after time t.
	 */
	public static double distance(double a, double t)
	{
		return (a*Math.pow(t, 2))/2;
	}
	
	/**
	 * Precondition: t and v are real number, theta is in radian.
	 * t is the time traveled in second.
	 * v is the initial speed in meter per second.
	 * theta is the angle in radian.
	 * Postcondition: Calculates the height of an object in meter at time t.
	 */
	public static double height(double t, double theta, double v)
	{
		return v*Math.sin(theta)*t-Misc.GRAVITY*Math.pow(t,2)/2;
	}
	
	/**
	 * Tests the static methods evaluateQuadraticFormula(), speed(), distance(), and height().
	 */
	public static void main (String[] args)
	{
		System.out.println("f(9) = " + Misc.evaluateQuadraticFormula(1,8,3));
		System.out.println("Speed = " + Misc.speed(5, 50, 40));
		System.out.println("Distance = " + Misc.distance(13, 45));
		System.out.println("Height = " + Misc.height(4, Math.PI/4, 45));
	}
}
