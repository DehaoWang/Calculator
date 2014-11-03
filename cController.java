/**
 * 	Class cController: listen to the events, conduct the operations accordingly and update the interface  
 * 	Created by Dehao Wang, 11.03.14 
 */

import java.awt.event.*;


public class cController implements ActionListener
{
	private cModel modelObject;
	private cView viewObject;
	private String show;
	
	private double oC1;												// operand1 in controller class
	private double oC2;												// operand2 in controller class
	private char oC;												// operation in controller class
	private double result;											// result in controller class

	private int dotCount = 0;										// 0: zero dot, 	   1: one dot (at most)

//	private int signNum = 0;										// 0: positive,        1: negative
//	private int firstOperandCheck = 0;								// 0: operand unsaved, 1: operand saved 
	
	public cController(cModel m)
	{
		modelObject = m;
		show = "";
	}
	
	public void setView(cView v)
	{
		viewObject = v;
	}
	
	public void actionPerformed(ActionEvent e)
	{
																	// Equal Button Pressed		
		if(e.getSource() == viewObject.equalButton)
		{
			String s2 = viewObject.calTextField.getText();
			oC2 = Double.parseDouble(s2);
			System.out.println(oC1);
			System.out.println(oC);
			System.out.println(oC2);
																	// calculate
			result = modelObject.calculate(oC1, oC2, oC);			
																	// How To Show
			show = String.format("%.2f", result);
			
			System.out.println(show);
			
			viewObject.calTextField.setText(show);
			
			
			dotCount = 0;
		}
																	// Clear Button Pressed
		else if(e.getSource() == viewObject.clearButton)
		{
			show = "";
			oC1 = result;
			viewObject.calTextField.setText("");
			dotCount = 0;
		}
																	// Number Button Pressed
		else if(e.getSource() == viewObject.zeroButton)
		{
			show = show + "0";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.oneButton)
		{
			show = show + "1";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.twoButton)
		{
			show = show + "2";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.threeButton)
		{
			show = show + "3";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.fourButton)
		{
			show = show + "4";
			viewObject.calTextField.setText(show + "");
		}
																	// RULER
		else if(e.getSource() == viewObject.fiveButton)
		{
			show = show + "5";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.sixButton)
		{
			show = show + "6";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.sevenButton)
		{
			show = show + "7";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.eightButton)
		{
			show = show + "8";
			viewObject.calTextField.setText(show + "");
		}
		else if(e.getSource() == viewObject.nineButton)
		{
			show = show + "9";
			viewObject.calTextField.setText(show + "");
		}
																	// Operation Buttons Pressed       BACK!!!
		else if(e.getSource() == viewObject.plusButton)
		{
			if(show.length() > 0)	
			{
				show = viewObject.calTextField.getText();
				oC1 = Double.parseDouble(show);
				show = "+";
				oC = '+';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
			else
			{
				show = "+";
				oC = '+';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
			
				
					
		}
																	// RULER
		else if(e.getSource() == viewObject.minusButton)
		{
			if(show.length() > 0)	
			{
				show = viewObject.calTextField.getText();
				oC1 = Double.parseDouble(show);
				show = "-";
				oC = '-';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
			else
			{
				show = "-";
				oC = '-';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
		}
		else if(e.getSource() == viewObject.multiplyButton)
		{
			if(show.length() > 0)	
			{
				show = viewObject.calTextField.getText();
				oC1 = Double.parseDouble(show);
				show = "*";
				oC = '*';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
			else
			{
				show = "*";
				oC = '*';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
		}
		else if(e.getSource() == viewObject.divideButton)
		{
			if(show.length() > 0)	
			{
				show = viewObject.calTextField.getText();
				oC1 = Double.parseDouble(show);
				show = "/";
				oC = '/';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
			else
			{
				show = "/";
				oC = '/';
				viewObject.calTextField.setText(show + "");
				show = "";
				dotCount = 0;
			}
		}
																	// dot Button Pressed
																	// ensure 1 dot at most
		else if(e.getSource() == viewObject.dotButton)
		{
			if(dotCount == 0)
			{
				show = show + ".";
				viewObject.calTextField.setText(show + "");
				dotCount = 1;
			}
			
		}
																	// sign Button Pressed
																	// switch the sign
		else if(e.getSource() == viewObject.signButton)
		{
			show  = viewObject.calTextField.getText();
			if(show.length() > 0)
			{
				double signNumber = Double.parseDouble(show);
				if(signNumber > 0)
				{
					show = viewObject.calTextField.getText();
					viewObject.calTextField.setText("-" + show);
				}
				else
				{
					show = show.substring(1, show.length());
					viewObject.calTextField.setText(show);
				}
				
			}
				
			
		}
																	// back Button Pressed
		else if(e.getSource() == viewObject.backButton)
		{
			show = viewObject.calTextField.getText();
			if(show.length() > 0)
			{
				show = show.substring(0, show.length()-1);
				viewObject.calTextField.setText(show);
			}
		}
	}
}
