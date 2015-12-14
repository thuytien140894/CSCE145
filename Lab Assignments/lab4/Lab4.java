package myLab;

import java.util.Scanner;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 23 January 2014
 * This program helps determine grades based upon points for labs, homework, quizzes, and exams.
 */

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the grading program!");
		Scanner keyboard = new Scanner(System.in); //sets things up so the program can accept keyboard input
		
		int n1, n2, n3, n4, totalPoints; 
		char grade; 
		
		System.out.print("How many points did you earn for labs [0-25]:");
		n1 = keyboard.nextInt(); //reads one int value from the keyboard
		System.out.print("How many points did you earn for homework [0-20]:");
		n2 = keyboard.nextInt();
		System.out.print("How many points did you earn for quizzes [0-5]:");
		n3 = keyboard.nextInt();
		System.out.print("How many points did you earn for exams [0-55]:");
		n4 = keyboard.nextInt();
		
		totalPoints = n1+n2+n3+n4; //calculates the total points a student earns in class
		
		System.out.println(""); //empty string
		System.out.println("The total number of points you earned is " + totalPoints + ".");
		
		if (totalPoints >=90) 
			grade = 'A'; //A=90-100
		else if (totalPoints >=80)
			grade = 'B'; //B=80-89
		else if (totalPoints >=70)
			grade = 'C'; //C=70-79
		else if (totalPoints >=60)
			grade = 'D'; //D=60-69
		else
			grade = 'F'; //F=0-59
		
		System.out.println("Your grade is a " + grade + ".");
		
		System.exit(0); //quits the program
		
	}

}
