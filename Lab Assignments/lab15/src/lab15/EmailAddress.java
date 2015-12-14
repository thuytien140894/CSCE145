package lab15;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 18 March 2014
 * This program mines text for email addresses.
 */

import java.util.Scanner;

public class EmailAddress {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Email Address Harvester");
		System.out.println();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input some text: ");
		String text = keyboard.nextLine();
		
		String email = null;//initializes the email variable to an empty string
		String[] words = text.split(" ");//divides the string into tokens based on the separator space
		                                 //creates an array of words 
		for (String word : words) //processes each word in the text 
		{
			for (int i = 0; i < word.length(); i++)//processes each character in each word
			{
				if (word.charAt(i) == '@') //checks for the presence of email addresses based on an "@" 
					email = word;//any word that has "@" is assigned as an email address
				else
					email = "No email address";
			}
		}
		
	    System.out.println();
	    System.out.println("Extracted email address: " + email);
	    System.exit(0);//ends the program
	}
}
