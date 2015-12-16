package tien_ho_hw10;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 25 April 2014
 * This program converts an English message into Morse code and vice versa.
 */
import java.util.Scanner;

public class TestMorseCode 
{
	public static void main(String[] args)
	{
		MorseCode cryptography = new MorseCode();
		//declares and initializes variables
		String message;
		String newMessage = "";
		
		System.out.println("Morse Code Conversion Program \n"
				+ "This program reads a phrase in English (or Morse code)"
				+ " and prints its equivalent in Morse code (or English). \n");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If your original message is in English, please enter an E.\n"
				+ "If it is in Morse code, please enter an M.  Enter any other character \n"
				+ "to quit:");
		String answer = keyboard.next();
		Scanner kb = new Scanner(System.in);
		System.out.println();
		
		//Conversion from English to Morse code
		if (answer.equals("E")) 
		{
			System.out.println("Please enter a phrase in English, followed by a carriage return:");
			message = kb.nextLine().toUpperCase();
			for (int i = 0; i < message.length(); i++)
			{
				newMessage = newMessage + MorseCode.toMorseCode(message.charAt(i));
			}
			System.out.println();
			System.out.println("The Morse code for your phrase is: \n"
					+ newMessage);
			System.out.println();
			System.out.println("Goodbye.");
		}
		
		//Conversion from Morse code to English
		else if (answer.equals("M"))
		{
			System.out.println("Please enter a phrase in Morse code, followed by a carraige return:");
			message = kb.nextLine();

			//shows errors when the Morse code does not have four characters for each letter 
			if (message.length() % 4 != 0)
			{
				System.out.println("There are some problems with yout Morse code, please enter again:");
				message = kb.nextLine();
			}
			
			//creates an array to store the Morse code characters
			char[] code = new char[message.length()];
			for (int i = 0; i < message.length(); i++) 
			{
				code[i] = message.charAt(i);
			}
			
			//loops through the array by an increment of four
			for (int n = 0; n < message.length(); n += 4) 
			{
				//creates an array for four Morse code characters
				char[] codeByFour = {code[n],code[n+1],code[n+2],code[n+3]};
				newMessage = newMessage + MorseCode.fromMorseCode(codeByFour);
			}
			System.out.println();
			System.out.println("Your phrase in English is: \n"
					+ newMessage);
			System.out.println();
			System.out.println("Goodbye.");
		}
		
		//quits the program when any other character besides E and M is entered
		else
		{
			System.out.println("Thank you for using the program.");
			System.exit(0);
		}		
	}
}
