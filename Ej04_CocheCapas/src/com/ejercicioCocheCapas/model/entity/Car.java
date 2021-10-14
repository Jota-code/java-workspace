package com.ejercicioCocheCapas.model.entity;

public class Car {
	
	private int plate;
	private String brand;
	private String model;
	private int kmNumber;
	
	public Car(int plate, String brand, String model, int kmNumber) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.kmNumber = kmNumber;
	}

	public int getPlate() {
		return plate;
	}

	public void setPlate(int plate) {
		this.plate = plate;
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
		return "Car [plate=" + plate + ", brand=" + brand + ", model=" + model + ", kmNumber=" + kmNumber + "]";
	}
	
	
	
	

}
