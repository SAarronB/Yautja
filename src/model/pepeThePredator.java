package model;

public class pepeThePredator
{
//------------------PROPERTIES-----------------------
	private String name;
	private double legCount;
	private boolean armor;
	private boolean weapons;
	private int eyeCount;
	private int armCount;
	private int mandibles;
//------------------PROPERTIES-----------------------

//-----------------CONSTRUCTORS----------------------
	public pepeThePredator(String name, double legCount,
			boolean armor, boolean weapons, int eyeCount,
			int armCount, int mandibles) 
	{
		this.name = name;
		this.legCount = legCount;
		this.armor = armor;
		this.weapons = weapons;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.mandibles = mandibles;
	}
//-----------------CONSTRUCTORS----------------------

	
	public String getName()
	{
		return name;
	}
	
	
}
