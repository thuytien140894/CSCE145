package lab10;

import java.util.Scanner;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 18 February 2014
 * This program constructs a population of 10 insects and then iterates 8 times.  
 */

public class TestInsectPopulation 
{
	public static void main(String[] args)
	{
		InsectPopulation population = new InsectPopulation(10);//instantiates a new InsectPopulation object with a parameter of 10
		for (int count = 1; count <= 8; count ++)//iterates the three methods 8 times
		{
			population.breed();//the methods in the class InsectPopulation are invoked.
			population.spray();
			population.display();
		}
	}
}
