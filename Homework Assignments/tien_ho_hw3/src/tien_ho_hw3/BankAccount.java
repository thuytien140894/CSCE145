package tien_ho_hw3;

import java.util.Scanner;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 11 February 2014
 * This program creates a class named BankAccount used to calculate and display each player's winnings and losses. 
 */

public class BankAccount //creates a class called BankAccount
{
	private String name; //private instance variable name cannot be used to access its value outside the class definition
	private int balance; 

	/**
	 * Precondition: newName is a string value.
	 * Stores the specified name in the instance variable name.
	 * Stores $1000 in the initial balance. 
	 */
	public void construct(String newName)
	{
		this.name = newName;
		this.balance = 1000;
	}
	
	/**Retrieves the value from the private instance variable balance.*/
	public int getBalance()
	{
		return balance;
	}
	
	/**Displays the current balance.*/
	public void display()
	{
		System.out.println(name + "'s balance: " + "$" + balance);
	}
	
	/**
	 * Precondition: $ is a nonnegative number.
	 * Returns the updated balance after the specified amount of money deposited.
	 */
	public int deposit(int $)
	{
		this.balance = balance + $;
		return balance;
	}
	
	/**
	 * Precondition: $ is a nonnegative number.
	 * Returns the updated balance after the specified amount of money withdrawn.
	 */
	public int withdraw(int $)
	{
		this.balance = balance - $;
		return balance;
	}
	
	/**
	 * Precondition: $ is a nonnegative number.
	 * Returns the updated balance after the specified amount of money added.
	 */
	public int add(int $)
	{
		this.balance = balance + $;
		return balance;
	}
	
	/**Retrieves the value from the private instance variable name.*/
	public String getName()
	{
		return name;
	}
}
