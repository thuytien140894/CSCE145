package tien_ho_hw7;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 26 March 2014
 * This program defines an exception for negative numbers. 
 */

public class NegativeNumberException extends Exception
{
	/**
	 * Default constructor.
	 */
	public NegativeNumberException()
	{
		super("Negative Value!");//call the constructor of the base class Exception
	}
	
	/**
	 * Precondition: message is a String value.
	 * Constructor to define the exception.
	 */
	public NegativeNumberException(String message)
	{
		super(message);
	}
}
