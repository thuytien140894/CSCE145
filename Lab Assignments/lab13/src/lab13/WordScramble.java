package lab13;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 04 March 2014
 * This program creates a class WordScramble to scramble words.
 */

public class WordScramble 
{
	/**
	 * Precondition: word is a string value.
	 * Scrambles any two characters other than the first and the last one to create a new scrambled word.
	 */
	public static String scramble(String word)
	{
		if (word.length() == 1||word.length() == 2||word.length() == 3)
			return word;//words with 1, 2, or 3 characters remain the same.
		else
		{
			int n = (int)(Math.random()*(word.length()-2)+1);//generate a random index between the first and the last character of a word
			char c = word.charAt(n);
			
			boolean again = true;
			while (again)
			{
				int m = (int)(Math.random()*(word.length()-2)+1);
				if (n != m)
				{
					word = word.substring(0,n) + word.charAt(m) + word.substring(n+1);
					word = word.substring(0,m) + c + word.substring(m+1);
					again = false;//ends the loops if the two random-generated indices are different.
				}
			}
			return word;//returns the new scrambled word
		}
	}
}