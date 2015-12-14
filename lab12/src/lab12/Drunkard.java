package lab12;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 27 February 2014
 * This program creates the class Drunkard to simulates a drunkard's walk.
 */

public class Drunkard {
		private String name;//private instance variables
		private int x, y;
		
		/**
		 * Precondition: newName is a string value.
		 * Sets the name of the drunkard to a given string.
		 * Sets the initial location of the drunkard to (0,0).
		 */
		public Drunkard(String newName)//constructor
		{
			this.name = newName;
			x = 0;
			y = 0;
		}
		
		/**
		 * Returns the value of x.
		 */
		public int getX()//accessor
		{
			return x;
		}
		
		/**
		 * Returns the value of y.
		 */
		public int getY()//accessor
		{
			return y;
		}
		
		/**
		 * Precondition: x is an integer.
		 * Sets the value of x to a given integer.
		 */
		public void setX(int x)//mutator
		{
			this.x = x;
		}
		
		/**
		 * Precondition: y is an integer.
		 * Sets the value of y to a given integer.
		 */
		public void setY(int y)
		{
			this.y = y;
		}
		
		/**
		 * Generates the movements for the drunkard in the x and y directions.
		 */
		public void move()
		{
			int t = (int)(Math.random()*4);
			if (t==0)
				x++;
			else if (t==1)
				x--;
			else if (t==2)
				y++;
			else if (t==3)
				y--;
		}
		
		/**
		 * Prints the location of the drunkard.
		 */
		public void writeInput()
		{
			System.out.println("My location is (" + x + "," + y + ").");
		}
}


