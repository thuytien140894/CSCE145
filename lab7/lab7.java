package myLab;

import java.util.Scanner;
/**
 * @author Tien Thuy Ho
 * @verion 1.2, 06 February 2014
 * This program determines the percentage of vowels in a sentence using branching statements and simple loops.
 */
public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean again = true;
		while (again) //repeats the program
		{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a sentence in any language:");
		String sentence = keyboard.nextLine();
		
		double vowel = 0; //initializes the variable vowel to 0
		double space = 0; //initializes the number of spaces to 0
		int i = 0; //i = index
		double length = sentence.length();//determines the length of the sentence
		
		while (i < sentence.length()) { //as long as the index is less than the length of the string
			{
				if ((sentence.charAt(i) == 'a')||(sentence.charAt(i) == 'A')||(sentence.charAt(i) == 'e')||(sentence.charAt(i) == 'E'
					||(sentence.charAt(i) == 'o')||(sentence.charAt(i) == 'O')||(sentence.charAt(i) == 'i')||(sentence.charAt(i) == 'I')
					||(sentence.charAt(i) == 'u')||(sentence.charAt(i) == 'U')))
					vowel ++; //counts the number of vowels
				if (sentence.charAt(i) == ' ') 
					space ++; //counts the number of spaces
			}	
			i++;
		}
		
		double percentage = (vowel/(length-space))*100; //calculates the percentage of vowels in the sentence
		System.out.println("The percentage of vowels in the sentence is " + percentage + " %");
		System.out.println();
		}
	}

}
