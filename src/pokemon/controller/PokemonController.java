package pokemon.controller;

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;
import java.util.Map;
import java.util.HashMap;

public class PokemonController
{
	private Pokemon pokemon;

	private PokemonFrame pokemonFrame;
	private Map map;
	
	public PokemonController()
	{
		pokemon = new Pokemon("");
		pokemonFrame = new PokemonFrame(this);
		Map<String, String> map = new HashMap<String, String>();
	}
	
	public void start()
	{
		
	}
	
	public Map getPokemonInfo()
	{
		map.put("name", pokemon.getName());
		map.put("number", pokemon.getNumber());
		map.put("health", pokemon.getHitPoints());
		map.put("attack", pokemon.getAttackPoints());
		map.put("speed", pokemon.getSpeed());
		//map.put("types", pokemon.getNumber());
	
		
		return map;
	}
}
