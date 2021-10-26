package es.curso.model.repository;

import java.util.List;

import es.curso.model.entity.Car;

public interface CarDAO {
	
	boolean insert(Car c);
	boolean remove(String plate);
	boolean modify(Car c);
	Car findByPlate(String plate);
	List<Car> list();

}
