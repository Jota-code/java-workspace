package es.curso.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Spring
@Component
@Scope("prototype")
//JPA
@Entity
@Table(name = "cars")
public class Car {

	@Id
	private String plate;
	private String brand;
	private String model;
	@Column(name = "km_number")
	private int kmNumber;

	public Car() {
		super();
	}

	public Car(String plate, String brand, String model, int kmNumber) {
		super();
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.kmNumber = kmNumber;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
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
