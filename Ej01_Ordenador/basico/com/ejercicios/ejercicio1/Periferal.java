package com.ejercicios.ejercicio1;

public class Periferal {

	private PeriferalType periferalType;
	private double price;
	private String brand;
	
	public Periferal(PeriferalType periferalType, double price, String brand) {
		this.periferalType = periferalType;
		this.price = price;
		this.brand = brand;
	}

	public PeriferalType getPeriferalType() {
		return periferalType;
	}

	public void setPeriferalType(PeriferalType periferalType) {
		this.periferalType = periferalType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Periferal [periferalType=" + periferalType + ", price=" + price + ", brand=" + brand + "]";
	}
	
	

}
