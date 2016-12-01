package pokemon.controller;

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;

public class PokemonController
{
	private Pokemon pokemon;

	private PokemonFrame pokemonFrame;

	public PokemonController()
	{
		pokemon = new Pokemon("");
		pokemonFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
}
