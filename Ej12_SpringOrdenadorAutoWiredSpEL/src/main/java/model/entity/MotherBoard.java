package model.entity;

public class MotherBoard {

	private double price;
	private String brand;
	private String model;

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MotherBoard [price=" + price + ", brand=" + brand + ", model=" + model + "]";
	}
	
	

}
