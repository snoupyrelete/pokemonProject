package pokemon.view;

import java.awt.Color;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private String pokemon;
	private PokemonController baseController;
	private SpringLayout baseLayout;
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.pokemon = "";
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		this.updateButton = new JButton("Update!");
		this.pokedexSelector = new JComboBox(new String [] {"ShyGuy","Jigglypuff","Vulpix","Magcargo","GeoDude"});
		this.pokemonLabel = new JLabel("Current Pokemon", pokemonIcon, SwingConstants.CENTER);
		this.healthLabel = new JLabel("health");
		this.combatLabel = new JLabel("combat");
		this.speedLabel = new JLabel("speed");
		this.nameLabel = new JLabel("name");
		this.numberLabel = new JLabel("number");
		this.advancedLabel = new JLabel("advanced");
		this.healthField = new JTextField("healthField");
		this.combatField = new JTextField("combatField");
		this.speedField = new JTextField("speedField");
		this.nameField = new JTextField("nameField");
		
		this.numberField = new JTextField("numberField");
		this.advancedArea = new JTextArea("advancedArea");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.add(updateButton);
		this.add(pokedexSelector);
		this.add(pokemonLabel);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(healthField);
		this.add(combatField);
		this.add(speedField);
		this.add(nameField);
		this.add(numberField);
		this.add(advancedArea);	
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 15, SpringLayout.SOUTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 21, SpringLayout.SOUTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, 359, SpringLayout.SOUTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, 200, SpringLayout.WEST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 19, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 8, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 6, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 14, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 8, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 39, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 34, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 371, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -2, SpringLayout.NORTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 73, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, -6, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 371, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 371, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, combatField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 16, SpringLayout.SOUTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 159, SpringLayout.SOUTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 0, SpringLayout.WEST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 4, SpringLayout.NORTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -87, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 571, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				//pokemon = (String) pokedexSelector.getSelectedItem();
		
				//nameField.setText((String) pokedexSelector.getSelectedItem());
				//nField.setText((String) pokedexSelector.getSelectedItem());
//				nameField.setText((String) baseController.getPokemonInfo(pokemon).get("name"));
//				numberField.setText((String) baseController.getPokemonInfo(pokemon).get("number"));
//				healthField.setText((String) baseController.getPokemonInfo(pokemon).get("health"));
				
				//pokemonLabel.setIcon(getClass().getResource("/pokemon/view/images/" + (String) pokedexSelector.getSelectedItem()));
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHitPoints() + "");
				//advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() + "\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				pokemonLabel.setIcon(new ImageIcon(getClass().getResource("/pokemon/view/images/" + pokemon + ".png")));
				
			}
		});
	}
	
	private void changeColor()
	{
		
	}
	
	private void changeImageDisplay()
	{
		
	}
	
	private boolean isValidDouble(String input)
	{
		return true;
	}
	
	private boolean isValidInteger(String input)
	{
		return true;
	}
	
	private boolean isValidName(String name)
	{
		return true;
	}
}
