package lab18;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 27 March 2014
 * This program runs a Tic Tac Toe game.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// which class should this class inherit from?
// this class should implement an interface too!
// modify the next line:
public class TicTacToe extends JFrame implements ActionListener {

	/** ***************************************************
	 * maintains the state of the game. 1 indicates a "O" *
	 * and 2 indicates a "X" and 0 indicates unmarked     *
	 ******************************************************/
	private int playingField[] = new int[9]; 

	private int turn; /** keeps track of which players turn it is **/
	private int click; /** keeps track of how many button clicks have occured **/

	/** Label which displays which players turn it is and the winner **/
	private JLabel infoLabel;

	/** First button (row0 and column 0) **/
	private JButton button0; 

	//declare remaining buttons here
	private JButton button1, button2, button3, button4, 
	button5, button6, button7, button8;

	public TicTacToe(){
		super("Tic Tac Toe");
		this.setSize(400,400);

		this.turn = 1;
		this.click = 0;

		this.setup();

		// add code to make the frame visible
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void setup(){
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		/** change the background color **/
		contentPane.setBackground(new Color(50,200,100));
		contentPane.setForeground(new Color(0, 0, 0));

		this.button0 = new JButton();
		this.button0.setBounds(100,20,80,80);
		this.button0.setActionCommand("button0");

		// add an action listener to the button here, this will call the 
		//actionPerformed method if the button is clicked
		this.button0.addActionListener(this);

		/** adding the first button to the content pane of the frame **/
		contentPane.add(button0);
		// add remaining buttons here and set their bounds
		this.button1 = new JButton();
		this.button1.setBounds(200,20,80,80);
		this.button1.setActionCommand("button1");
		this.button1.addActionListener(this);
		contentPane.add(button1);

		this.button2 = new JButton();
		this.button2.setBounds(300,20,80,80);
		this.button2.setActionCommand("button2");
		this.button2.addActionListener(this);
		contentPane.add(button2);

		this.button3 = new JButton();
		this.button3.setBounds(100,120,80,80);
		this.button3.setActionCommand("button3");
		this.button3.addActionListener(this);
		contentPane.add(button3);
		
		this.button4 = new JButton();
		this.button4.setBounds(200,120,80,80);
		this.button4.setActionCommand("button4");
		this.button4.addActionListener(this);
		contentPane.add(button4);
		
		this.button5 = new JButton();
		this.button5.setBounds(300,120,80,80);
		this.button5.setActionCommand("button5");
		this.button5.addActionListener(this);
		contentPane.add(button5);

		this.button6 = new JButton();
		this.button6.setBounds(100,220,80,80);
		this.button6.setActionCommand("button6");
		this.button6.addActionListener(this);
		contentPane.add(button6);

		this.button7 = new JButton();
		this.button7.setBounds(200,220,80,80);
		this.button7.setActionCommand("button7");
		this.button7.addActionListener(this);
		contentPane.add(button7);

		this.button8 = new JButton();
		this.button8.setBounds(300,220,80,80);
		this.button8.setActionCommand("button8");
		this.button8.addActionListener(this);
		contentPane.add(button8);

		this.infoLabel = new JLabel();
		/** the label initially displays this **/
		this.infoLabel.setText("Turn: Player1(O)");
		this.infoLabel.setBounds(10,310,200,30);
		contentPane.add(infoLabel);	
		

	}

	// Complete the implementation of actionPerformed()
	public void actionPerformed(ActionEvent ae) {
		String source = ae.getActionCommand();
		String text; /** "O" for player 1 and "X" for player 2 **/

		click++; /** incrementing the number of clicks **/
		int tempturn = turn;
		if(turn == 1){
			turn = 2;/** next turn player 2 **/
			text = "O";
			this.infoLabel.setText("Turn: PLayer2(X)");
		}
		else{
			text = "X";
			turn = 1; /** next turn player 1 **/
			this.infoLabel.setText("Turn: Player1(O)");
		}


		if(source.equals("button0")){
			button0.setText(text); /** if first button is clicked setText to "O" **/
			playingField[0] = tempturn;   /** update the state of the game **/
		}
		//write the actions for the remaining buttons here

		if(source.equals("button1")){
			button1.setText(text);
			playingField[1] = tempturn;
		}

		if(source.equals("button2")){
			button2.setText(text);
			playingField[2] = tempturn;
		}

		if(source.equals("button3")){
			button3.setText(text);
			playingField[3] = tempturn;
		}

		if(source.equals("button4")){
			button4.setText(text);
			playingField[4] = tempturn;
		}

		if(source.equals("button5")){
			button5.setText(text);
			playingField[5] = tempturn;
		}

		if(source.equals("button6")){
			button6.setText(text);
			playingField[6] = tempturn;
		}

		if(source.equals("button7")){
			button7.setText(text);
			playingField[7] = tempturn;
		}

		if(source.equals("button8")){
			button8.setText(text);
			playingField[8] = tempturn;
		}

		/******************************************************************************
		 * getWinner() returns 0 if it is a tie, returns 1 if player 1 is winner,     *
		 * 2 if player 2 is winner and 3 if a winner cannot be determined at this time*
		 * Based on the returned value set the text on label infoLabel appropriately  *
		 ******************************************************************************/
		int winner = getWinner();
		if (winner == 0)
			this.infoLabel.setText("It's a tie!");
		else if (winner == 1)
			this.infoLabel.setText("PLayer 1 wins!");
		else if (winner == 2)
			this.infoLabel.setText("Player 2 wins!");
	}


	/*****************************************
	 * This method is complete!              *
	 * don't worry about all of this!        *
	 *****************************************/ 
	public int getWinner(){
		if((playingField[0] == 1 && playingField[1] == 1 && playingField[2] == 1) || 
				(playingField[0] == 1 && playingField[3] == 1 && playingField[6] == 1) ||
				(playingField[0] == 1 && playingField[4] == 1 && playingField[8] == 1) ||
				(playingField[1] == 1 && playingField[4] == 1 && playingField[7] == 1) || 
				(playingField[2] == 1 && playingField[5] == 1 && playingField[8] == 1) ||
				(playingField[3] == 1 && playingField[4] == 1 && playingField[5] == 1) ||
				(playingField[6] == 1 && playingField[7] == 1 && playingField[8] == 1) || 
				(playingField[2] == 1 && playingField[4] == 1 && playingField[6] == 1)){

			return 1;
		}
		else if((playingField[0] == 2 && playingField[1] == 2 && playingField[2] == 2) ||
				(playingField[0] == 2 && playingField[3] == 2 && playingField[6] == 2) ||
				(playingField[0] == 2 && playingField[4] == 2 && playingField[8] == 2) ||
				(playingField[1] == 2 && playingField[4] == 2 && playingField[7] == 2) ||
				(playingField[2] == 2 && playingField[5] == 2 && playingField[8] == 2) ||
				(playingField[3] == 2 && playingField[4] == 2 && playingField[5] == 2) || 
				(playingField[6] == 2 && playingField[7] == 2 && playingField[8] == 2) ||
				(playingField[2] == 2 && playingField[4] == 2 && playingField[6] == 2)){

			return 2;
		}    	
		else{
			if(click == 9)
				return 0; /** Tie **/
			else {
				return 3; /** Win/Tie cannot be determined yet **/
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Starting the frame");
		TicTacToe theGame = new TicTacToe();
	}
}