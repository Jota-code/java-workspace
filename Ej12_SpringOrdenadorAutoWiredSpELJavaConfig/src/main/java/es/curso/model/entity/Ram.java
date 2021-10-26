package es.curso.model.entity;

public class Ram {

	private double price;
	private double hz;
	private String generation;

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

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	@Override
	public String toString() {
		return "Ram [price=" + price + ", hz=" + hz + ", generation=" + generation + "]";
	}
	
	

}
