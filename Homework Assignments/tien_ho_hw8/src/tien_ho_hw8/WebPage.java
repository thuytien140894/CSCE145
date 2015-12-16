package tien_ho_hw8;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 09 April 2014
 * This program parses Web pages for price information.
 */

import java.io.*;
import java.net.*;

public class WebPage 
{
	public static void main(String[] args) 
	{
		String fileName = "PriceComparison.txt";
		PrintWriter outputStream = null;
		
		//initializes variables
		String price1 = null;
		String price2 = null;
		
		try
		{
			outputStream = new PrintWriter(fileName);//opens a text file to write
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName);
		}
		
		System.out.println("Beginning Web Page Parsing");
		System.out.println();
		
		//declares variables
		URL page1, page2;
		InputStream stream1, stream2;
		BufferedReader br1, br2;
		
		//processes the Web page of Barnes & Nobles and parses the CD price information
		try {
			System.out.println("Barnes & Nobles");
			System.out.println();
			
			page1 = new URL("http://www.barnesandnoble.com/"
					+ "w/ramones-the-ramones/5700009?EAN=81227430627&cds2Pid=17348");//creates a new URL object
			stream1 = page1.openStream();//opens a connection to the URL declared for page1
			InputStreamReader n1 = new InputStreamReader(stream1); 
			br1 = new BufferedReader(n1);//creates a buffering character-input stream 
			
			String urlLine1;
			String p1 = null;
					
			System.out.println("Buffered reader 1 = " + br1);
			System.out.println("Buffered reader 1 ready = " + br1.ready());//reads the input stream
			
			//finds the line that has the price information
			boolean notPrice = true;
			while (((urlLine1 = br1.readLine()) != null) && notPrice)
			{
				if (urlLine1.contains("class=\"price\""))
				{
					p1 = urlLine1;
					System.out.println(p1);
					notPrice = false;
				}
			}
			
			//extracts the price
			String[] w = p1.split(" ");
			for (int i = 0; i < w.length; i++)
			{
				if (w[i].contains("$"))
				{
					int position = w[i].indexOf('$');
					price1 = w[i].substring(position, position+5);
				}
			}
	
			System.out.println("The parsed price for the CD is " + price1);
			System.out.println();
			
			br1.close();
		}
		
		catch (MalformedURLException e1) {
			e1.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		//processes the Web page of Walmart and parses the CD price information
		try
		{	
			System.out.println("Walmart");
			System.out.println();
			
			page2 = new URL("http://www.walmart.com/ip/1805378");//creates a new URL object
			stream2 = page2.openStream();//connects to the URL declared for page2
			InputStreamReader n2 = new InputStreamReader(stream2);
			br2 = new BufferedReader(n2);
			
			String urlLine2;
			String p2 = null;
			
			System.out.println("Buffered reader 2 = " + br2);
			System.out.println("Buffered reader 2 ready = " + br2.ready());//reads the input stream
			
			//finds the line that has the price information
			boolean notPrice = true;
			while(((urlLine2 = br2.readLine()) != null) && notPrice)
			{
				if(urlLine2.contains("\'item_price\'"))
				{
					p2 = urlLine2;
					System.out.println(p2);
					notPrice = false;
				}
			}
			
			//extracts the price
			String[] x = p2.split(" ");
			for (int i = 0; i < x.length; i++)
			{
				if (x[i].contains("$"))
				{
					int position = x[i].indexOf('$');
					price2 = x[i].substring(position, position+5);
				}
			}
	
			System.out.println("The parsed price for the CD is " + price2);
			
			br2.close();	
		} 
		
		catch (MalformedURLException e1) {
			e1.printStackTrace();  
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		//writes the parsed prices to the text file
		outputStream.println("The price for a CD by the Ramones:");
		outputStream.println();
		outputStream.println("     Barnes & Nobles: " + price1);
		outputStream.println();
		outputStream.println("     Walmart: " + price2);
		outputStream.println();
		outputStream.println("The price for the CD is more expensive at Walmart than at Barnes & Nobles.");
		
		outputStream.close();//closes the stream
	}
}
