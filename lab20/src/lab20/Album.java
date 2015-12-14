package lab20;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 08 April 2014
 * This program writes an inventory text file.
 */

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Album 
{
	public static void main (String[] args)
	{
		String fileName = "albums.txt";
		PrintWriter outputStream = null;

		try
		{
			outputStream = new PrintWriter(fileName);//opens the file albums.txt
		}

		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName);
		}
	
		//writes to the file
		outputStream.println("Rock Steady");
		outputStream.println("No Doubt");
		outputStream.println("2002");
		outputStream.println("$18.98");
		outputStream.println("Revolver");
		outputStream.println("The Beatles");
		outputStream.println("1966");
		outputStream.println("$14.00");
		outputStream.println("Dangerously in Love");
		outputStream.println("Beyonce featuring Jean Paul");
		outputStream.println("2003");
		outputStream.println("$18.50");
		outputStream.println("Blood on the Dance Floor: History in the Making");
		outputStream.println("Michael Jackson");
		outputStream.println("1997");
		outputStream.println("$16.50");
		outputStream.println("Master of Puppets");
		outputStream.println("Metallica");
		outputStream.println("1986");
		outputStream.println("$13.29");
		outputStream.println("Escape");
		outputStream.println("Journey");
		outputStream.println("2006");
		outputStream.println("$7.45");
		
		outputStream.close();//closes the stream
	}
}

