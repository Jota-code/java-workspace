package es.curso.model.business.service;

import java.util.List;

import es.curso.model.entity.Car;

public interface CarService {

	String insert(Car c);
	String remove(String plate);
	String modify(Car c);
	Car findByPlate(String plate);
	List<Car> list();
	
}
