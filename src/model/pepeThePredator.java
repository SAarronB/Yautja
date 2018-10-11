package model;

public class PepeThePredator
{
	// ------------------DATA MEMEBERS-----------------------

	// These usually have there own default values
	// ALL NUMBERS => 0
	// BOOLEAN => FALSE
	// OBJECTS => NULL!!
	private String name;
	private String foodSide;
	private String foodMain;
	private double legCount;
	private boolean armor;
	private boolean weapons;
	private int eyeCount;
	private int armCount;
	private int mandibles;
	private double distance;
	// ------------------DATA MEMEBERS-----------------------

	// -------------------CONSTRUCTORS----------------------
	/**
	 * Default constructor for after the fact customization. AKA I don't know the
	 * info yet about pepeThePredator. But for now I have Custom Default Value for
	 * DATA MEMBERS INITIALIZING DATA MEMBERS WITH "BAD" VALUES TO BE CHANGED
	 */
	public PepeThePredator(String name, double legCount, boolean armor, boolean weapons, int eyeCount, int armCount, int mandibles, double distance)
	{

		// -------------DEFAULT----------------

		this.name = name;
		this.legCount = legCount;
		this.armor = armor;
		this.weapons = weapons;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.mandibles = mandibles;
		this.distance = distance;
		// -------------DEFAULT----------------

	}
	
	public String foodMain() {
		return foodMain;
	}
	
	public String foodSide() {
		return foodSide;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void getName(String name) {
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setlegCount(double legCount)
	{
		this.legCount = legCount;
	}

	public void setArmor(boolean armor)
	{
		this.armor = armor;
	}

	public void setWeapons(boolean weapons)
	{
		this.weapons = weapons;
	}

	public void setarmCount(int armCount)
	{
		this.armCount = armCount;
	}

	public void seteyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}

	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	public String toString() {
		String description = "The Predator jumped " + distance;
				description += " Feet." + "The predator attacked you";
				return description;
	}

}
