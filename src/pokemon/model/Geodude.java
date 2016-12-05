package pokemon.model;

public class Geodude extends Pokemon implements Rock
{
	public Geodude()
	{
		super("Geodude", 74);
	}
	
	public Geodude(String name)
	{
		super(name, 74);
	}
	
	public int smash()
	{
		return 2;
	}
	
	public int rockSlide()
	{
		return 4;
	}
}
