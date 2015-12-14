package lab24;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 24 April 2014
 * This program writes a pet list.
 */

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PetData 
{
	public static void main (String[] args)
	{
		String fileName = "pets.txt";
		PrintWriter outputStream = null;

		//opens a file
		try
		{
			outputStream = new PrintWriter(fileName);
		}

		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName);
		}

		//writes to the file
		outputStream.println("Abu, 10, 13");
		outputStream.println("Cheetah, 23, 32");
		outputStream.println("Buddy, 45, 43");
		outputStream.println("Buck, 12, 21");
		outputStream.println("Indigo, 65, 21");
		outputStream.println("Hermes, 14, 41");
		outputStream.println("Iago, 22, 33");
		outputStream.println("Meeko, 32, 12");
		outputStream.println("Mocha, 10, 21");
		outputStream.println("Gus, 34, 32");
		outputStream.println("Grey, 12, 22");
		outputStream.println("Fantom, 43, 44");
		outputStream.println("Flash, 32, 23");
		outputStream.println("Fehona, 11, 22");
		outputStream.println("Ladybug, 4, 12");
		outputStream.println("Leo, 7, 30");
		outputStream.println("Magic, 9, 20");
		outputStream.println("Palmer, 3, 10");
		outputStream.println("Panda, 6, 21");

		//closes the stream
		outputStream.close();
	}
}
