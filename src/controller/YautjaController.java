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
	
		Action();
		Jump();
		
	}
	
	/**
	 * Only the controller can call this object cause its private
	 */
	private void Jump() 
	{
		
		boolean isDone = false;
		int count = 0;
		
//Better to keep track of how many times something happens
		while (!isDone) 
		{
			JOptionPane.showMessageDialog(null, "THE PREDATOR IS IN THE AIR!!!!");
			
			//Eventually change the loop variable
			count++;
			
			//Oboe -- this mean that when you start to count it will take zero into a count.
			if (count >= 1)
			{
				//updated Variable
				isDone = true;
			}
			
		}
		
	}
	
	private void Action() 
	{
		
		Boolean onGround = true;
		int time = 0;
		
		while(onGround)
		{
		
			JOptionPane.showMessageDialog(null, "PREDATOR IS IN THE SHADOWS WAITING TO STRIKE!!!!");
			
			time++;
			if(time >= 5)
			{
				JOptionPane.showMessageDialog(null, "THE PREDATOR IS RUNNING!!!!");
				
				onGround = false;
			}
		
		}
	}
//-------------------------------METHOD SECTION-------------------------------

}
