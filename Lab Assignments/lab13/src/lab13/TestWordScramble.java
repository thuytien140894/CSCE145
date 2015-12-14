package lab13;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 04 March 2014
 * This program implements the class WordScramble to scramble words entered by the user.
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWordScramble {
	public static void main(String[] args)
	{
		System.out.println("Welcome to Word Scramble. Please enter a sentence without any punctuation.");
		Scanner keyboard = new Scanner(System.in);
		String sentence = keyboard.nextLine();
		String newSentence = "";//initializes the variable newSentence to an empty string
		
		StringTokenizer st = new StringTokenizer(sentence);
	    String word;
	    while (st.hasMoreTokens()) 
	    {
	         word = st.nextToken();//separates a sentence into its individuals words
	         word = WordScramble.scramble(word);//scrambles the word
	         newSentence = newSentence + word + " ";//creates the scrambled sentence
	    }
	    System.out.println();
	    System.out.println("You entered: " + sentence);
	    System.out.println("Scrambled version: " + newSentence);
	    System.exit(0);//ends the program
	}
}
