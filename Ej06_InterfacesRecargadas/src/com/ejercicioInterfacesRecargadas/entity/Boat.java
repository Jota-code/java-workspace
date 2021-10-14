package com.ejercicioInterfacesRecargadas.entity;

import com.ejercicioInterfacesRecargadas.interfaces.Moveable;

public class Boat implements Moveable {

	private int id;
	private int cv;
	private String name;

	public Boat(int id, int cv, String name) {
		this.id = id;
		this.cv = cv;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Boat [id=" + id + ", cv=" + cv + ", name=" + name + "]";
	}

	@Override
	public void move(int distance, int cv) {
		System.out.println("Me muevo " + (distance + cv * 2) + " metros");
	}

}
