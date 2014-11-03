/**
 * 	Class cModel: define the operands and operations  
 * 	Created by Dehao Wang, 11.03.14 
 */

public class cModel
{
	private double oM1;                                	// operand1 in model class
	private double oM2;									// operand2 in model class
	private char oM;									// operation in model class
	
	public cModel(double o1, double o2, char oprt)
	{
		oM1 = o1;                  
		oM2 = o2;
		oM = oprt;
	}
	
	public cModel()
	{
		oM1 = 0;
		oM2 = 0;
		oM = 0;
	}
	
	public double calculate(double o1, double o2, char oprt)
	{
		oM1 = o1;
		oM2 = o2;
		oM = oprt;
		
		switch (oM)
		{
			case '+' :
				return (oM1 + oM2);
			case '-' :
				return (oM1 - oM2);
			case '*' :
				return (oM1 * oM2);
			case '/' :
				return (oM1 / oM2);
			
			default: 
				return 0;
		}
	
	}
	
}
