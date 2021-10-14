package com.classes;

public abstract class Character {

	private String name;
	private Weapon weapon;
	private int health;
	private int specificAttr;

	public Character(String name, Weapon weapon, int health, int specificAttr) {
		this.name = name;
		this.weapon = weapon;
		this.health = health;
		this.specificAttr = specificAttr;
	}

	public abstract void attack(Character c, Weapon w);
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpecificAttr() {
		return specificAttr;
	}

	public void setSpecificAttr(int specificAttr) {
		this.specificAttr = specificAttr;
	}

}
