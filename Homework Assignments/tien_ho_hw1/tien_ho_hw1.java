package myHomework;

import java.util.Scanner;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 22 January 2014
 * This program runs a simple password checker in a console window.
 */

public class tien_ho_hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); //sets things up so the program can accept keyboard input

		System.out.println("Password Checker"); 
		System.out.println("Please enter your username:");
		String s1 = keyboard.nextLine(); //reads an entire line from the keyboard

		System.out.println("Please enter your password:");
		String s2 = keyboard.nextLine(); 

		if(s2.equals("thanhtuyen")) { //checks whether the password entered by the user matches the internal secret password
			System.out.println("You are approved by access control!"); //approves if the password entered by the user matches the secret password
			System.exit(0); //quits the program
		}
		else {
			System.out.println("Sorry"); //rejects if the user enters an incorrect password
			keyboard.close(); //stops the program from accepting further keyboard input
			System.exit(0); 
		}
	}

}
