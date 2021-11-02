package es.curso.model.business.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import es.curso.model.business.service.CarService;
import es.curso.model.entity.Car;

@Service
public class CarDaoJPA implements CarService {

	@Override
	public String insert(Car c) {
		String message ="";
		
		return message;
	}

	@Override
	public String remove(String plate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modify(Car c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car findByPlate(String plate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
