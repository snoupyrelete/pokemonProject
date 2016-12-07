package poke.model;

public class Geodude extends Pokemon implements Rock
{
	public Geodude()
	{
		super("Geodude", 74);
		this.setAttackPoints(10);
		this.setHitPoints(50);
		this.setSpeed(4.0);
	}
	
	public Geodude(String name)
	{
		super(name, 74);
		this.setAttackPoints(10);
		this.setHitPoints(50);
		this.setSpeed(4.0);
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
