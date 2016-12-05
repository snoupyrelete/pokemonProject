package pokemon.model;

public class Magcargo extends Pokemon implements Fire, Rock
{
	public Magcargo()
	{
		super("Magcargo", 219);
	}
	
	public Magcargo(String name)
	{
		super(name, 219);
	}
	
	public int smash()
	{
		return 2;
	}
	
	public int rockSlide()
	{
		return 4;
	}
	
	public int breatheFire()
	{
		return 2;
	}
	
	public int incinerate()
	{
		return 5;
	}
}
