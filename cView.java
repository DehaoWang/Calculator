/**
 * 	Class cView: build the GUI and add action listeners  
 * 	Created by Dehao Wang, 11.03.14 
 */

import java.awt.*;
import javax.swing.*;


public class cView extends JFrame
{
	private JPanel northPanel, centerPanel, southPanel;
	
	private JLabel calLabel;
	
	public JTextField calTextField;
	
	public JButton clearButton, backButton, bracketButton, signButton;      //sign button switches the sign of number
	public JButton sevenButton, eightButton, nineButton, plusButton;
	public JButton fourButton, fiveButton, sixButton, minusButton;
	public JButton oneButton, twoButton, threeButton, multiplyButton;
	public JButton zeroButton, dotButton, equalButton, divideButton;
	
	private Font myFont = new Font("Arial", Font.PLAIN, 30);
	
	private cModel modelObject;
	private cController controllerObject;
	
	public cView(cModel m, cController c)
	{
		modelObject = m;
		controllerObject = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		setLocation(0, 0);
		setTitle("Calculator.V1");
		layoutcomponents();
	}
	
	public void layoutcomponents()
	{
		northPanel = new JPanel();
		calLabel = new JLabel("Calculator");
		calLabel.setFont(myFont);
		northPanel.add(calLabel);
		//this.add(northPanel, BorderLayout.NORTH);
		
		//centerPanel = new JPanel();
		calTextField = new JTextField(20);
		calTextField.setFont(myFont);
		calTextField.setEditable(false);
		northPanel.add(calTextField);
		this.add(northPanel, BorderLayout.NORTH);
		
		southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(5, 4));
		
		clearButton = new JButton("Clear");
		clearButton.setFont(myFont);
		clearButton.addActionListener(controllerObject);
		southPanel.add(clearButton);
		
		backButton = new JButton("B.S");
		backButton.setFont(myFont);
		backButton.addActionListener(controllerObject);
		southPanel.add(backButton);
		
		bracketButton = new JButton("()");
		bracketButton.setFont(myFont);
		bracketButton.addActionListener(controllerObject);
		southPanel.add(bracketButton);
		
		signButton = new JButton("+/-");
		signButton.setFont(myFont);
		signButton.addActionListener(controllerObject);
		southPanel.add(signButton);
		
		sevenButton = new JButton("7");
		sevenButton.setFont(myFont);
		sevenButton.addActionListener(controllerObject);
		southPanel.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setFont(myFont);
		eightButton.addActionListener(controllerObject);
		southPanel.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setFont(myFont);
		nineButton.addActionListener(controllerObject);
		southPanel.add(nineButton);
		
		plusButton = new JButton("+");
		plusButton.setFont(myFont);
		plusButton.addActionListener(controllerObject);
		southPanel.add(plusButton);
		
		fourButton = new JButton("4");
		fourButton.setFont(myFont);
		fourButton.addActionListener(controllerObject);
		southPanel.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setFont(myFont);
		fiveButton.addActionListener(controllerObject);
		southPanel.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setFont(myFont);
		sixButton.addActionListener(controllerObject);
		southPanel.add(sixButton);
		
		minusButton = new JButton("-");
		minusButton.setFont(myFont);
		minusButton.addActionListener(controllerObject);
		southPanel.add(minusButton);
		
		oneButton = new JButton("1");
		oneButton.setFont(myFont);
		oneButton.addActionListener(controllerObject);
		southPanel.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setFont(myFont);
		twoButton.addActionListener(controllerObject);
		southPanel.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setFont(myFont);
		threeButton.addActionListener(controllerObject);
		southPanel.add(threeButton);
		
		multiplyButton = new JButton("*");
		multiplyButton.setFont(myFont);
		multiplyButton.addActionListener(controllerObject);
		southPanel.add(multiplyButton);
		
		zeroButton = new JButton("0");
		zeroButton.setFont(myFont);
		zeroButton.addActionListener(controllerObject);
		southPanel.add(zeroButton);
		
		dotButton = new JButton(".");
		dotButton.setFont(myFont);
		dotButton.addActionListener(controllerObject);
		southPanel.add(dotButton);
		
		equalButton = new JButton("=");
		equalButton.setFont(myFont);
		equalButton.addActionListener(controllerObject);
		southPanel.add(equalButton);
		
		divideButton = new JButton("/");
		divideButton.setFont(myFont);
		divideButton.addActionListener(controllerObject);
		southPanel.add(divideButton);
		
		this.add(southPanel, BorderLayout.CENTER);
	}
}
