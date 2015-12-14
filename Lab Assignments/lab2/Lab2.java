package myLab;
/**
 Program to manipulate words in a natural language.
 Author: Tien Ho
 Programming Lab 2.
 Last Changed: January 16, 2013.
 */
import java.util.Scanner; //gets the Scanner class from the package java.util

public class Lab2 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program 1: 
		System.out.println("PLease enter your favorite color: "); 
		Scanner keyboard = new Scanner(System.in); 
		String color = keyboard.nextLine(); 
		System.out.println("Please enter your favorite food: "); 
		String food = keyboard.nextLine(); 
		System.out.println("Please enter your favorite animal: "); 
		String animal = keyboard.nextLine(); 
		System.out.println("Please enter the first name of an acquaintance: "); 
		String name = keyboard.nextLine(); 
		System.out.println("I had a dream that " + name + " ate a " + color + " " + animal + " and said it tasted like " + food + "!");

		//Program 2:
		System.out.println("Enter a line of text, with no punctuation.");
		Scanner kb = new Scanner(System.in);
		String sentence = kb.nextLine();
		int position = sentence.indexOf(" ");  
		sentence = sentence.substring(position+1) + " " + sentence.substring(0,position); 
		sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1); 
		System.out.println("Yoda has rephrased that line to read:");
		System.out.println(sentence); 		
	}

	
	
	
	
	
	
}
