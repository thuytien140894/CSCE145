package lab11;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 20 February 2014
 * This program tests the static methods created in the class Misc.
 */

public class TestMisc {
	public static void main(String[] args){
	System.out.println("f(9) = " + Misc.evaluateQuadraticFormula(3,5,7));//the value of the quadratic function
	System.out.println("Speed = " + Misc.speed(13, 40, 20));
	System.out.println("Distance = " + Misc.distance(13,40));
	System.out.println("Height = " + Misc.height(4, Math.PI/4, 34));
	
	double t = 0;
	double height = Misc.height(t, Math.PI/4,38.7);//calculates the height of the object in the first 0.1 seconds.
	
	System.out.println();
	while (height >= 0)
	{
		height = Misc.height(t, Math.PI/4, 38.7);
		t = t + 0.1;
		System.out.println(height);//computes and prints the height every 0.1 seconds until the object hits the ground 
	}
	}
}
