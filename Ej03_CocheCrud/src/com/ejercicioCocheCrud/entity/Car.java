package com.ejercicioCocheCrud.entity;

public class Car {
	
	private int id;
	private String brand;
	private String model;
	private int kmNumber;
	
	public Car(int id, String brand, String model, int kmNumber) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.kmNumber = kmNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKmNumber() {
		return kmNumber;
	}

	public void setKmNumber(int kmNumber) {
		this.kmNumber = kmNumber;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", kmNumber=" + kmNumber + "]";
	}
	
	
	
	

}
