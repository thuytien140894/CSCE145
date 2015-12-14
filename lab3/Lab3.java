package myLab;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 21 January 2014
 * This program runs as an ATM system for cash withdrawal. 
 */
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of dollars you wish to withdraw:"); 
		Scanner keyboard = new Scanner(System.in); //sets things up so the program can accept keyboard input
		int $ = keyboard.nextInt(); //reads one int value from the keyboard
		// use the mod % operator to find the remainder
		int n1 = $/20; //calculates the minimum number of $20 bills
		int n2 = ($ % 20)/10; //calculates the minimum number of $10 bills  
		int n3 = ($ % 20 % 10)/5; //calculates the minimum number of $5 bills
		int n4 = $ % 20 % 10 % 5; //calculates the minimum number of $1 bills
		System.out.println("I will dispense"); 
		System.out.println("       " + n1 + " $20 bill(s)"); //displays the number of $20 bills
		System.out.println("       " + n2 + " $10 bill(s)"); //displays the number of $10 bills
		System.out.println("       " + n3 + " $5 bill(s)"); //displays the number of $5 bills
		System.out.println("       " + n4 + " $1 bill(s)"); //displays the number of $1 bills
		System.out.println("Thank you for your business."); 		
		
		
	}

}
