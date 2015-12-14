package myLab;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This method computes the volume of an object.
		System.out.println("I will find the volume of an object.  Please enter the object mass in grams: ");
		Scanner kb = new Scanner(System.in);
		int mass = kb.nextInt();
		System.out.println("Please enter the density given in grams per cubic centimeter: ");
		int density = kb.nextInt();
		int volume = mass/density;
		System.out.println("The volume of an object with mass of " + mass + " grams and density of " + density + " grams per cubic centimeter is " + volume + " cubic centimeters.");
		System.out.println("Thank you!");
	}

}
