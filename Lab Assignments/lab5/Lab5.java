package myLab;

import javax.swing.JOptionPane;
/**
 * @author Tien Thuy Ho
 * @ version 1.2, 28 January 2014
 * This program checks the validity of a date.
 */
public class Lab5 extends JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reading the date entered by the user*/
		String date = JOptionPane.showInputDialog("Please enter a date in mm/dd/yyyy:"); //returns the user's input to the date variable
		String n1 = date.substring(0,2); //obtains the month
		int month = Integer.parseInt(n1); //converts the string value to an int value
		String n2 = date.substring(3,5); //obtains the day
		int day = Integer.parseInt(n2);
		String n3 = date.substring(6,10); //obtains the year
		int year = Integer.parseInt(n3);
		
		String m;
		
		/*Naming the months*/
		if (month == 1) 
			m = "January";
		else if (month == 3) 
			m = "March";
		else if (month == 4) 
			m = "April";
		else if (month == 5) 
			m = "May";
		else if (month == 6) 
			m = "June";
		else if (month == 7) 
			m = "July";
		else if (month == 8) 
			m = "August";
		else if (month == 9) 
			m = "September";
		else if (month == 10) 
			m = "October";
		else if (month == 11) 
			m = "November";
		else  
			m = "December";
		
		/*Case 1: February*/
		if (month == 2) {
			if ((year % 4 == 0)&&(year % 100 != 0)||(year % 400 == 0)) { //checks whether it is a leap year
				if (day <= 29)
					JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is a valid date.");
				else
					JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is NOT a valid date\n"
						+ "because " + year + " is a leap year,\n"
						+ "and the month February\n"
						+ "has at most 29 days.");
			}
			
			else { //if it is not a leap year
				if (day <= 28) 
					JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is a valid date.");
				else 
					JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is NOT a valid date\n"
						+ "because " + year + " is not a leap year,\n"
						+ "and so the month February only\n"
						+ "has at most 28 days.");
			}
		}
		
		/*Case 2: 30-day months*/
		else if ((month == 4)||(month == 6)||(month == 9)||(month == 11)) { //checks whether the month is April, June, September, or November
			if (day <= 30)
				JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is a valid date.");
			else 
				JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is NOT a valid date\n"
						+ "because the month " + m + "\n"
						+ "has at most 30 days.");
			}
		
		/*Case 3: 31-day months*/
		else if ((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 10)||(month == 12)) { 
			//checks whether the month is January, March, May, July, August, October, or December
			if (day <= 31)
				JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is a valid date.");
			else 
				JOptionPane.showMessageDialog(null, "The date you entered is " + date + ".\n"
						+ "\n"
						+ "This is NOT a valid date\n"
						+ "because the month " + m + "\n"
						+ "has at most 31 days.");
			}
		
		System.exit(0); //quits the program
		
		}					
	}


