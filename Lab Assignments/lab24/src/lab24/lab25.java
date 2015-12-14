package lab24;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 24 April 2014
 * This program reads the data from the file pets.txt and 
 * then writes the alphabetically-sorted pet list into another file.
 */

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class lab25 {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String inputFile = "pets.txt";
		System.out.print("Enter the name of the new file: ");
		String output = keyboard.nextLine();
		String outputFile = output + ".txt";

		Scanner inputStream = null;
		PrintWriter outputStream = null;

		//opens a text file to read
		try 
		{
			inputStream = new Scanner(new File(inputFile));	
		}

		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the file " + inputFile);
			System.exit(0);
		}

		//opens a text file to write
		try 
		{
			outputStream = new PrintWriter(outputFile);
		}

		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the file " + outputFile);
		}

		String info, name;
		int numberOfPets, age, weight;

		//creates an array list to store Pet objects
		ArrayList<Pet> petList = new ArrayList<Pet>();

		//reads the input data from the file pets.txt
		while (inputStream.hasNextLine()) 
		{
			info = inputStream.nextLine();
			String[] w = info.split(",");//splits the line using comma as a separator into an array of substrings
			name = w[0].toUpperCase();//changes the names into all upper case letters so that they can be sorted alphabetically
			age = Integer.parseInt(w[1].substring(1));//parses the String values into int
			weight = Integer.parseInt(w[2].substring(1));
			petList.add(new Pet(name,age,weight));//stores Pet objects into the list
		}
		alphabetSort(petList);
		//prints the alphetically-sorted pet list to a new file
		for (int i = 0; i < petList.size(); i++) {
			outputStream.println("Name: " +
					petList.get(i).getName().substring(0,1) + 
					petList.get(i).getName().substring(1).toLowerCase());
			outputStream.println("Age: " + petList.get(i).getAge() + " years");
			outputStream.println("Weight: " + petList.get(i).getWeight() + " pounds");
			outputStream.println();
		}
		//closes both the output and input streams
		outputStream.close();
		inputStream.close();
	}
	/**
	 * Precondition: startIndex is a valid index of the ArrayList petList.
	 * Returns the index of the pet whose name comes first in alphabetic order.
	 */
	private static int getIndex(int startIndex, ArrayList<Pet> petList) {
		Pet start = petList.get(startIndex);
		int comeBefore = startIndex;
		for (int i = startIndex + 1; i < petList.size(); i++) {
			if(petList.get(i).getName().compareTo(start.getName()) < 0) {
				start = petList.get(i);
				comeBefore = i;
			}
		}
		return comeBefore;
	}

	/**
	 * Precondition: i and j are valid indices for the ArrayList petList.
	 * Interchanges the data of the Pet objects at index i and index j.
	 */
	private static void interchange(int i, int j, ArrayList<Pet> petList) {
		Pet p = petList.get(i);
		petList.set(i,petList.get(j));
		petList.set(j, p);
	}

	/**
	 * Precondition: petList is an ArrayList.
	 * Sorts the list into alphabetic order by pet name.
	 */
	public static void alphabetSort(ArrayList<Pet> petList) {
		for (int i = 0; i < petList.size()-1; i++) {
			int nextComeBefore = getIndex(i, petList);
			interchange(i, nextComeBefore, petList);
		}
	}
}
