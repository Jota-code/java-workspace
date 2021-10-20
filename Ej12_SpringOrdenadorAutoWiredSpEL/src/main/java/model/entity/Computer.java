package model.entity;

import java.util.ArrayList;

public class Computer {
	
	private double price;
	private String brand;
	private ArrayList<Ram> ramList;
	private Processor processor;
	private ArrayList<GraphicsCard> gpuList;
	private ArrayList<Periferal> periferalList;
	private MotherBoard motherboard;
	
	
	

	/*public Computer(double price, String brand, ArrayList<Ram> ramList, Processor processor,
			ArrayList<GraphicsCard> gpuList, ArrayList<Periferal> periferalList, MotherBoard motherboard) {
		this.price = price;
		this.brand = brand;
		this.ramList = ramList;
		this.processor = processor;
		this.gpuList = gpuList;
		this.periferalList = periferalList;
		this.motherboard = motherboard;
	}*/

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

	public ArrayList<Ram> getRamList() {
		return ramList;
	}

	public void setRamList(ArrayList<Ram> ramList) {
		this.ramList = ramList;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public ArrayList<GraphicsCard> getGpuList() {
		return gpuList;
	}

	public void setGpuList(ArrayList<GraphicsCard> gpuList) {
		this.gpuList = gpuList;
	}

	public ArrayList<Periferal> getPeriferalList() {
		return periferalList;
	}

	public void setPeriferalList(ArrayList<Periferal> periferalList) {
		this.periferalList = periferalList;
	}

	public MotherBoard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(MotherBoard motherboard) {
		this.motherboard = motherboard;
	}
	
	public double calculateComponentsPrice()	{
		double totalPrice = 0;
		//TODO: make the method
		double ramPrice = 0;
		for (Ram ram : ramList) {
			ramPrice += ram.getPrice();
		}
		double periferalPrice = 0;
		for (Periferal periferal : periferalList) {
			periferalPrice += periferal.getPrice();
		}
		double gpuPrice = 0;
		for (GraphicsCard graphicsCard : gpuList) {
			gpuPrice += graphicsCard.getPrice();
		}
		totalPrice += this.motherboard.getPrice() + this.processor.getPrice() + ramPrice + periferalPrice + gpuPrice;
		
		return totalPrice;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", brand=" + brand + ", ramList=" + ramList + ", processor=" + processor
				+ ", gpuList=" + gpuList + ", periferalList=" + periferalList + ", motherboard=" + motherboard + "]";
	}

}
