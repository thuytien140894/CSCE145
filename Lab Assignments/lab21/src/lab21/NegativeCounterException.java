package lab21;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 10 April 2014
 * This program declares the exception for negative value.
 */

public class NegativeCounterException extends Exception
{
	/**
	 * Default constructor.
	 */
	public NegativeCounterException()
	{
		super("Negative Value!");//calls the constructor of the base class
	}
	
	/**
	 * Precondition: message is a String.
	 * Calls the constructor of the base class.
	 */
	public NegativeCounterException(String message)
	{
		super(message);
	}
}
