package lab19;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 03 April 2014
 * This program prints every possible seven-letter word combinations corresponding to a phone number.
 */

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneNumber 
{
	public static void main(String[] args)
	{
		String file = "phone.txt";//names the file
		PrintWriter word = null;//declares a stream variable
		
		//tries the method that might encounter an exception
		try
		{
			word = new PrintWriter(file);
		}
		
		//handles the exception
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file " + file);
		}

		System.out.println("Please enter a seven-digit phone number:");
		Scanner keyboard = new Scanner(System.in);
		String number = keyboard.nextLine();

		//creates an array of three possible elements for each digit
		String[] n1 = new String[3];
		String[] n2 = new String[3];
		String[] n3 = new String[3];
		String[] n4 = new String[3];
		String[] n5 = new String[3];
		String[] n6 = new String[3];
		String[] n7 = new String[3];

		//creates an array of all the digits in the input phone number
		char[] n = new char[7];
		int j = 0;
		for (int i = 0; i < 7; i++)
		{
			n[j] = number.charAt(i);
			j++;
		}

		//declares an array of letters or spaces corresponding to each digit
		String[] one = {" "," "," "};
		String[] two = {"A","B","C"};
		String[] three = {"D","E","F"};
		String[] four = {"G","H","I"};
		String[] five = {"J","K","L"};
		String[] six = {"M","N","O"};
		String[] seven = {"P","Q","R"};
		String[] eight = {"S","T","U"};
		String[] nine = {"W","X","Y"};
		String[] zero = {" "," "," "};

		//declares 10 possible outcomes for each digit
		switch (n[0]){
		case '1':
			for (int i = 0; i < 3; i++)
				n1[i] = one[i];
			break;
		case '2':
			for (int i = 0; i < 3; i++)
				n1[i] = two[i];
			break;
		case '3':
			for (int i = 0; i < 3; i++)
				n1[i] = three[i];
			break;
		case '4':
			for (int i = 0; i < 3; i++)
				n1[i] = four[i];
			break;
		case '5':
			for (int i = 0; i < 3; i++)
				n1[i] = five[i];
			break;
		case '6':
			for (int i = 0; i < 3; i++)
				n1[i] = six[i];
			break;
		case '7':
			for (int i = 0; i < 3; i++)
				n1[i] = seven[i];
			break;
		case '8':
			for (int i = 0; i < 3; i++)
				n1[i] = eight[i];
			break;
		case '9':
			for (int i = 0; i < 3; i++)
				n1[i] = nine[i];
			break;
		case '0':
			for (int i = 0; i < 3; i++)
				n1[i] = zero[i];
			break;
		}

		switch (n[1]){
		case '1':
			for (int i = 0; i < 3; i++)
				n2[i] = one[i];
			break;
		case '2':
			for (int i = 0; i < 3; i++)
				n2[i] = two[i];
			break;
		case '3':
			for (int i = 0; i < 3; i++)
				n2[i] = three[i];
			break;
		case '4':
			for (int i = 0; i < 3; i++)
				n2[i] = four[i];
			break;
		case '5':
			for (int i = 0; i < 3; i++)
				n2[i] = five[i];
			break;
		case '6':
			for (int i = 0; i < 3; i++)
				n2[i] = six[i];
			break;
		case '7':
			for (int i = 0; i < 3; i++)
				n2[i] = seven[i];
			break;
		case '8':
			for (int i = 0; i < 3; i++)
				n2[i] = eight[i];
			break;
		case '9':
			for (int i = 0; i < 3; i++)
				n2[i] = nine[i];
			break;
		case '0':
			for (int i = 0; i < 3; i++)
				n2[i] = zero[i];
			break;
		}

		switch (n[2]){
		case '1':
			for (int i = 0; i < 3; i++)
				n3[i] = one[i];
			break;
		case '2':
			for (int i = 0; i < 3; i++)
				n3[i] = two[i];
			break;
		case '3':
			for (int i = 0; i < 3; i++)
				n3[i] = three[i];
			break;
		case '4':
			for (int i = 0; i < 3; i++)
				n3[i] = four[i];
			break;
		case '5':
			for (int i = 0; i < 3; i++)
				n3[i] = five[i];
			break;
		case '6':
			for (int i = 0; i < 3; i++)
				n3[i] = six[i];
			break;
		case '7':
			for (int i = 0; i < 3; i++)
				n3[i] = seven[i];
			break;
		case '8':
			for (int i = 0; i < 3; i++)
				n3[i] = eight[i];
			break;
		case '9':
			for (int i = 0; i < 3; i++)
				n3[i] = nine[i];
			break;
		case '0':
			for (int i = 0; i < 3; i++)
				n3[i] = zero[i];
			break;
		}

		switch (n[3]){
		case '1':
			for (int i = 0; i < 3; i++)
				n4[i] = one[i];
			break;
		case '2':
			for (int i = 0; i < 3; i++)
				n4[i] = two[i];
			break;
		case '3':
			for (int i = 0; i < 3; i++)
				n4[i] = three[i];
			break;
		case '4':
			for (int i = 0; i < 3; i++)
				n4[i] = four[i];
			break;
		case '5':
			for (int i = 0; i < 3; i++)
				n4[i] = five[i];
			break;
		case '6':
			for (int i = 0; i < 3; i++)
				n4[i] = six[i];
			break;
		case '7':
			for (int i = 0; i < 3; i++)
				n4[i] = seven[i];
			break;
		case '8':
			for (int i = 0; i < 3; i++)
				n4[i] = eight[i];
			break;
		case '9':
			for (int i = 0; i < 3; i++)
				n4[i] = nine[i];
			break;
		case '0':
			for (int i = 0; i < 3; i++)
				n4[i] = zero[i];
			break;
		}

		switch (n[4]){
		case '1':
			for (int i = 0; i < 3; i++)
				n5[i] = one[i];
			break;
		case '2':
			for (int i = 0; i < 3; i++)
				n5[i] = two[i];
			break;
		case '3':
			for (int i = 0; i < 3; i++)
				n5[i] = three[i];
			break;
		case '4':
			for (int i = 0; i < 3; i++)
				n5[i] = four[i];
			break;
		case '5':
			for (int i = 0; i < 3; i++)
				n5[i] = five[i];
			break;
		case '6':
			for (int i = 0; i < 3; i++)
				n5[i] = six[i];
			break;
		case '7':
			for (int i = 0; i < 3; i++)
				n5[i] = seven[i];
			break;
		case '8':
			for (int i = 0; i < 3; i++)
				n5[i] = eight[i];
			break;
		case '9':
			for (int i = 0; i < 3; i++)
				n5[i] = nine[i];
			break;
		case '0':
			for (int i = 0; i < 3; i++)
				n5[i] = zero[i];
			break;
		}

		switch (n[5]){
		case '1':
			for (int i = 0; i < 3; i++)
				n6[i] = one[i];
			break;
		case '2':
			for (int i = 0; i < 3; i++)
				n6[i] = two[i];
			break;
		case '3':
			for (int i = 0; i < 3; i++)
				n6[i] = three[i];
			break;
		case '4':
			for (int i = 0; i < 3; i++)
				n6[i] = four[i];
			break;
		case '5':
			for (int i = 0; i < 3; i++)
				n6[i] = five[i];
			break;
		case '6':
			for (int i = 0; i < 3; i++)
				n6[i] = six[i];
			break;
		case '7':
			for (int i = 0; i < 3; i++)
				n6[i] = seven[i];
			break;
		case '8':
			for (int i = 0; i < 3; i++)
				n6[i] = eight[i];
			break;
		case '9':
			for (int i = 0; i < 3; i++)
				n6[i] = nine[i];
			break;
		case '0':
			for (int i = 0; i < 3; i++)
				n6[i] = zero[i];
			break;
		}

		switch (n[6]){
		case '1':
			for (int i = 0; i < 3; i++)
				n7[i] = one[i];
			break;
		case '2':
			for (int i = 0; i < 3; i++)
				n7[i] = two[i];
			break;
		case '3':
			for (int i = 0; i < 3; i++)
				n7[i] = three[i];
			break;
		case '4':
			for (int i = 0; i < 3; i++)
				n7[i] = four[i];
			break;
		case '5':
			for (int i = 0; i < 3; i++)
				n7[i] = five[i];
			break;
		case '6':
			for (int i = 0; i < 3; i++)
				n7[i] = six[i];
			break;
		case '7':
			for (int i = 0; i < 3; i++)
				n7[i] = seven[i];
			break;
		case '8':
			for (int i = 0; i < 3; i++)
				n7[i] = eight[i];
			break;
		case '9':
			for (int i = 0; i < 3; i++)
				n7[i] = nine[i];
			break;
		case '0':
			for (int i = 0; i < 3; i++)
				n7[i] = zero[i];
			break;
		}

		System.out.println();
		System.out.println("All the possible seven-letter word combinations "
				+ "corresponding to the phone number are:");

		String keyword = null;
		int count = 1;
		
		//uses 7 loops, each iterates 3 times, to create 2187 possible seven-letter words 
		//that correspond to an input phone number
		for (int a = 0; a < 3; a++)
			for (int b = 0; b < 3; b++)
				for (int c = 0; c < 3; c++)
					for (int d = 0; d < 3; d++)
						for (int e = 0; e < 3; e++)
							for (int f = 0; f < 3; f++)
								for (int g = 0; g < 3; g++)
								{
									keyword = n1[a] + n2[b] + n3[c] + n4[d] + 
											n5[e] + n6[f] + n7[g];
									System.out.println(count + " " + keyword);
									
									word.println(count + " " + keyword);//writes to the file phone.txt
									count ++;//counts the number of seven-letter words
								}
		word.close();//closes the stream
		System.out.println();
		System.out.println("These words were written to " + file);
	}
}
