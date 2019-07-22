    
package com.codingdojo.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, String type, int health);
	void attackPokemon(Pokemon pokemon);
	void pokemonInfo(Pokemon pokemon);
}