package tien_ho_hw7;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 26 March 2014
 * This program defines an exception for two attempted rest stops.
 */

public class TwoRestStopsException extends Exception 
{
	/**
	 * Default constructor.
	 */
	public TwoRestStopsException()
	{
		super("You cannot take two rest stops in a row!");//call the constructor of the base class
	}
	
	/**
	 * Precondition: message is a String value.
	 * Constructor to define the exception.
	 */
	public TwoRestStopsException(String message)
	{
		super(message);
	}
}
