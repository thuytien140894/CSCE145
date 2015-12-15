package tien_ho_hw4;

import java.util.Scanner;
/**
 * @author Tien Thuy Ho
 * @version 1.2, 19 February 2014
 * This program uses three points to determine the areas and perimeters of a triangle and a rectangle. 
 */

public class Geometry 
{	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Geometry Program.");
		System.out.println("I will find the area and perimeter of a triangle and a rectangle.");
		System.out.println("Give me three points by entering six real values.");
		System.out.println("Each point should consist of an x-coordinate and a y-coordinate.");
		
		Scanner keyboard = new Scanner(System.in);
		double n1, n2, n3, n4, n5, n6;
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();
		n3 = keyboard.nextDouble();
		n4 = keyboard.nextDouble();
		n5 = keyboard.nextDouble();
		n6 = keyboard.nextDouble();
		System.out.println();
		
		/*instantiates three Point objects*/
		Point point1 = new Point(n1,n2);
		Point point2 = new Point(n3,n4);
		Point point3 = new Point(n5,n6);
		
		System.out.println("TRIANGLE");
		Triangle tri = new Triangle(point1,point2,point3);//instantiates a Triangle object
		point1.display();//prints the coordinate
		point2.display();
		point3.display();
		System.out.println("The three sides of the triangle are " + tri.side1() + ", " 
				+ tri.side2() + ", and " + tri.side3() + ".");
		System.out.println("The area of the triangle is " + tri.area() + ".");
		System.out.println("The perimeter of the triangle is " + tri.perimeter() + ".");
		
		System.out.println();
		
		System.out.println("RECTANGLE");
		Rectangle rec = new Rectangle(point2, point3);//instantiates a Rectangle object
		System.out.println("The lower left and upper right vertices of the rectangle are: ");
		point2.display();
		point3.display();
		System.out.println("The area of the rectangle is " + rec.area() + ".");
		System.out.println("The perimeter of the rectangle is " + rec.perimeter() + ".");
		System.exit(0);
		
	}
}
