package lab24;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 22 April 2014
 * This program stores Pet objects into ArrayList and sorts them into alphabetic order.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PetList {
	public static void main(String[] args) {
		String info, name;
		int numberOfPets, age, weight;
		
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Pet> petList = new ArrayList<Pet>();
		System.out.println("Enter their name, age, weight separated by commas: ");
		Scanner kb = new Scanner(System.in);
		
		boolean done = false;
		while (!done) {
			info = kb.nextLine();
			//ends the loop when the user enters "done".
			if (info.equalsIgnoreCase("done")) {
				done = true;
				break;
			}
			String[] w = info.split(",");//splits the line using comma as a separator into an array of substrings
			name = w[0].toUpperCase();//changes the names into all upper case letters so that they can be sorted alphabetically
			age = Integer.parseInt(w[1].substring(1));//parses the String values into int
			weight = Integer.parseInt(w[2].substring(1));
			petList.add(new Pet(name,age,weight));//stores Pet objects into the list
		}
		
		
			alphabetSort(petList);
			System.out.println();
			System.out.println("Your pets sorted by names in alphabetic order:");
			System.out.println();
			display(petList);
			System.exit(0);//ends the program
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
		
		/**
		 * Displays the new alphabetically-sorted pet list.
		 */
		public static void display(ArrayList<Pet> petList) {
			for (int i = 0; i < petList.size(); i++) {
				System.out.println("Name: " +
						petList.get(i).getName().substring(0,1) + 
						petList.get(i).getName().substring(1).toLowerCase());
				System.out.println("Age: " + petList.get(i).getAge() + " years");
				System.out.println("Weight: " + petList.get(i).getWeight() + " pounds");
				System.out.println();
			}
		}
	}
	

		