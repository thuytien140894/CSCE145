package tien_ho_hw7;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 26 March 2014
 * This program creates a trip time calculator.
 */

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TripComputer extends JApplet implements ActionListener
{
	//constants and instance variables
	private double totalTime;
	private boolean restStopTaken;
	public static final int CHAR_PER_LINE = 4;
	private JTextField stop, distance, time, speed; 
	private JButton stopButton, legButton;
	private JLabel stopLabel, distanceLabel, timeLabel1, timeLabel2, speedLabel;

	/**
	 * Displays the applet.
	 */
	public void init()
	{
		Container contentPane = getContentPane();//obtain a content pane window
		this.setSize(230,230);
		contentPane.setBackground(Color.CYAN);
		contentPane.setLayout(new FlowLayout());

		JLabel program = new JLabel("TRIP TIME CALCULATOR");
		contentPane.add(program); //add the label to the content pane
		JLabel line = new JLabel("                              ");
		contentPane.add(line);
		
		stopButton = new JButton("ADD STOP");//create a button to add a rest stop
		stopButton.addActionListener(this);//listen to events from the button
		contentPane.add(stopButton);//add the stopButton to the content Pane
		legButton = new JButton("ADD LEG");
		legButton.addActionListener(this);
		contentPane.add(legButton);

		stopLabel = new JLabel("STOP TIME          ");
		distanceLabel = new JLabel("DISTANCE");
		contentPane.add(stopLabel);
		contentPane.add(distanceLabel);

		stop = new JTextField("   " + 0.0, CHAR_PER_LINE);//create a textbox for the user to enter 
														  //the amount of rest time and initialize it to 0.0
		contentPane.add(stop);//add the text box to the content pane
		JLabel space1 = new JLabel("         ");
		contentPane.add(space1);
		
		distance = new JTextField("    mi",CHAR_PER_LINE);//the distance should be in miles
		contentPane.add(distance);

		timeLabel1 = new JLabel("YOUR TRIP TIME                  ");
		contentPane.add(timeLabel1);
		timeLabel2 = new JLabel("SO FAR:                ");
		contentPane.add(timeLabel2);
		speedLabel = new JLabel("SPEED  ");
		contentPane.add(speedLabel);

		time = new JTextField(" hr:min", CHAR_PER_LINE);
		contentPane.add(time);
		JLabel space2 = new JLabel("         ");
		contentPane.add(space2);
		
		speed = new JTextField("  mi/h",CHAR_PER_LINE);//the speed should be expressed in miles per hour
		contentPane.add(speed);	
	}

	/**
	 * Precondition: distance and speed are parameters of double values.
	 * Computes the time for a leg of the trip given a distance in miles and speed in miles per hour.
	 * Throws an exception when if either the distance or the speed is negative.
	 */
	public void computeLegTime(double distance, double speed) throws NegativeNumberException
	{
		if ((distance < 0) || (speed < 0))
			throw new NegativeNumberException();

		totalTime = distance/speed;	
	}

	/**
	 * Precondition: time is a double value.
	 * Takes a rest stop for the given amount of time.
	 * Throws an exception if the time is negative.
	 * Throws an exception if the client code attempts to take two rest stops in a row.
	 */
	public void takeRestStop(double time) throws NegativeNumberException, TwoRestStopsException
	{
		if (restStopTaken == false)
		{
			if (time >= 0) 
			{
				totalTime = totalTime + time;
			}
			else 
				throw new NegativeNumberException();
		}
		else if (restStopTaken == true)
			throw new TwoRestStopsException();
	}

	/**
	 * Returns the current total time for the trip.
	 */
	public double getTripTime()
	{
		return totalTime; 
	}

	/**
	 * Implements the listener interface.
	 */
	public void actionPerformed(ActionEvent e)
	{		
		//implement the program that might encounter exceptions
		try
		{
			String distanceInput = distance.getText();//retrieve the value from the distance textfield
			double d = Double.parseDouble(distanceInput);//convert the String input to a double value
			String speedInput = speed.getText();
			double s = Double.parseDouble(speedInput);
			
			//computes the trip time when the the legButton fires an event
			if (e.getActionCommand().equals("ADD LEG")) 
			{
				restStopTaken = false;//once the client starts a new leg, he is able to take a rest stop again.
				computeLegTime(d,s);//invoke the computeLegTime method to calculate the trip time
				double totalTime = getTripTime();//return the current trip time
				int hour = (int)totalTime; //cast the total trip time from a double to an integer value
										   //this gives the number of hours
				int minute = (int)((totalTime - hour)*60);//calculates the number of minutes
				time.setText("   " + hour + ":" + minute);//digital time display
			}

			String stopInput = stop.getText();//the user should enter the rest time using numbers only
			double r = Double.parseDouble(stopInput);
			
			//computes the total time after a rest stop is added and the stopButton fires an event
			if (e.getActionCommand().equals("ADD STOP"))
			{
				takeRestStop(r);//invoke the takeRestStop method to take a rest stop of a specified amount of time
				restStopTaken = true;//the user cannot attempt two rest stops in a row.
				double totalTime = getTripTime();
				int hour2 = (int)totalTime;
				int minute2 = (int)((totalTime - hour2)*60);
				time.setText("   " + hour2 + ":" + minute2);
			} 

		}

		catch(NegativeNumberException c)//handle the exception for negative value
		{
			time.setText(c.getMessage()); //display the message for this exception
		}


		catch(TwoRestStopsException c) //handle the exception for attempted two rest stops
		{
			time.setText(c.getMessage());
		}
		
		finally//this part is executed regardless of the exceptions in the try block
		{
			System.out.println("End of the program");
		}
	}
}
