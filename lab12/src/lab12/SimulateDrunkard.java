package lab12;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 27 February 2014
 * This program implements the class Drunkard to generate the location of the drunkard.
 */

public class SimulateDrunkard 
{
	public static void main(String[] args)
	{
		Drunkard d1 = new Drunkard("WCFields");//creates an instance of a Drunkard.
		for(int n = 0; n < 100; n++)//implements the drunkard's walk over 100 intersections
			d1.move();
		d1.writeInput();
	}
		
}
