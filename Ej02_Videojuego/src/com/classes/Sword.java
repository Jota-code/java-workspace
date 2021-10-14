package com.classes;

public class Sword extends Weapon {

	private String name;
	private int damage;

	public Sword(String name, int damage) {
		super(name, damage);
		this.name = name;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
