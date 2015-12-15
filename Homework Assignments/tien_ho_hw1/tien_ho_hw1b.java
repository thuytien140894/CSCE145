package myHomework;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 22 January 2014
 * This program uses JOptionPane to check a password. 
 */
import javax.swing.JOptionPane;

public class tien_ho_hw1b extends JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Password Checker"); 

		String userName = JOptionPane.showInputDialog("Please enter your username:"); //shows an input dialog and reads the username entered by the user
		String passWord = JOptionPane.showInputDialog("Please enter your password:"); //reads the password entered by the user

		if (passWord.equals("thanhtuyen")) //checks whether the password entered matches the internal secret password
			JOptionPane.showMessageDialog(null,"You are approved by access control!"); //shows an approved message if the user enters a correct password 
		else 
			JOptionPane.showMessageDialog(null,"Sorry", "Error", JOptionPane.ERROR_MESSAGE); //shows an error message if the user enters an incorrect password

		System.exit(0); //quits the program
	}

}
