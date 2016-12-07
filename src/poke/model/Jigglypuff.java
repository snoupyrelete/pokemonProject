package poke.model;

public class Jigglypuff extends Pokemon implements Fairy
{
	public Jigglypuff()
	{
		super("Jigglypuff", 39);
		this.setAttackPoints(10);
		this.setHitPoints(50);
		this.setSpeed(4.0);
	}
	public Jigglypuff(String name)
	{
		super(name, 39);
		this.setAttackPoints(6);
		this.setHitPoints(40);
		this.setSpeed(2.0);
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
