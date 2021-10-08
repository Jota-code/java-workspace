package com.classes;

public abstract class Weapon {

	private String name;
	private int damage;

	public Weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void use(Character c, int damage) {

		System.out.println("Normal attack");
		c.setHealth(c.getHealth() - damage);
		System.out.println("The normal attack has done " + damage + " points of damage");
		System.out.println("Now the Character " + c.getName() + " has got " + c.getHealth() + " points of health");

	}

	public void useSpecial(Character c, int damage, int specialDamage) {
		int totalDamage = damage + specialDamage;
		System.out.println("Special attack");
		c.setHealth(c.getHealth() - (totalDamage));
		System.out.println("The special attack has done " + totalDamage + " points of damage");
		System.out.println("Now the Character " + c.getName() + " has got " + c.getHealth() + " points of health");
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
