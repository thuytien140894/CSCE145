package myLab;

import javax.swing.JOptionPane;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 04 February 2014
 * This program performs calculations on an unknown number of inputs using a while loop.
 */

public class lab6 extends JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum, max, min;
		int numberOfValues;
		sum = 0; //initializes the value of sum to 0
		numberOfValues = 0; //initializes the number of input values to 0
		max = -Double.MAX_VALUE; //initializes the maximum value to the smallest number in JavaScript 
		min = Double.MAX_VALUE; //initializes the minimum value to the largest number in JavaScript

		boolean stop = false; //defines the truth value of the variable stop 

		while (!stop) // !stop = true
		{	
			String next = JOptionPane.showInputDialog("Enter either positive or negative values. \n"
					+ "Enter either \"end\" or \"stop\" after you have entered all the input values.");

			if ((next.equalsIgnoreCase("end")) || (next.equalsIgnoreCase("stop"))) //checks if the user's input is an "end" or "stop" string.
				stop = true; //ends the loop because now !stop = false

			else //This portion of the program is repeated.
			{
				double nextValue = Double.parseDouble(next); //converts the String to a double 
				sum = sum + nextValue; //calculates the new sum 
				numberOfValues ++; //updates the number of input values  
				if (nextValue > max) //compares the new value to the initialized value of max or the previous value of max  
					max = nextValue; //sets the new max value
				if (nextValue < min) //compares the new value to the initialized value of min or the previous value of min
					min = nextValue; //sets the new min value
			}
		}

		JOptionPane.showMessageDialog(null, "The average of the values you entered is " + (sum/numberOfValues) + ".\n"
				+ "The largest value is " + max + ".\n"
				+ "The smallest value is " + min + ".\n"
				+ "The range of the values is " + (max-min) + ".");		

		System.exit(0); //quits the program

	}
}	
	
	


