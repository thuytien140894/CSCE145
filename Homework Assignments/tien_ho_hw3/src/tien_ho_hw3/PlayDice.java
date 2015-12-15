package tien_ho_hw3;

import java.util.Scanner;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 11 February 2014
 * This program allows two people to play a game of dice and keeps track of their winnings and losses.
 */

public class PlayDice 
{
	public static void main(String[] args)
	{

		String answer1 = "";
		String answer2 = "";
		System.out.println("Welcome to the dice game!");
		System.out.println("You need to have at least $1000 to play this game.");
		System.out.println("I will keep track of your winnings and losses.");
		System.out.println("Please enter \"yes\" or \"no\" when I ask you a question.");
		System.out.println("ARE YOU READY?");
		Scanner keyboard = new Scanner (System.in);
		String answer = keyboard.next();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			Die die1 = new Die();
			Die die2 = new Die();

			Scanner kb = new Scanner(System.in);
			BankAccount player1 = new BankAccount();
			BankAccount player2 = new BankAccount();
			System.out.println("Enter the name of player 1:");
			String name1 = kb.nextLine();
			player1.construct(name1);
			System.out.println("Enter the name of player 2:");
			String name2 = kb.nextLine();
			player2.construct(name2);

			System.out.println();
			player1.display();
			player2.display();

			System.out.println();
			do 
			{
				System.out.println("How much would " + player1.getName() + " like to wager?");
				int wager1 = keyboard.nextInt();
				if (wager1 == 0)
					System.exit(0);
				if (wager1 > player1.getBalance())
				{
					System.out.println(player1.getName() + " is CHEATING.");
					System.exit(0);
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
				System.out.println("LET'S ROLL!");
				int value1 = die1.roll();
				int value2 = die2.roll();
				System.out.println("You rolled a " + value1 + " and a " + value2 + ".");
				ShowDie sd1 = die1.display(0,0);
				ShowDie sd2 = die2.display(110, 0);
				int total = value1 + value2;
				if (total == 12||total == 10||total == 8||total == 6||total == 4||total == 2)
				{
					System.out.println(player1.getName() + " WINS!");
					player1.deposit(wager1);
					player2.withdraw(wager2);

				}
				if (total == 11||total == 9||total == 7||total == 5||total == 3)
				{
					System.out.println(player2.getName() + " WINS!");
					player2.deposit(wager2);
					player1.withdraw(wager1);
				}

				System.out.println();
				player1.display();
				player2.display();
				System.out.println();
				
				System.out.println("Would " + player1.getName() + " like to play again?");
				answer1 = keyboard.next();
				if (answer1.equalsIgnoreCase("yes"))
				{
					if (player1.getBalance() == 0)
					{
						System.out.println("Sorry! " + player1.getName() + " has no money left in the bank account to continue playing.");
						System.out.println("Thank you for playing!");
						System.exit(0);
					}
				}
				else 
				{
					System.out.println("Thank you for playing!");
					System.exit(0);
				}
				
				System.out.println("Would " + player2.getName() + " like to play again?");
				answer2 = keyboard.next();
				if (answer2.equalsIgnoreCase("yes"))
				{
					if (player2.getBalance() == 0)
					{
						System.out.println("Sorry! " + player2.getName() + " has no money left in the bank account to continue playing.");
						System.out.println("Thank you for playing!");
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
			while (answer1.equalsIgnoreCase("yes") && answer2.equalsIgnoreCase("yes"));
		}
		else
			System.exit(0);
	}
}

