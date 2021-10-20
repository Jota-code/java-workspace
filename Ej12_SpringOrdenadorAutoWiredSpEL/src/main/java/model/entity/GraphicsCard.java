package model.entity;

public class GraphicsCard {

	private double price;
	private String brand;
	private Ram ram;
	private String modelo;

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

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "GraphicsCard [price=" + price + ", brand=" + brand + ", ram=" + ram + ", modelo=" + modelo + "]";
	}

	
}
