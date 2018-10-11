package controller;

import javax.swing.JOptionPane;
import model.PepeThePredator;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class YautjaController
{

	// ----------------------------DATA MEMBERS-----------------------------------
	private PepeThePredator myPredator;
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
		Loop();
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

	private void lotsOfGainz() 
	{
	//Local variable are only visible in the method they are defined in!
	//They only have SCOPE to; that method
		
		ArrayList<PepeThePredator> myGainz = new ArrayList<PepeThePredator>();
		
		PepeThePredator moreGainz = new PepeThePredator(null, 0, false, false, 0, 0, 0, 0);
		PepeThePredator sampleGainz = new PepeThePredator(null, 0, false, false, 0, 0, 0, 0);
		
		myGainz.add(sampleGainz);
		myGainz.add(moreGainz);
		
		for(int index = 0; index < myGainz.size(); index += 1) {
			PepeThePredator currentGainz = myGainz.get(index);
			currentGainz.setDistance(index * currentGainz.getDistance());
		}
		
		for(PepeThePredator current : myGainz) {
			JOptionPane.showMessageDialog(null, "the Gainz method is Named: " + current.getName());
		}
		
		//for(int index = myGainz.size() - 1; index>=0; index -=1){
		//this for loop runs backward, it starts off by initiatinig index to the size of the list - 1.
		//then it then goes from highest to lowest going down by one.
		//Run currentRun = myRuns.get(index);
		//jOptionPane.showMessageDialog(currentRun);
		//}
		//replace data=========.set
		//add data=============.add
		//clear all data=======.clear
		//get data=============.get
		
		
		
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
		PepeThePredator predator = new PepeThePredator(answer, 0, false, false, 0, 0, 0, 0);
		
		// repeat until finished correctly
		//While loops must change a variable at the end
		while (!validDouble(answer))
		{
			answer = JOptionPane.showInputDialog(null, "You Have to Guess!! Dont Give UP!!!");
		}
		// assigns and converts
		predator.setDistance(Double.parseDouble(answer));
		
		answer = JOptionPane.showInputDialog(null, "what did the predator attack with?");
		if(answer == null || answer.equals("")) {
			JOptionPane.showMessageDialog(null, "You Either pressed cancel, the X or typed nothing >:[");
		}
	JOptionPane.showMessageDialog(null, predator);
		
	}
	
	public Integer Loop() {
		int number ;
		number = Integer.parseInt(JOptionPane.showInputDialog(null,"Input a Number"));
		while(number<100){
			JOptionPane.showMessageDialog(null, "The Number is Less Than 100");
			if(number == 1) {
				JOptionPane.showMessageDialog(null, "The Number is 1");
				number = number + 4;
				number = number + number/2;
			}else if(number <=50){
				JOptionPane.showMessageDialog(null, "The Number is Less or Equal to 50");
				number = number + number/2;
				JOptionPane.showMessageDialog(null, number);
			}else{
				JOptionPane.showMessageDialog(null, "The Number is greater than 50");
				number = number + number/2;
				JOptionPane.showMessageDialog(null, number);
			}
			
		}
		return number;
	}
	
	private void predatorFood(){
		/**
	 	*This starts the arraylist and names it foodlist
		*/
		ArrayList<PepeThePredator> foodList = new ArrayList<PepeThePredator>();
	
		/**
		 * This sets up main
		 */
		PepeThePredator main = new PepeThePredator(null, 0, false, false, 0, 0, 0, 0);
		
		/**
		 * this sets up sides
		 */
		PepeThePredator sides = new PepeThePredator(null, 0, false, false, 0, 0, 0, 0);
		
		/**
		 * addes main to foodList
		 */
		foodList.add(main);
		
		/**
		 * addes sides to foodList
		 */
		foodList.add(sides);
		
	}
	// -------------------------------METHOD SECTION-------------------------------

}
