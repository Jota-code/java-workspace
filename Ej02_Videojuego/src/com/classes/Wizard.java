package com.classes;

public class Wizard extends Character {

	private String name;
	private Weapon weapon;
	private int health;
	private int intelligence;

	public Wizard(String name, Weapon weapon, int health, int intelligence) {
		super(name, weapon, health, intelligence);
		this.name = name;
		this.weapon = weapon;
		this.health = health;
		this.intelligence = intelligence;
	}

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

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	@Override
	public void attack(Character c, Weapon w) {
		if (w instanceof Spell) {
			System.out.println("The " + this.getClass().getSimpleName() + " " + this.name + " is attacking "
					+ c.getName() + " with the " + w.getClass().getSimpleName() + " " + w.getName());
			w.useSpecial(c, w.getDamage(), intelligence);
		} else {
			System.out.println("The " + this.getClass().getSimpleName() + " " + this.name + " is attacking "
					+ c.getName() + " with the " + w.getClass().getSimpleName() + " " + w.getName());
			w.use(c, w.getDamage());
		}

	}

}
