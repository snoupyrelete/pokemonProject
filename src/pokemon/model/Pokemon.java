package pokemon.model;

public class Pokemon
{
	private int hitPoints;
	private int attackPoints;
	private int number;
	private double speed;
	private String name;

	
	public Pokemon(String name)
	{
		this.hitPoints = 0;
		this.attackPoints = 0;
		this.number = 0;
		this.speed = 0.0;
		this.name = "";
	}


	public int getHitPoints()
	{
		return hitPoints;
	}

	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}
	
	public int getAttackPoints()
	{
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
