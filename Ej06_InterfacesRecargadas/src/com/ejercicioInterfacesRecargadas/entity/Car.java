package com.ejercicioInterfacesRecargadas.entity;

import com.ejercicioInterfacesRecargadas.interfaces.Moveable;

public class Car implements Moveable {

	private int id;
	private int cv;
	private String name;

	public Car(int id, int cv, String name) {
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
		return "Car [id=" + id + ", cv=" + cv + ", name=" + name + "]";
	}

}
