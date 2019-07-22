    
package com.codingdojo.pokemon;

public class Pokemon {
	private String name;
	private int health = 0;
	private String type;
	private static int count = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health += health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Pokemon(String name, String type, int health) {
		count++;
		setName(name);
		setType(type);
		setHealth(health);
	}
}