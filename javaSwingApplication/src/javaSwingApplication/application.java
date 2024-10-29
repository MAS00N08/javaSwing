package javaSwingApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class application {
	public static void main(String[] args) {
		//creating the JFrame
		JFrame frame = new JFrame("Java Swing App");
		frame.setLayout(new BorderLayout(0, 0));
		frame.setSize(800, 600);
		frame.setLocation(400, 150);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creating top, bottom, and middle JPanels
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout());
		topPanel.setPreferredSize(new Dimension(50, 50));
		topPanel.setBackground(Color.BLACK);
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout());
		bottomPanel.setPreferredSize(new Dimension(50, 50));
		bottomPanel.setBackground(Color.BLACK);
		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		middlePanel.setBackground(Color.WHITE);
		
		//creating label for top row that helps for updating
		/*
		JLabel updateLabel = new JLabel("Starting Screen");
		updateLabel.setForeground(Color.WHITE);
		topPanel.add(updateLabel);
		*/
		
		//creating components for starting screen
		JButton firstButton = new JButton("Push Me!");
		JLabel firstLabel = new JLabel("Welcome to this application that was created using Java!"
				+ " Type 'Java' in the textbox and press the button at the bottom to proceed!");
		JTextField firstField = new JTextField(10);
		firstField.setToolTipText("Type what you were told to here!");
		
		//adding previously created elements to the panel
		middlePanel.add(firstLabel);
		middlePanel.add(firstField);
		bottomPanel.add(firstButton);
		
		//creating components for second screen
		JLabel secondLabel = new JLabel("Pretty cool, huh? Instead of text, there could also be an image here! Wanna see?");
		JButton secondBack = new JButton("<- Go back");
		JButton secondButton = new JButton("Show me!");
		JButton secondButtonTwo = new JButton("Next ->");
		ImageIcon duke = new ImageIcon("images/duke.png");
		JLabel secondLabelTwo = new JLabel("Look, it's Duke!");
		secondLabelTwo.setIcon(duke);
		secondLabelTwo.setVerticalTextPosition(SwingConstants.BOTTOM);
		secondLabelTwo.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//creating components for third screen
		JLabel thirdLabel = new JLabel("<html>This app was created using Java Swing, a toolkit that includes components used for making GUIs in Java.<br>"
				+ "You start out by creating a JFrame object, which is the window that will be used for the GUI!<br>"
				+ "Click the button to see what that looks like in code!");
		ImageIcon jframeExample = new ImageIcon("images/jframe.png");
		JButton thirdBack = new JButton("<- Go back");
		JButton thirdButton = new JButton("Show me!");
		thirdLabel.setVerticalTextPosition(SwingConstants.TOP);
		thirdLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		JButton thirdButtonTwo = new JButton("Explain!");
		JLabel thirdExplain = new JLabel("<html>The object is created, and given a name that is displayed at the top.<br>"
				+ "Its settings are then set, including its size, its location, and whether or not it's resizable.<br>"
				+ "There is also one other piece of code we need for the frame, that is added at the end of your code!");
		JButton thirdButtonThree = new JButton("What is it?");
		ImageIcon setVisible = new ImageIcon("images/setVisible.png");
		JButton thirdButtonFour = new JButton("Next ->");
		thirdExplain.setVerticalTextPosition(SwingConstants.TOP); 
		thirdExplain.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//creating components for fourth screen
		JLabel fourthLabel = new JLabel("<html>After creating the JFrame, we have to create JPanels, which are placed on the JFrame.<br>"
				+ "A JFrame hold things like the buttons, images, text fields, and words that you've already seen.<br>"
				+ "This application is currently using three panels, and they are shown below.");
		ImageIcon jpanelsExample = new ImageIcon("images/jpanels.png");
		fourthLabel.setIcon(jpanelsExample);
		fourthLabel.setVerticalTextPosition(SwingConstants.TOP);
		fourthLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		JButton fourthBack = new JButton("<- Back");
		JButton fourthButton = new JButton("Tell me more!");
		JLabel fourthExplain = new JLabel("<html>The panels are created and the settings are set.<br>"
				+ "Next, you'll see more about the colors of these panels.");
		JButton fourthButtonTwo = new JButton("Next ->");
		
		//creating components for fifth screen
		JLabel fifthLabel = new JLabel("Use the buttons at the top to pick a color, and then you can confirm it.");
		JButton red = new JButton("Red");
		JButton blue = new JButton("Blue");
		JButton yellow = new JButton("Yellow");
		JButton green = new JButton("Green");
		JButton orange = new JButton("Orange");
		JButton white = new JButton("White");
		JButton fifthButton = new JButton("Confirm");
		JButton fifthBack = new JButton("<- Back");
		JButton fifthButtonTwo = new JButton("Next ->");
		JLabel fifthExplain = new JLabel("Buttons work using action listeners, which execute methods when the button is pressed");
		ImageIcon actionListenerExample = new ImageIcon("images/actionlistener.png");
		fifthExplain.setIcon(actionListenerExample);
		fifthExplain.setVerticalTextPosition(SwingConstants.TOP);
		fifthExplain.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//creating components for sixth screen
		JLabel sixthLabel = new JLabel("Buttons can do just about anything. Can you guess what the last one here does?");
		JButton sixthBack = new JButton("<- Back");
		JButton sixthButton = new JButton("The end!");
		
		//action listeners
		//first button
		firstButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(firstField.getText().equals("Java")) {
					middlePanel.remove(firstLabel);
					middlePanel.remove(firstField);
					
					bottomPanel.remove(firstButton);
					middlePanel.add(secondLabel);
					bottomPanel.add(secondBack);
					bottomPanel.add(secondButton);
					middlePanel.repaint();
					middlePanel.revalidate();
					bottomPanel.repaint();
				}
				
			}
			
		});
		//second go back button
		secondBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(secondLabel);
				bottomPanel.remove(secondBack);
				bottomPanel.remove(secondButton);
				middlePanel.add(firstLabel);
				middlePanel.add(firstField);
				bottomPanel.add(firstButton);
				middlePanel.remove(secondLabelTwo);
				bottomPanel.remove(secondButtonTwo);
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
			}
		});
		//second button action
		secondButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(secondLabel);
				bottomPanel.remove(secondButton);
				bottomPanel.add(secondButtonTwo);
				middlePanel.add(secondLabelTwo);
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				
			}
			
		});
		//second go next button
		secondButtonTwo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(secondLabelTwo);
				bottomPanel.remove(secondButtonTwo);
				bottomPanel.remove(secondBack);
				
				middlePanel.add(thirdLabel);
				bottomPanel.add(thirdBack);
				bottomPanel.add(thirdButton);
				thirdLabel.setIcon(null);
				thirdExplain.setIcon(null);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
			}
			
		});
		//third back button
		thirdBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(thirdLabel);
				bottomPanel.remove(thirdBack);
				bottomPanel.remove(thirdButton);
				bottomPanel.remove(thirdButtonTwo);
				middlePanel.remove(thirdExplain);
				bottomPanel.remove(thirdButtonTwo);
				bottomPanel.remove(thirdButtonThree);
				bottomPanel.remove(thirdButtonFour);
				
				middlePanel.add(secondLabel);
				bottomPanel.add(secondBack);
				bottomPanel.add(secondButton);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				
			}
			
		});
		//third image show button
		thirdButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thirdLabel.setIcon(jframeExample);
				bottomPanel.remove(thirdButton);
				bottomPanel.add(thirdButtonTwo);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				
			}
			
		});
		//explain three do thing
		thirdButtonTwo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.add(thirdExplain);
				bottomPanel.remove(thirdButtonTwo);
				bottomPanel.add(thirdButtonThree);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
			}
			
		});
		//third image show button two
		thirdButtonThree.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thirdExplain.setIcon(setVisible);
				bottomPanel.remove(thirdButtonThree);
				bottomPanel.add(thirdButtonFour);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
			}
			
		});
		//third next button
		thirdButtonFour.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(thirdLabel);
				middlePanel.remove(thirdExplain);
				bottomPanel.remove(thirdBack);
				bottomPanel.remove(thirdButtonFour);
				
				bottomPanel.add(fourthBack);
				bottomPanel.add(fourthButton);
				middlePanel.add(fourthLabel);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				
			}
			
		});
		//fourth back button
		fourthBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bottomPanel.remove(fourthBack);
				bottomPanel.remove(fourthButton);
				middlePanel.remove(fourthLabel);
				bottomPanel.remove(fourthExplain);
				bottomPanel.remove(fourthButtonTwo);
				
				bottomPanel.add(thirdBack);
				bottomPanel.add(thirdButton);
				middlePanel.add(thirdLabel);
				thirdLabel.setIcon(null);
				thirdExplain.setIcon(null);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				
			}
			
		});
		//fourth button show
		fourthButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.add(fourthExplain);
				bottomPanel.add(fourthButtonTwo);
				
				bottomPanel.remove(fourthButton);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				
			}
			
		});
		//fourth next button
		fourthButtonTwo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(fourthLabel);
				middlePanel.remove(fourthExplain);
				bottomPanel.remove(fourthBack);
				bottomPanel.remove(fourthButtonTwo);
				
				topPanel.add(red);
				topPanel.add(blue);
				topPanel.add(yellow);
				topPanel.add(green);
				topPanel.add(orange);
				topPanel.add(white);
				
				middlePanel.add(fifthLabel);
				bottomPanel.add(fifthBack);
				bottomPanel.add(fifthButton);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				topPanel.repaint();
			}
			
		});
		//all the colors
		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.setBackground(Color.RED);
				
			}
			
		});
		
		blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.setBackground(Color.BLUE);
				
			}
			
		});
		
		yellow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.setBackground(Color.YELLOW);
				
			}
			
		});
		
		green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.setBackground(Color.GREEN);
				
			}
			
		});
		
		orange.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.setBackground(Color.ORANGE);
				
			}
			
		});
		
		white.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.setBackground(Color.WHITE);
				
			}
			
		});
		//fifth back button
		fifthBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				topPanel.remove(red);
				topPanel.remove(blue);
				topPanel.remove(yellow);
				topPanel.remove(green);
				topPanel.remove(orange);
				topPanel.remove(white);
				
				bottomPanel.remove(fifthBack);
				bottomPanel.remove(fifthButton);
				middlePanel.remove(fifthLabel);
				bottomPanel.remove(fifthButtonTwo);
				middlePanel.remove(fifthExplain);
				
				bottomPanel.add(fourthBack);
				bottomPanel.add(fourthButton);
				middlePanel.add(fourthLabel);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				topPanel.repaint();
			}
			
		});
		//color confirm button
		fifthButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				topPanel.remove(red);
				topPanel.remove(blue);
				topPanel.remove(yellow);
				topPanel.remove(green);
				topPanel.remove(orange);
				topPanel.remove(white);
				
				bottomPanel.remove(fifthButton);
				middlePanel.remove(fifthLabel);
				
				middlePanel.add(fifthExplain);
				bottomPanel.add(fifthButtonTwo);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				topPanel.repaint();
			}
		});
		//fifth next button
		fifthButtonTwo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(fifthExplain);
				bottomPanel.remove(fifthBack);
				bottomPanel.remove(fifthButtonTwo);
				bottomPanel.remove(fifthButton);
				middlePanel.remove(fifthLabel);
				
				
				middlePanel.add(sixthLabel);
				bottomPanel.add(sixthBack);
				bottomPanel.add(sixthButton);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				topPanel.repaint();
				
			}
		});
		//sixth back button
		sixthBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				middlePanel.remove(sixthLabel);
				bottomPanel.remove(sixthBack);
				bottomPanel.remove(sixthButton);
				
				middlePanel.add(fifthLabel);
				bottomPanel.add(fifthBack);
				bottomPanel.add(fifthButton);
				
				topPanel.add(red);
				topPanel.add(blue);
				topPanel.add(yellow);
				topPanel.add(green);
				topPanel.add(orange);
				topPanel.add(white);
				
				middlePanel.repaint();
				middlePanel.revalidate();
				bottomPanel.repaint();
				topPanel.repaint();
			}
		});
		//ending button
		sixthButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
			
		});
		
		//adding panels to frame
		frame.add(topPanel, BorderLayout.NORTH);	
		frame.add(bottomPanel, BorderLayout.SOUTH);
		frame.add(middlePanel, BorderLayout.CENTER);
		
		
		
		
		
		//last thing no matter what
		frame.setVisible(true);
	}
}
