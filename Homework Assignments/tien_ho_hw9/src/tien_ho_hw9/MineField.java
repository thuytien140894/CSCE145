package tien_ho_hw9;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 18 April 2014
 * This program implements a graphical version of the Minefield game.
 */

//imports the program packages
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//The MineField class is a derived class of JFrame that implements a listener interface
public class MineField extends JFrame implements ActionListener {
	//instance variables
	private Container contentPane;
	private JPanel topPanel, bottomPanel;
	private JButton clear, done, minedButton;
	private JButton[] button = new JButton[25]; //declares an array of 25 buttons
	private JLabel message;
	private int start, finish, mine1, mine2;
	private int up, down, left, right;
	private boolean getMined;

	/**
	 * Constructor that sets up the GUI.
	 */
	public MineField() {
		super("Minefield Game");
		setSize(600,690);
		setBackground(Color.ORANGE);
		setup();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * Sets up the GUI
	 */
	public void setup() {
		//Defines the main container
		contentPane = getContentPane();

		//creates the top panel that contains a 5x5 grid of squares
		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(5,5));
		topPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

		//used the loop to set up the 25 buttons and add them to the top panel
		for (int i = 0; i < 25; i++)
		{
			JButton n = new JButton();
			button[i] = n;
			button[i].setOpaque(true);
			button[i].setBackground(Color.ORANGE);
			String buttonName = "button" + i;
			button[i].setActionCommand(buttonName);
			button[i].addActionListener(this);
			button[i].setPreferredSize(new Dimension(50,110));
			topPanel.add(button[i]);
		}

		//creates the bottom panel
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2,1));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		bottomPanel.setBackground(Color.MAGENTA);

		//adds buttons and label to the bottom panel
		clear = new JButton("Clear");
		clear.setPreferredSize(new Dimension(20,40));
		clear.addActionListener(this);
		bottomPanel.add(clear);
		done = new JButton("Done");
		done.addActionListener(this);
		bottomPanel.add(done);
		message = new JLabel();
		message.setPreferredSize(new Dimension(20,40));
		message.setText("Welcome to the Minefield Game!");
		bottomPanel.add(message);

		//adds the top and bottoms to the main container
		contentPane.add(topPanel,BorderLayout.NORTH);
		contentPane.add(bottomPanel,BorderLayout.SOUTH);
	}

	/**
	 * Implements the ActionListener interface.
	 */
	public void actionPerformed(ActionEvent e) {
		//The "Clear" button is clicked.
		if (e.getActionCommand().equals("Clear")) {
			//returns every component to its original state when the game begins
			getMined = false; 
			message.setText("");
			for (int i = 0; i < 25; i++) {
				button[i].setText("");
				button[i].setForeground(Color.BLACK);
				button[i].setBackground(Color.ORANGE);
			}

			//randomly generates "Start" and "Finish" buttons, and also two buttons with hidden mines
			//no two buttons are the same
			start = (int)(Math.random()*25);

			finish = (int)(Math.random()*25);
			while (finish == start) {
				finish = (int)(Math.random()*25);
			}

			mine1 = (int)(Math.random()*25);
			while ((mine1 == start)||(mine1 == finish)) {
				mine1 = (int)(Math.random()*25);
			}

			mine2 = (int)(Math.random()*25);
			while ((mine2 == start)||(mine2 == finish)||(mine2 == mine1)) {
				mine2 = (int)(Math.random()*25);
			}

			button[start].setBackground(Color.GREEN);
			button[start].setText("Start");
			button[finish].setBackground(Color.GREEN);
			button[finish].setText("Finish");
		}

		//restricts movements to only up, down, left, right from the start button
		//the player cannot move diagonally
		up = start - 5;
		down = start + 5;
		left = start - 1;
		right = start + 1;

		for (int i = 0; i < 25; i++) { 
			//ends the loop when the finish button is clicked
			//disables any additional movement
			if (start == finish) {
				message.setText("You completed your passage.");
				break;
			}

			//The top button is clicked.
			if (e.getActionCommand().equals("button" + up)) {
				button[up].setBackground(Color.BLUE);
				start = up;//sets the next button clicked as a new start one

				up = start - 5;
				down = start + 5;
				left = start - 1;
				right = start + 1;

				//checks for mines
				if ((start == mine1)||(start == mine2)) 
					getMined = true;
			}

			//The bottom button is clicked.
			else if (e.getActionCommand().equals("button" + down)) {
				button[down].setBackground(Color.BLUE);
				start = down;

				up = start - 5;
				down = start + 5;
				left = start - 1;
				right = start + 1;

				if ((start == mine1)||(start == mine2)) 
					getMined = true;
			}

			//The left button is clicked.
			else if (e.getActionCommand().equals("button" + left)) {
				button[left].setBackground(Color.BLUE);
				start = left;

				up = start - 5;
				down = start + 5;
				left = start - 1;
				right = start + 1;

				if ((start == mine1)||(start == mine2))
					getMined = true;
			}

			//The right button is clicked
			else if (e.getActionCommand().equals("button" + right)) {
				button[right].setBackground(Color.BLUE);
				start = right;

				up = start - 5;
				down = start + 5;
				left = start - 1;
				right = start + 1; 

				if ((start == mine1)||(start == mine2)) 
					getMined = true;
			}

			//displays an error message when the player tries move diagonally
			else {
				if ((e.getActionCommand().equals("Clear"))||(e.getActionCommand().equals("button" + start)))
					message.setText("");
				else
					message.setText("You made a wrong move. Try again!");
			}
		}

		//The "Done" button is clicked.
		if (e.getActionCommand().equals("Done")) {
			if (start != finish) {
				message.setText("You are not finished yet!");
			}
			
			//only checks for mines if the player finishes his passage
			else {
				button[mine1].setText("MINE");
				button[mine1].setForeground(Color.RED);
				button[mine2].setText("MINE");
				button[mine2].setForeground(Color.RED);

				//checks for mines
				if (getMined == true) 
					message.setText("You failed to make a safe passage!");
				else if (getMined == false)
					message.setText("Congratulations! You made a safe passage!");
			}
		}
	}

	/**
	 * Runs the program and displays its GUI
	 */
	public static void main (String[] args) {
		MineField g = new MineField();//creates a new MineField instance
		g.setVisible(true);//makes the GUI frame visible
		System.out.println("The Minefield Game");
	}
}
