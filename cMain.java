/**
 * 	Class cMain: instantiations of the objects(model, view and controller)  
 * 	Created by Dehao Wang, 11.03.14 
 */

public class cMain 
{
	public static void main(String[] args) 
	{
													// Calculator
		cModel m = new cModel();
		cController c = new cController(m);
		cView v = new cView(m, c);
		c.setView(v);
		v.setVisible(true);
	}
}
