package lab23;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 17 April 2014
 * This program produces a graphical version of Whack-A-Mole game.
 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.*;

public class WhackAMole implements Runnable, MouseListener {

	//static instance variables
	static JPanel jpanel;
	static Thread thread;
	static JFrame jframe = new JFrame("Whacking-A-Mole");
	static Graphics g;
	static Container container = new Container();
	static int xmouse, ymouse;
	static int xball, yball;
	static int ballNumber, points;
	


	//default constructor
	public WhackAMole() {}

	public void run() {
		//creates a new Graphics object
		g = jframe.getContentPane().getGraphics();
		
		ballNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to the Whack-A-Mole Game.\n"
				+ "\n"
				+ "Please enter the number of balls you would like to attempt."));
		
		//repeats the program over a specified number of times that the user wants to attempt
		for (int i = 0; i < ballNumber; i++) {
			
			//randomly generates the location of a ball
			xball = (int)(Math.random()*350);
			yball = (int)(Math.random()*350);
			
			//draws a blue ball with radius of 20
			g.setColor(Color.BLUE);
			g.fillOval(xball, yball, 40, 40);
			
			try {
				Thread.sleep(1000);//stops the thread for one second
				g.setColor(Color.WHITE);//covers the blue ball with the white one
				g.fillOval(xball, yball, 40, 40);
				System.out.println("Ball Location: " + xball + ", " + yball);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//reads the location where the mouse is clicked
		xmouse = arg0.getX()-10;
		ymouse = arg0.getY()-30;
		
		System.out.println("Mouse location: " + xmouse + ", " + ymouse);
		
		//add one point each time the mouse is clicked anywhere on the ball
		if ((Math.abs(xball-xmouse) < 20) && (Math.abs(yball-ymouse) < 20)) {
			points = points + 1;
			System.out.println("Your score is: " + points);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * Runs the program and displays its GUI
	 */
	public static void main(String[] args) {

		WhackAMole mb = new WhackAMole();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(400,400);
		container = jframe.getContentPane();
		container.setBackground(Color.WHITE);
		jframe.addMouseListener(mb);  
		jframe.setVisible(true);//displays the GUI
		mb.thread = new Thread(mb);//creates an object of Thread for mb
		mb.thread.start();
	}
}
