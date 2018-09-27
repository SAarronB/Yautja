package controller;

import javax.swing.JOptionPane;
import model.pepeThePredator;

public class YautjaController
{

	// ----------------------------DATA MEMBERS-----------------------------------
	private pepeThePredator myPredator;
	// ----------------------------DATA MEMBERS-----------------------------------

	// -----------------------------CONSTRUCTOR SECTION----------------------------
	/**
	 * Builds the instance of the Controller
	 */
	public YautjaController()
	{

		// myPredator = new pepeThePredator("Pepe The Predator",
		// 2, true, true, 2, 2, 4);

	}
	// -----------------------------CONSTRUCTOR SECTION----------------------------

	// -------------------------------METHOD SECTION-------------------------------
	/**
	 * Programs start here by calling methods and running them.
	 */
	public void start()
	{

		Action();
		Jump();
		userInput();
	}

	// Checks for a int
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "The Try Didnt work, type an Int");
		}
		return isValid;
	}

	// checks for a double
	public boolean validDouble(String maybeDouble)

	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "The Double Try didnt work, input a Double.");
		}
		return isValid;
	}

	/**
	 * Only the controller can call this object cause its private
	 */
	private void Jump()
	{

		boolean isDone = false;
		int count = 0;

		// Better to keep track of how many times something happens
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "THE PREDATOR IS IN THE AIR!!!!");

			// Eventually change the loop variable
			count++;

			// Oboe -- this mean that when you start to count it will take zero into a
			// count.
			if (count >= 1)
			{
				// updated Variable
				isDone = true;
			}

		}

		// For loops: is here, sets loop to 0. then checks is loop is less than 30, runs
		// message, then adds 2
		for (int loop = 30; loop > 0; loop -= 5)
		{
			userInput();
			JOptionPane.showMessageDialog(null, "This is the " + loop + "'th run object i made");
		}

	}

	
	private void Action()
	{

		Boolean onGround = true;
		int time = 0;

		while (onGround)
		{

			JOptionPane.showMessageDialog(null, "PREDATOR IS IN THE SHADOWS WAITING TO STRIKE!!!!");

			time++;
			if (time >= 5)
			{
				JOptionPane.showMessageDialog(null, "THE PREDATOR IS RUNNING!!!!");

				onGround = false;
			}

		}
	}

	private void userInput()
	{
		// Ask
		String answer = JOptionPane.showInputDialog(null, "What is the distance of the Predator!?!");
		pepeThePredator predator = new pepeThePredator(answer, 0, false, false, 0, 0, 0);
		
		// repeat until finished correctly
		//While loops must change a variable at the end
		while (!validDouble(answer))
		{
			answer = JOptionPane.showInputDialog(null, "You Have to Guess!! Dont Give UP!!!");
		}
		// assigns and converts
		pepeThePredator.setDistance(Double.parseDouble(answer));
		
		answer = JOptionPane.showInputDialog(null, "what did the predator attack with?");
		if(answer == null || answer.equals("")) {
			JOptionPane.showMessageDialog(null, "You Either pressed cancel, the X or typed nothing >:[");
		}
	JOptionPane.showMessageDialog(null, predator);
		
	}
	// -------------------------------METHOD SECTION-------------------------------

}
