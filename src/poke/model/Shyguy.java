package poke.model;

public class Shyguy extends Pokemon implements Fairy
{	
	public Shyguy()
	{
		super("Shyguy", 0);
		this.setAttackPoints(1);
		this.setHitPoints(5);
		this.setSpeed(20.0);
	}
	
	public Shyguy(String name)
	{
		super(name, 0);
		this.setAttackPoints(1);
		this.setHitPoints(5);
		this.setSpeed(20.0);
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
