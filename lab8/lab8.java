package myLab;

import javax.swing.JOptionPane;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 11 February 2014
 * This program runs a guessing game using a loop.
 */

public class lab8 extends JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";//initializes the variable answer to an empty string
		JOptionPane.showMessageDialog(null,"Welcome to the Guessing Game.\n"
				+ "I am thinking of a number between 0 and 1000.\n"
				+ "\n");
		
		do { //allows the user to play at least once

		int count = 0;//initializes the number of guesses to 0
		int secretNumber;
		secretNumber = (int)(Math.random() * 1000. + 1);//generates a random number between 1 and 1000
		
		boolean stop = false;
		boolean correct = false;
		
		while (!stop && !correct) 
		{ 
			String guess = JOptionPane.showInputDialog("What is your guess? \n"
					+ "Enter a nonpositive number when you want to quit!");
			int number = Integer.parseInt(guess);
			
			if (number == secretNumber)
			{
				count ++;//increases the number of guesses by 1 each time the user guesses
				if (count <= 10)
				{
					JOptionPane.showMessageDialog(null, "BINGO! It took you only " + count + " guesses.  You are a GENIUS!");
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Phew, finally! It took you " + count + " guesses. \n"
							+ "My five-year-old sister can do way better than you!");
				}
				
				correct = true;//ends the loop
			}
			
			else if (number<=0)
			{
				JOptionPane.showMessageDialog(null, "Quitting already! You are such a LOSER! \n"
						+ "The number I am thinking is " + secretNumber + ".");
				stop = true;//ends the loop
			}
						
			else
			{
				if (number > secretNumber)
				{
					if (number-secretNumber <= 10) //when the different between the secret number and the guessing number is less than 10
					{
						JOptionPane.showMessageDialog(null, "Good guess, but " + number + " is little bit high.");  
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Not too bad, but " + number + " is too high.");
					}
					count++;
				}
				if (number < secretNumber)
				{
					if (secretNumber-number <= 10)
					{
						JOptionPane.showMessageDialog(null, "Good guess, but " + number + " is little bit low.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Not too bad, but " + number + " is too low.");
					}
					count++;
				}
			}
		}
		
		answer = JOptionPane.showInputDialog("Do you want to start a new guess?");
		
		} while (answer.equalsIgnoreCase("yes")); //allows the player to play again 
		
		System.exit(0);//quits the program
	}

}
