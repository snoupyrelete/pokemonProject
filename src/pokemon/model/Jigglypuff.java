package pokemon.model;

public class Jigglypuff extends Pokemon implements Fairy
{
	Jigglypuff()
	{
		super("Jigglypuff", 39);
	}
	Jigglypuff(String name)
	{
		super(name, 39);
	}
	
	public int charm()
	{
		return 2;
	}
	
	public int moonBeam()
	{
		return 7;
	}
}
