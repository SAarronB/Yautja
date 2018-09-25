package controller;

import javax.swing.JOptionPane;
import model.pepeThePredator;

public class YautjaController
{

//----------------------------DATA MEMBERS-----------------------------------
	private pepeThePredator myPredator;
//----------------------------DATA MEMBERS-----------------------------------
	
//-----------------------------CONSTRUCTOR SECTION----------------------------
	/**
	 * Builds the instance of the Controller
	 */
	public YautjaController()
	{
		
		myPredator = new pepeThePredator("Pepe The Predator",
				2, true, true, 2, 2, 4);
		
		
	}
//-----------------------------CONSTRUCTOR SECTION----------------------------

	
//-------------------------------METHOD SECTION-------------------------------
	/**
	 * Programs start here by calling methods and running them.
	 */
	public void start() 
	{
	
		running();
		
	}
	
	/**
	 * Only the controller can call this object cause its private
	 */
	private void running() 
	{
		
		boolean isDone = false;
		int count = 0;
		
//Better to keep track of how many times something happens
		while (!isDone) 
		{
			
			JOptionPane.showMessageDialog(null, "THE PREDATOR IS RUNNING!!!!");
		
			//Eventually change the loop variable
			count++;
			
			//Oboe -- this mean that when you start to count it will take zero into a count.
			if (count >= 10)
			{
				//updated Variable
				isDone = true;
			}
			
		}
		
	}
//-------------------------------METHOD SECTION-------------------------------

}
