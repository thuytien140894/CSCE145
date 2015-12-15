package tien_ho_hw5;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 28 February 2014
 * This program creates a dating service for two people by computing their compatibility. 
 */

import java.util.Scanner;

public class Characteristic {
	private String description;//instance variables
	private int rating;
		
	/**
	 * Precondition: s1 is a String value.
	 * Sets the description of the characteristic to a given string.
	 * Sets the rating to zero to indicate that it has not yet been determined.
	 */
	public Characteristic(String s1)//constructor
	{
		description = s1;
		rating = 0;
	}
	
	/**
	 * Precondition: aRating is an integer between 1 and 10.
	 * Returns true if the aRating is valid.
	 */
	private boolean isValid(int aRating)//boolean method
	{
		return (aRating >= 1) && (aRating <= 10);
	}
	
	/**
	 * Precondition: aRating is an integer.
	 * Sets the rating to aRating if it is valid. 
	 */
	public void setRating(int aRating)
	{
		if (isValid(aRating))
			rating = aRating;
	}
	
	/**
	 * Reads the rating from the keyboard.
	 */
	public int setRating()
	{
		System.out.println("Please enter your rating to your partner's characteristic on the scale from 1 to 10:");
		Scanner keyboard = new Scanner (System.in);
		int aRating = keyboard.nextInt();
		return aRating;
	}
	
	/**
	 * Returns the description of the characteristic.
	 */
	public String getDescription()//accessor
	{
		return description;
	}
	
	/**
	 * Returns the rating of the characteristic as an integer.
	 */
	public int getRating()//accessor
	{
		return rating;
	}
	
	/**
	 * Precondition: otherRating is an instance of the Characteristic class.
	 * Computes the compatibility measure when both ratings are nonzero.
	 * Returns zero if either ratings is zero.
	 */
	private double getCompatibilityMeasure(Characteristic otherRating)
	{
		if ((this.rating == 0)||(otherRating.rating == 0))
			return 0;
		else 
			return 1-((Math.pow(this.getRating()-otherRating.getRating(),2))/81);
	}
	
	/**
	 * Precondition: otherRating is another instance of the Characteristic class.
	 * Returns true if the descriptions match.
	 */
	private boolean isMatch(Characteristic otherRating)
	{
		return this.getDescription().equalsIgnoreCase(otherRating.getDescription());
	}
	
	/**
	 * Precondition: otherRating is another instance of the Characteristic.
	 * Returns the compatibility measure of two matching characteristics.
	 * Returns zero if the descriptions of the characteristics do not match.
	 */
	public double getCompatibility(Characteristic otherRating)
	{
		if (isMatch(otherRating))
			return (getCompatibilityMeasure(otherRating));
		else 
			return 0;
	}
}
