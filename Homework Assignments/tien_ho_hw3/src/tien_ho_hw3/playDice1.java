package tien_ho_hw3;

import java.util.Scanner;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 10 February 2014
 * This program allows two people to play a game of dice and keeps track of their winnings and losses.
 */

public class playDice1 {

	public static void main(String[] args)
	{
		String answer1 = ""; //initializes the variable answer1 to an empty string
		String answer2 = "";
		String answer3 = "";
		String answer4 = "";

		System.out.println("Welcome to the Dice Game!");
		System.out.println("You need to have at least $1000 to play this game.");
		System.out.println("I will keep track of your winnings and losses.");
		System.out.println("Please enter \"yes\" or \"no\" when I ask you a question.");
		System.out.println("ARE YOU READY?");
		Scanner keyboard = new Scanner (System.in);
		String answer = keyboard.next();

		if (answer.equalsIgnoreCase("yes"))
		{
			Die die1 = new Die();//creates a new object called die1 within the class Die
			Die die2 = new Die();

			Scanner kb = new Scanner(System.in);
			BankAccount player1 = new BankAccount();
			BankAccount player2 = new BankAccount();
			System.out.println("Enter the name of player 1:");
			String name1 = kb.nextLine();
			player1.construct(name1);//creates a bank account for the first player
			System.out.println("Enter the name of player 2:");
			String name2 = kb.nextLine();
			player2.construct(name2);

			System.out.println();

			player1.display();//displays the player's bank account
			player2.display();

			System.out.println();

			do //allows the two players to play the game at least once
			{
				System.out.println("How much would " + player1.getName() + " like to wager?");
				int wager1 = keyboard.nextInt();
				if (wager1 == 0)
					System.exit(0);//ends the game if the player wagers nothing
				if (wager1 > player1.getBalance())
				{
					System.out.println(player1.getName() + " is CHEATING.");
					System.exit(0);//ends the game if the player wages more than his/her bank account allows
				}

				System.out.println("How much would " + player2.getName() + " like to wager?");
				int wager2 = keyboard.nextInt();
				if (wager2 == 0)
					System.exit(0);
				if (wager2 > player2.getBalance())
				{
					System.out.println(player2.getName() + " is CHEATING.");
					System.exit(0);
				}

				System.out.println();

				System.out.println("LET'S ROLL!"); //starts the game
				int value1 = die1.roll();//rolls the first die
				int value2 = die2.roll();//rolls the second die
				System.out.println("You rolled a " + value1 + " and a " + value2 + ".");
				ShowDie sd1 = die1.display(0,0);//displays the dice and its result graphically
				ShowDie sd2 = die2.display(110, 0);
				int total = value1 + value2; //finds the sum of the two die values

				/** Winning conditions for player 1-Even values*/
				if (total == 12||total == 10||total == 8||total == 6||total == 4||total == 2)
				{
					System.out.println(player1.getName() + " WINS!");
					player1.deposit(wager1);//deposits the money that player 1 wagers into his bank account
					player2.withdraw(wager2);//withdraws the money that player 2 wagers out of his bank account

				}

				/** Winning conditions for player 2-Odd values*/
				if (total == 11||total == 9||total == 7||total == 5||total == 3)
				{
					System.out.println(player2.getName() + " WINS!");
					player2.deposit(wager2);
					player1.withdraw(wager1);
				}

				System.out.println();

				player1.display();//displays the updated balance after the game
				player2.display();

				System.out.println();

				/**allows the players to play as many games of dies as they wish as long as they have money*/
				System.out.println("Would " + player1.getName() + " like to play again?");
				answer1 = keyboard.next();
				if (answer1.equalsIgnoreCase("yes"))
				{
					if (player1.getBalance() == 0)
					{
						System.out.println("Sorry! " + player1.getName() + " has no more money to continue playing.");
						System.out.println("Would " + player1.getName() + " like to add more money into the bank account?");
						answer3 = keyboard.next();
						if (answer3.equalsIgnoreCase("yes"))
						{
							System.out.println("How much would " + player1.getName() + " like to add?");
							int add1 = keyboard.nextInt();
							if (add1 > 0)
							{
								player1.add(add1);//adds money into the player's account
								player1.display();
								System.out.println();
							}
							else 
							{
								System.out.println(player1.getName() + " is lYING.");
								System.exit(0);//ends the game if the player adds nothing to his/her bank account
							}
						}
						else
							System.exit(0);//ends the game when the player does not want to add money
					}
				}
				else
				{
					System.out.println("Thank you for playing!");
					System.exit(0);//ends the game if the player does not want to continue
				}

				System.out.println("Would " + player2.getName() + " like to play again?");
				answer2 = keyboard.next();
				if (answer2.equalsIgnoreCase("yes"))
				{
					if (player2.getBalance() == 0)
					{
						System.out.println("Sorry! " + player2.getName() + " has no more money to continue playing.");
						System.out.println("Would " + player2.getName() + " like to add more money into the bank account?");
						answer4 = keyboard.next();
						if (answer4.equalsIgnoreCase("yes"))
						{
							System.out.println("How much would " + player2.getName() + " like to add?");
							int add2 = keyboard.nextInt();
							if (add2 > 0)
							{
								player2.add(add2);
								player2.display();
								System.out.println();
							}
							else
							{
								System.out.println(player2.getName() + " is LYING.");
								System.exit(0);
							}
						}
						else
							System.exit(0);
					}
				}
				else 
				{
					System.out.println("Thank you for playing!");
					System.exit(0);
				}

				if (answer1.equalsIgnoreCase("yes") && answer2.equalsIgnoreCase("yes"))
				{
					System.out.println();
					System.out.println("Let's keep playing!");
				}

			} 
			/**as long as both players wish to continue the game, the game is repeated.*/
			while (answer1.equalsIgnoreCase("yes") && answer2.equalsIgnoreCase("yes"));
		}
		else 
			System.exit(0); //ends the game if the user does not want to play
	}
}





