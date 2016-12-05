package pokemon.model;

public class Vulpix extends Pokemon implements Fire
{
	
	public Vulpix()
	{
		super("Vulpix", 37);
	}
	public Vulpix(String name)
	{
		super(name, 37);
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
