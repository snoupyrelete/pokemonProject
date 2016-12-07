package poke.model;

public class Vulpix extends Pokemon implements Fire
{
	
	public Vulpix()
	{
		super("Vulpix", 37);
		this.setAttackPoints(8);
		this.setHitPoints(40);
		this.setSpeed(9.0);
	}
	public Vulpix(String name)
	{
		super(name, 37);
		this.setAttackPoints(8);
		this.setHitPoints(40);
		this.setSpeed(9.0);
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
