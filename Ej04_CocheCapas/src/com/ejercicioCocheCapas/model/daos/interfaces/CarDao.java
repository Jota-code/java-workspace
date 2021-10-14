package com.ejercicioCocheCapas.model.daos.interfaces;

import java.util.List;

import com.ejercicioCocheCapas.model.entity.Car;

public interface CarDao {
	
	public boolean add(Car c);
	public boolean remove(int plate);
	public boolean update(Car c);
	public Car getByPlate(int plate);
	public List<Car> listAll();

}
