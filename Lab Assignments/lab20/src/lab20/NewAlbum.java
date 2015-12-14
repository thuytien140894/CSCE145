package lab20;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 08 April 2014
 * This program reads and writes text files.
 */

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class NewAlbum 
{
	public static void main(String[] args)
	{
		String fileName1 = "albums.txt";
		Scanner inputStream = null;
		String fileName2 = "newalbums.txt";
		PrintWriter outputStream = null;
		
		try 
		{
			inputStream = new Scanner(new File(fileName1));//opens a text file to read
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName1);
			System.exit(0);
		}
		
		try 
		{
			outputStream = new PrintWriter(fileName2);//opens a text file to write
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName2);
		}
		
		//initializes variables
		int year = 0;
		double price = 0;
		
		while (inputStream.hasNextLine())
		{
			//reads and prints the first three lines of each album
			for (int i = 0; i < 3; i++)
			{
				String line = inputStream.nextLine();
				outputStream.println(line);
				if ((line.charAt(0) == '1') || (line.charAt(0) == '2')) 
					year = Integer.parseInt(line);//parses the year to an int
			}

			String line = inputStream.nextLine();
			price = Double.parseDouble(line.substring(1));//parses the price to a double

			int age = 2014 - year;//calculates the number of years since the release of the album
			
			//changes the price of the album based on its year of release
			if ((age >= 1) && (age <=5))
				price = price * 0.95;
			else if ((age >=5) && (age <= 10))
				price = price * 0.9;
			else
				price = price * 0.5;
			
			outputStream.println("$" + price);//prints the new discounted price to the text file
		}
		
		//closes both the output and input streams
		outputStream.close();
		inputStream.close();
	}
}
