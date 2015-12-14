package lab21;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 10 April 2014
 * This program counts the number of people in a room.
 */

public class RoomCounter
{
	//declares variables
	private int numberOfPeople;
	
	/**
	 * Precondition: The number of people is an int value.
	 * Sets the number of people to a specified value.
	 */
	public RoomCounter(int number)
	{
		numberOfPeople = number;
	}
	
	/**
	 * Adds one person to the number of people.
	 */
	public void addPerson()
	{
		numberOfPeople ++;
	}
	
	/**
	 * Removes one person from the number of people.
	 * Throws an exception of negative value if the number of people is negative.
	 */
	public void removePerson() throws NegativeCounterException
	{
		numberOfPeople--;
		if (numberOfPeople < 0)
			throw new NegativeCounterException();
	}
	
	/**
	 * Returns the number of people.
	 */
	public int getCount()
	{
		return numberOfPeople;
	}
	
	public static void main(String[] args)
	{
		RoomCounter r = new RoomCounter(12);//creates a room with 12 people
		
		System.out.println("There are 12 people in this room.");
		r.addPerson();//adds one additional person
		System.out.println("One person enters the room and there are now " + r.getCount() + " people.");
		System.out.println();
		
		//tries to remove 14 people
		try
		{
			System.out.println("If 14 people leaves the room, then ");
			for (int i = 0; i < 14; i++){
				r.removePerson();
			}
		}
		
		//handles the exception
		catch(NegativeCounterException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.exit(0);//ends the program
		}
	}
}
