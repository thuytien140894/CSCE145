package lab22;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 15 April 2014
 * This program animates balls moving randomly.
 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.*;

public class MovingBall extends JFrame implements Runnable, MouseListener {
	
	//instance variables
	private static final long serialVersionUID = 1L;
	private Thread thread;
	private int xBall = 0;
	private int yBall = 0;
	private Color ballColor = Color.RED;
	final static long MILLISECONDS_DELAY = 100;
	private static JFrame window = new JFrame("Moving Ball");
	private int runCount = 0;
	private int sleepFactor = 0;

	/**
	 * Constructor 
	 */
	public MovingBall(int xB, int yB, Color bColor, int tC) {
		xBall = xB;
		yBall = yB;
		ballColor = bColor;
		sleepFactor = tC;
	}

	/**
	 * 
	 */
	public void run() {
		System.out.println("Thread count = " + sleepFactor);
		for (int n = 0; n < 100; n++) {
			Graphics g = window.getContentPane().getGraphics();
			g.setColor(Color.WHITE);
			g.fillOval(xBall, yBall, 20, 20);
			
			//generates a random number from -50 to 50
			int x = (int)(Math.random() * 100 - 50);
			int y = (int)(Math.random() * 100 - 50);
			
			//makes the ball move randomly
			yBall = yBall + x;
			xBall = xBall + y;
			
			g.setColor(ballColor);
			g.fillOval(xBall, yBall, 20, 20);
			System.out.println("Thread " + Thread.currentThread().getName() + " Run count = " + runCount++);
			
			try {
				Thread.sleep(MILLISECONDS_DELAY * sleepFactor);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Creates a new ball moving randomly when the mouse is clicked.
	 */
	public void mouseClicked(MouseEvent a) {
		int xLoc = a.getLocationOnScreen().x;
		int yLoc = a.getLocationOnScreen().y;
		System.out.println("Mouse clicked at " + xLoc + ", " + yLoc); 
		
		//makes the location the mouse is clicked on the screen as the position where a new ball is created.
		MovingBall mb = new MovingBall(xLoc, yLoc, Color.RED, 2); 
		mb.thread = new Thread(mb);
		mb.thread.start();
	}
	
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse entered");
	}
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse exited");
	}
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Mouse pressed");
	}
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse released");
	}

	/**
	 * Tests the program and displays its GUI
	 */
	public static void main(String[] args) {
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setSize(400, 400);
			Container c = window.getContentPane();
			c.setBackground(Color.WHITE);
			window.setVisible(true);
			MovingBall mb1 = new MovingBall(20, 0, Color.RED, 1);
			window.addMouseListener(mb1);
		}
}