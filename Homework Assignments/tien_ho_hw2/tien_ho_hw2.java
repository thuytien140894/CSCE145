package myHomework;

import javax.swing.JOptionPane;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 29 January 2014
 * This program uses math and geometric computations to analyze a triangle.
 */

public class tien_ho_hw2 extends JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null,"Welcome to the Triangle Program"); 

		/*Reading the sides entered by the user*/
		String n1 = JOptionPane.showInputDialog("Please enter the length of side 1:");
		double a = Double.parseDouble(n1); //converts a string value to a double value
		String n2 = JOptionPane.showInputDialog("Please enter the length of side 2:");
		double b = Double.parseDouble(n2);
		String n3 = JOptionPane.showInputDialog("Please enter the length of side 3:");
		double c = Double.parseDouble(n3);

		String s1, s2, s3, s4;
		double p, A, P;
		p = (a+b+c)/2; //half the perimeter
		A = Math.sqrt(p*(p-a)*(p-b)*(p-c)); //finds the area of the triangle using the Heron's formula
		P = a + b + c; //calculates the perimeter of the triangle

		/*Case 1: a<b<c*/
		if ((a<b)&&(b<c)) {

			if ((a+b)>c) { //checks whether the three sides form a triangle by comparing the longest side to the sum of the other two
				s1 = "This is a triangle.";

				if ((a*a+b*b==c*c)) //checks whether the triangle has a right angle using the Pythagorean Theorem
					s2 = "This is a right triangle.";
				else
					s2 = "This is NOT a right triangle.";

				if ((a==b)&&(b==c)) //checks whether the triangle has three equal sides
					s3 = "This is an equilateral triangle.";
				else
					s3 = "This is NOT an equilateral triangle.";

				if ((a==b)||(b==c)||(a==c)) //checks whether any two sides of the triangle are equal
					s4 = "This is an isosceles triangle.";
				else
					s4 = "This is NOT an isosceles triangle.";

				JOptionPane.showMessageDialog(null, "The three sides you provided are " + c + ", " + b 
						+ ", and " + a + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" 
						+ "\n" 
						+ s1 + "\n" 
						+ s2 + "\n" 
						+ s3 + "\n" 
						+ s4 + "\n" 
						+ "The area of the triangle is " + A + ".\n" 
						+ "The perimeter of the triangle is " + P + ".");
			}

			else
				JOptionPane.showMessageDialog(null, "The three sides you provided are " + c + ", " + b + ", and " + a + ".\n" 
						+ "\n"
						+ "My analysis of this triangle is\n" 
						+ "\n" 
						+ "This is NOT a triangle.");
		}
		
		/*Case 2: a<c<b*/
		else if ((a<c)&&(c<b)) {

			if ((a+c)>b) {
				s1 = "This is a triangle.";

				if ((a*a+b*b==c*c)) 
					s2 = "This is a right triangle.";
				else
					s2 = "This is NOT a right triangle.";

				if ((a==b)&&(b==c)) 
					s3 = "This is an equilateral triangle.";
				else
					s3 = "This is NOT an equilateral triangle.";

				if ((a==b)||(b==c)||(a==c)) 
					s4 = "This is an isosceles triangle.";
				else
					s4 = "This is NOT an isosceles triangle.";

				JOptionPane.showMessageDialog(null, "The three sides you provided are " + b + ", " + c + ", and " + a + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" 
						+ "\n"
						+ s1 + "\n" 
						+ s2 + "\n" 
						+ s3 + "\n" 
						+ s4 + "\n" 
						+ "The area of the triangle is " + A + ".\n" 
						+ "The perimeter of the triangle is " + P + ".");
			}

			else
				JOptionPane.showMessageDialog(null, "The three sides you provided are " + b + ", " + c + ", and " + a + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" 
						+ "\n" 
						+ "This is NOT a triangle.");			
		}

		/*Case 3: b<c<a*/
		else if ((b<c)&&(c<a)) {

			if ((b+c)>a) {
				s1 = "This is a triangle.";

				if ((a*a+b*b==c*c)) 
					s2 = "This is a right triangle.";
				else
					s2 = "This is NOT a right triangle.";

				if ((a==b)&&(b==c)) 
					s3 = "This is an equilateral triangle.";
				else
					s3 = "This is NOT an equilateral triangle.";

				if ((a==b)||(b==c)||(a==c)) 
					s4 = "This is an isosceles triangle.";
				else
					s4 = "This is NOT an isosceles triangle.";

				JOptionPane.showMessageDialog(null, "The three sides you provided are " + a + ", " + c + ", and " + b + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" + "\n" 
						+ s1 + "\n" 
						+ s2 + "\n" 
						+ s3 + "\n" 
						+ s4 + "\n" 
						+ "The area of the triangle is " + A + ".\n" 
						+ "The perimeter of the triangle is " + P + ".");
			}

			else
				JOptionPane.showMessageDialog(null, "The three sides you provided are " + a + ", " + c + ", and " + b + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" 
						+ "\n" 
						+ "This is NOT a triangle.");
		}

		/*Case 4: c<b<a*/
		else if ((c<b)&&(b<a)) {

			if ((b+c)>a) {
				s1 = "This is a triangle.";
				if ((a*a+b*b==c*c)) 
					s2 = "This is a right triangle.";
				else
					s2 = "This is NOT a right triangle.";
				if ((a==b)&&(b==c)) 
					s3 = "This is an equilateral triangle.";
				else
					s3 = "This is NOT an equilateral triangle.";
				if ((a==b)||(b==c)||(a==c)) 
					s4 = "This is an isosceles triangle.";
				else
					s4 = "This is NOT an isosceles triangle.";
				JOptionPane.showMessageDialog(null, "The three sides you provided are " + a + ", " + b + ", and " + c + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" 
						+ "\n" 
						+ s1 + "\n" 
						+ s2 + "\n" 
						+ s3 + "\n" 
						+ s4 + "\n" 
						+ "The area of the triangle is " + A + ".\n" 
						+ "The perimeter of the triangle is " + P + ".");
			}

			else
				JOptionPane.showMessageDialog(null, "The three sides you provided are " + a + ", " + b + ", and " + c + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n"
						+ "\n" 
						+ "This is NOT a triangle.");
		}

		/*Case 5: c<a<b*/
		else if ((c<a)&&(a<b)) {

			if ((a+c)>b) {
				s1 = "This is a triangle.";

				if ((a*a+b*b==c*c)) 
					s2 = "This is a right triangle.";
				else
					s2 = "This is NOT a right triangle.";

				if ((a==b)&&(b==c)) 
					s3 = "This is an equilateral triangle.";
				else
					s3 = "This is NOT an equilateral triangle.";

				if ((a==b)||(b==c)||(a==c)) 
					s4 = "This is an isosceles triangle.";
				else
					s4 = "This is NOT an isosceles triangle.";

				JOptionPane.showMessageDialog(null, "The three sides you provided are " + b + ", " + a + ", and " + c + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" + "\n" 
						+ s1 + "\n" 
						+ s2 + "\n" 
						+ s3 + "\n" 
						+ s4 + "\n" 
						+ "The area of the triangle is " + A + ".\n" 
						+ "The perimeter of the triangle is " + P + ".");
			}

			else
				JOptionPane.showMessageDialog(null, "The three sides you provided are " + b + ", " + a + ", and " + c + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n"
						+ "\n" 
						+ "This is NOT a triangle.");
		}

		/*Case 6: b<a<c*/
		else {

			if ((a+b)>c) {
				s1 = "This is a triangle.";

				if ((a*a+b*b==c*c)) 
					s2 = "This is a right triangle.";
				else
					s2 = "This is NOT a right triangle.";

				if ((a==b)&&(b==c)) 
					s3 = "This is an equilateral triangle.";
				else
					s3 = "This is NOT an equilateral triangle.";

				if ((a==b)||(b==c)||(a==c))
					s4 = "This is an isosceles triangle.";
				else
					s4 = "This is NOT an isosceles triangle.";

				JOptionPane.showMessageDialog(null, "The three sides you provided are " + c + ", " + a + ", and " + b + ".\n" 
						+ "\n" 
						+ "My analysis of this triangle is\n" + "\n" 
						+ s1 + "\n" 
						+ s2 + "\n" 
						+ s3 + "\n"
						+ s4 + "\n" + "The area of the triangle is " + A + ".\n" 
						+ "The perimeter of the triangle is " + P + ".");
			}

			else
				JOptionPane.showMessageDialog(null, "The three sides you provided are " + c + ", " + a + ", and " + b + ".\n" 
						+ "\n"
						+ "My analysis of this triangle is\n" 
						+ "\n" 
						+ "This is NOT a triangle.");
		}

		System.exit(0); //quits the program
		
		}
		
	}


