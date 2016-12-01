package pokemon.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import pokemon.controller.PokemonController;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame
{

	private PokemonController baseController;

	private PokemonPanel pokemonPanel;

	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		pokemonPanel = new PokemonPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(pokemonPanel);
		this.setTitle("Chatbot Window");
		this.setSize(new Dimension(, 500));
		this.setVisible(true);
	}
}
