package lab14;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 05 March 2014
 * This program simulates the Monty Hall game show.
 */

import java.util.Scanner;

public class MontyHallSimulation 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Monty Hall Game Show.");
		System.out.println();
		
		int strategy1 = 0;//initializes the number of strategy1 and strategy2 to 0
		int strategy2 = 0;
		
		for (int n = 0; n < 1000; n++)//repeats the game 1000 times
		{
			int door = (int)(Math.random()*3+1);//randomly picks a door from 1 to 3 that has a car
			
			int contestant = (int)(Math.random()*3+1);//randomly picks a door for the contestant

			int host = (int)(Math.random()*3+1); //randomly picks a door for the host, but not the one the contestant chose
			while (host == contestant)
			{
				host = (int)(Math.random()*3+1);
			}

			int remainingDoor = (int)(Math.random()*3+1);//the door that is chosen by neither the contestant nor the host
			while ((remainingDoor == contestant) || (remainingDoor == host))
			{
				remainingDoor = (int)(Math.random()*3+1);
			}
			
			if (contestant != door)
					strategy1 ++;//increments the counter strategy1 if the contestant's door is not the right door
			else if (remainingDoor != door)
					strategy2 ++;//increments the counter strategy2 if the unchosen door is not the right one.
		}
		
		System.out.println("The number of times you would have won by switching to the host's choice of door: " + strategy1);
		System.out.println("The number of times you would have won by staying with your original choice: " + strategy2);
	}
}
