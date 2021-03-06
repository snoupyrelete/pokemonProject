package poke.controller;

import java.util.ArrayList;
import java.util.Map;

import poke.model.*;
import poke.view.PokemonFrame;

import java.util.HashMap;

public class PokemonController
{
	//private Pokemon pokemon;
	private PokemonFrame pokemonFrame;
	private ArrayList<Pokemon> pokedex;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		pokemonFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Geodude("rock-man-thing"));
		pokedex.add(new Vulpix("Fire Squirell"));
		pokedex.add(new Shyguy("ghost From Mario?"));
		pokedex.add(new Magcargo("Fire Snail"));
		pokedex.add(new Jigglypuff("Jiggle-fairy"));
		pokedex.add(new Geodude("another stupid rock guy?!?!"));
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHitPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public PokemonFrame getBaseFrame()
	{
		return pokemonFrame;
	}
}
