package com.classes;

public class Warrior extends Character {

	private String name;
	private Weapon weapon;
	private int health;
	private int strength;

	public Warrior(String name, Weapon weapon, int health, int strength) {
		super(name, weapon, health, strength);
		this.name = name;
		this.weapon = weapon;
		this.health = health;
		this.setStrength(strength);
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

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public void attack(Character c, Weapon w) {
		if (w instanceof Sword) {
			System.out.println("The " + this.getClass().getSimpleName() + " " + this.name + " is attacking "
					+ c.getName() + " with the " + w.getClass().getSimpleName() + " " + w.getName());
			w.useSpecial(c, w.getDamage(), strength);
		} else if (w instanceof Bow) {
			System.out.println("The " + this.getClass().getSimpleName() + " " + this.name + " is attacking "
					+ c.getName() + " with the " + w.getClass().getSimpleName() + " " + w.getName());
			w.useSpecial(c, w.getDamage(), strength);
		} else {
			System.out.println("The " + this.getClass().getSimpleName() + " " + this.name + " is attacking "
					+ c.getName() + " with the " + w.getClass().getSimpleName() + " " + w.getName());
			w.use(c, w.getDamage());
		}
		/*
		 * if(w instanceof Sword) { System.out.println("The warrior is attacking");
		 * a.setHealth(getHealth() - 1); }
		 */

	}

}
