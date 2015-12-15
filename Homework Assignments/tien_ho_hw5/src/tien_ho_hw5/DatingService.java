package tien_ho_hw5;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 28 February 2014
 * This program implements the class Characteristic and tests the compatibility of two people.
 */

import java.util.Scanner;

public class DatingService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Dating Service!");
		System.out.println();

		Scanner keyboard = new Scanner (System.in);
		System.out.println("Chris, please describe yourself in terms of age, height, and personality:");
		String s1 = keyboard.nextLine();
		System.out.println("Pat, please describe yourself in terms of age, height, and personality: ");
		String s2 = keyboard.nextLine();
		
		Characteristic Chris = new Characteristic(s1);//instantiates Chris
		Characteristic Pat = new Characteristic(s2);//instantiates Pat

		int n = Chris.setRating();//reads Chris' rating 
		Chris.setRating(n);//sets Chris' rating
		int m = Pat.setRating();//reads Pat's rating
		Pat.setRating(m);//sets Pat's rating
		
		System.out.println("Your compatibility measure is " + Chris.getCompatibility(Pat) + ".");//prints their compatibility measure
		System.exit(0);//quits the program
	}

}
