package tien_ho_hw10;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 25 April 2014
 * This program creates methods for conversion between the English alphabet and Morse codes.
 */

public class MorseCode 
{
	//creates and declares an array of 26 letters in the alphabet 
	public static char[] alphabet = new char[27];
	{
		alphabet[0] = 'A';
		alphabet[1] = 'B';
		alphabet[2] = 'C';
		alphabet[3] = 'D';
		alphabet[4] = 'E';
		alphabet[5] = 'F';
		alphabet[6] = 'G';
		alphabet[7] = 'H';
		alphabet[8] = 'I';
		alphabet[9] = 'J';
		alphabet[10] = 'K';
		alphabet[11] = 'L';
		alphabet[12] = 'M';
		alphabet[13] = 'N';
		alphabet[14] = 'O';
		alphabet[15] = 'P';
		alphabet[16] = 'Q';
		alphabet[17] = 'R';
		alphabet[18] = 'S';
		alphabet[19] = 'T';
		alphabet[20] = 'U';
		alphabet[21] = 'V';
		alphabet[22] = 'W';
		alphabet[23] = 'X';
		alphabet[24] = 'Y';
		alphabet[25] = 'Z';
		alphabet[26] = ' ';//space
	}

	//creates and declares a multidimensional array 
	//that stores the Morse code for each of the 26 letters of the alphabet
	public static char[][] morse = new char[27][4];
	{
		for (int i = 0; i < 27; i++) {
			for (int j = 0; j < 4; j++) {
				morse[i][j] = ' ';
			}
		}
		morse[0][0] = '.'; // A
		morse[0][1] = '-';
		morse[1][0] = '-'; // B
		morse[1][1] = '.';
		morse[1][2] = '.';
		morse[1][3] = '.';
		morse[2][0] = '-'; // C
		morse[2][1] = '.';
		morse[2][2] = '-';
		morse[2][3] = '.';
		morse[3][0] = '-'; // D
		morse[3][1] = '.';
		morse[3][2] = '.';
		morse[4][0] = '.'; // E
		morse[5][0] = '.'; // F
		morse[5][1] = '.';
		morse[5][2] = '-';
		morse[5][3] = '.';
		morse[6][0] = '-'; // G
		morse[6][1] = '-';
		morse[6][2] = '.';
		morse[7][0] = '.'; // H
		morse[7][1] = '.';
		morse[7][2] = '.';
		morse[7][3] = '.';
		morse[8][0] = '.'; // I
		morse[8][1] = '.';
		morse[9][0] = '.'; // J
		morse[9][1] = '-';
		morse[9][2] = '-';
		morse[9][3] = '-';
		morse[10][0] = '-'; // K
		morse[10][1] = '.';
		morse[10][2] = '-';
		morse[11][0] = '.'; // L
		morse[11][1] = '-';
		morse[11][2] = '.';
		morse[11][3] = '.';
		morse[12][0] = '-'; // M
		morse[12][1] = '-';
		morse[13][0] = '-'; // N
		morse[13][1] = '.';
		morse[14][0] = '-'; // O
		morse[14][1] = '-';
		morse[14][2] = '-';
		morse[15][0] = '.'; // P
		morse[15][1] = '-';
		morse[15][2] = '-';
		morse[15][3] = '.';
		morse[16][0] = '-'; // Q
		morse[16][1] = '-';
		morse[16][2] = '.';
		morse[16][3] = '-';
		morse[17][0] = '.'; // R
		morse[17][1] = '-';
		morse[17][2] = '.';
		morse[18][0] = '.'; // S
		morse[18][1] = '.';
		morse[18][2] = '.';
		morse[19][0] = '-'; // T
		morse[20][0] = '.'; // U
		morse[20][1] = '.';
		morse[20][2] = '-';
		morse[21][0] = '.'; // V
		morse[21][1] = '.';
		morse[21][2] = '.';
		morse[21][3] = '-';
		morse[22][0] = '.'; // W
		morse[22][1] = '-';
		morse[22][2] = '-';
		morse[23][0] = '-'; // X
		morse[23][1] = '.';
		morse[23][2] = '.';
		morse[23][3] = '-';
		morse[24][0] = '-'; // Y
		morse[24][1] = '.';
		morse[24][2] = '-';
		morse[24][3] = '-';
		morse[25][0] = '-'; // Z
		morse[25][1] = '-';
		morse[25][2] = '.';
		morse[25][3] = '.';
	}

	/**
	 * Precondition: letter is a single capital letter of char type.
	 * Converts an English letter to its corresponding Morse code.
	 */
	public static String toMorseCode(char letter)
	{
		String code = "";
		for (int i = 0; i < alphabet.length; i++)
		{
			if (letter == alphabet[i])
			{
				for (int n = 0; n < 4; n++)
				{
					code = code + morse[i][n];
				}
				break;//ends the loop once the input letter matches with one of the 26 letters of the alphabets
			}
		}
		return code;
	}

	/**
	 * Precondition: code is an array of four Morse code characters (dot, dash, or space).
	 * Returns the English equivalent of four Morse code characters. 
	 */
	public static char fromMorseCode(char[] code)
	{
		char letter = ' ';
		for (int n = 0; n < 26; n++)
		{
			if ((code[0] == morse[n][0])&&(code[1] == morse[n][1])&&(code[2] == morse[n][2])&&(code[3] == morse[n][3]))
			{
				letter = alphabet[n];
				break;
			} 
		}
		return letter;
	}
}
