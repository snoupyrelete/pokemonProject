package pokemon.model;

public abstract class Pokemon
{
	private int hitPoints;
	private int attackPoints;
	private int number;
	private double speed;
	private String name;

	
	public Pokemon(String name, int number)
	{
		this.name = name;
		this.number = number;
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
	
//	public String getPokemonTypes()
//	{
//		String pokemonTypes = "This pokemon is the followingypes:\n";
//		//Class<?> [] types = getClass.getInterfaces();
//		
//	}
	
	
}
