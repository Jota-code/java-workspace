package com.classes;

public class Healer extends Character {

	private String name;
	private Weapon weapon;
	private int health;
	private int wisdom;

	public Healer(String name, Weapon weapon, int health, int wisdom) {
		super(name, weapon, health, wisdom);
		this.name = name;
		this.weapon = weapon;
		this.health = health;
		this.wisdom = wisdom;
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

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	@Override
	public void attack(Character c, Weapon w) {
		if (w instanceof Prayer) {
			System.out.println("The " + this.getClass().getSimpleName() + " " + this.name + " is attacking "
					+ c.getName() + " with the " + w.getClass().getSimpleName() + " " + w.getName());
			w.useSpecial(c, w.getDamage(), wisdom);
		} else {
			System.out.println("The " + this.getClass().getSimpleName() + " " + this.name + " is attacking "
					+ c.getName() + " with the " + w.getClass().getSimpleName() + " " + w.getName());
			w.use(c, w.getDamage());
		}

	}

}
