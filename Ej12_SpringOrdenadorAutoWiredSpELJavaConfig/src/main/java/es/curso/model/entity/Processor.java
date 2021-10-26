package es.curso.model.entity;

public class Processor {

	private double price;
	private double hz;
	private String brand;
	private GraphicsCard apu;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getHz() {
		return hz;
	}

	public void setHz(double hz) {
		this.hz = hz;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public GraphicsCard getApu() {
		return apu;
	}

	public void setApu(GraphicsCard apu) {
		this.apu = apu;
	}

	@Override
	public String toString() {
		return "Processor [price=" + price + ", hz=" + hz + ", brand=" + brand + ", apu=" + apu + "]";
	}
	
	

}
