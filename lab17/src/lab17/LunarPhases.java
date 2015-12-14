package lab17;

/**
 * @author Tien Thuy Ho
 * @version 1.2, 25 March 2014
 * This program displays different lunar phases.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LunarPhases extends JFrame implements ActionListener {
	// Constants and instance variables
	private final static int NUM_IMAGES = 8;
	private final static int START_INDEX = 3;
	private final static String IMAGES_DIR = "images";

	private ImageIcon[] images = new ImageIcon[NUM_IMAGES];
	private JPanel mainPanel, selectPanel, displayPanel;

	private JComboBox phaseChoices = null;
	private JLabel phaseIconLabel = null;

	/**
	 * Constructor that sets up the entire application and displays the GUI
	 */
	public LunarPhases() {
		super();

		initialize();// Setup the GUI

		setTitle("Lunar Phases");
		setContentPane(mainPanel);// Define the main container
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		pack();// Display the GUI
		setVisible(true);
	}

	/**
	 * Initializes and organizes the various GUI components   
	 */
	private void initialize() {

		// Create the phase selection and display panels.
		selectPanel = new JPanel();
		displayPanel = new JPanel();

		addWidgets();// Add various widgets to the sub panels.

		// Create the main panel to contain the two sub panels.
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,1,5,5));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));

		// Add the select and display panels to the main panel.
		mainPanel.add(selectPanel);
		mainPanel.add(displayPanel);
	}

	/**
	 * Creates and adds the widgets to select and display the phases of the moon
	 */
	private void addWidgets() {

		// Get the images and put them into an array of ImageIcon.
		for (int i = 0; i < 8; i++)
		{
			String imageName = IMAGES_DIR + "/image" + i + ".jpg";
			ImageIcon icon = new ImageIcon(imageName);
			images[i] = icon;
		}

		// Create label for displaying moon phase images and put a border around it.
		phaseIconLabel = new JLabel();
		phaseIconLabel.setHorizontalAlignment(JLabel.CENTER);
		phaseIconLabel.setVerticalAlignment(JLabel.CENTER);

		phaseIconLabel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),
				BorderFactory.createEmptyBorder(5,5,5,5)));

		phaseIconLabel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0,0,10,0),
				phaseIconLabel.getBorder()));

		// Display the first image.
		phaseIconLabel.setIcon(images[START_INDEX]);

		// Create combo box with lunar phase choices.
		String[] phases = {"New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous",
				"Third Quarter", "Waning Crescent"};
		phaseChoices = new JComboBox(phases);
		phaseChoices.setSelectedIndex(START_INDEX);

		// Listen to events from combo box.
		phaseChoices.addActionListener(this);

		// Add moon phases combo box to select panel and image label to displayPanel.
		selectPanel.add(phaseChoices);
		displayPanel.add(phaseIconLabel);

		// Add border around the select panel.
		selectPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Select Phase"), 
				BorderFactory.createEmptyBorder(5,5,5,5)));

		// Add border around the display panel.
		displayPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Display Phase"), 
				BorderFactory.createEmptyBorder(5,5,5,5)));
	}

	/**
	 * Implements the listener interface
	 */
	public void actionPerformed(ActionEvent event) {
		// Update the icon to display the new phase each time the combo box fires an event.
		if (event.getActionCommand().equals("New"))
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
		else if (event.getActionCommand().equals("Waxing Crescent"))
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
		else if (event.getActionCommand().equals("First Quarter"))
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
		else if (event.getActionCommand().equals("Waxing Gibbous"))
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
		else if (event.getActionCommand().equals("Full"))
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
		else if (event.getActionCommand().equals("Waning Gibbous"))
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
		else if (event.getActionCommand().equals("Third Quarter"))
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
		else 
			phaseIconLabel.setIcon(images[phaseChoices.getSelectedIndex()]);
	}

	/**
	 * Starts the application
	 */
	public static void main(String[] args) {
		// create a new instance of LunarPhases
		LunarPhases phases = new LunarPhases();
	}
}