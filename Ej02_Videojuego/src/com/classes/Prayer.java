package com.classes;

public class Prayer extends Weapon {

	private String name;
	private int damage;

	public Prayer(String name, int damage) {
		super(name, damage);
		// TODO Auto-generated constructor stub
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
