package lab16;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 20 March 2014
 * This program designs and displays a graph based on the specifications defined in an array of points. 
 */

import java.awt.*;
import javax.swing.*;

public class GraphDisplay extends JFrame {
	private Point[] node = new Point[7];//creates an array of 7 points called node
	{
		node[0] = new Point(360,40);//specifies the x and y coordinates for each point
		node[1] = new Point(25,25);
		node[2] = new Point(100,150);
		node[3] = new Point(250,100);
		node[4] = new Point(370,370);
		node[5] = new Point(50,350);
		node[6] = new Point(210,210);
	}

	public GraphDisplay()
	{
		super("Graph Display");//titles the graph
		setSize(400,400);//creates a window of size 400 x 400 pixels
		setDefaultCloseOperation(EXIT_ON_CLOSE);//exits the program when the close button is invoked
	}

	public void paint(Graphics canvas)
	{
		super.paint(canvas);
		this.setBackground(Color.LIGHT_GRAY);

		canvas.setColor(Color.BLUE);
		canvas.drawLine(node[0].x + 7, node[0].y + 7, node[1].x + 7, node[1].y + 7);//connects the points with blue lines
		canvas.drawLine(node[1].x + 7, node[1].y + 7, node[2].x + 7, node[2].y + 7);
		canvas.drawLine(node[2].x + 7, node[2].y + 7, node[3].x + 7, node[3].y + 7);
		canvas.drawLine(node[3].x + 7, node[3].y + 7, node[4].x + 7, node[4].y + 7);
		canvas.drawLine(node[4].x + 7, node[4].y + 7, node[5].x + 7, node[5].y + 7);
		canvas.drawLine(node[5].x + 7, node[5].y + 7, node[6].x + 7, node[6].y + 7);
		canvas.drawLine(node[5].x + 7, node[5].y + 7, node[3].x + 7, node[3].y + 7);

		canvas.setColor(Color.GREEN);
		for(int index = 0; index < 7; index ++)
		{
			canvas.fillOval(node[index].x, node[index].y, 15, 15);//draws and fills a circle of size (15,15) with green color 
		}

		canvas.setColor(Color.BLACK);
		for(int index = 0; index < 7; index ++)
		{
			canvas.drawString("" + index, node[index].x + 4, node[index].y + 12);//labels the points in accordance with its index
		}
	}

	public static void main(String[] args)
	{
		GraphDisplay g = new GraphDisplay();//creates an object of the GraphDisplay class
		g.setVisible(true);//displays the graphic design
	}
}
