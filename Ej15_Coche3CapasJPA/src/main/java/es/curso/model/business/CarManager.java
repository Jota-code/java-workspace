package es.curso.model.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.curso.model.entity.Car;
import es.curso.model.repository.jpa.CarDaoJPA;

@Service
public class CarManager {

	@Autowired
	private CarDaoJPA carDaoRepository;

	@Transactional
	public String insert(Car c) {
		String message = "";

		if ("".equalsIgnoreCase(c.getPlate())) {
			message += "The field plate is empty";
		} else if (c.getPlate().length() != 7) {
			message += "The field plate must contain 7 characters";
		} else if ("".equalsIgnoreCase(c.getBrand())) {
			message += "The field brand is empty";
		} else if ("".equalsIgnoreCase(c.getModel())) {
			message += "The field model is empty";
		} else if ("".equalsIgnoreCase(message)) {
			if (carDaoRepository.insert(c)) {
				message += "Car succesfully added to the database";
			} else {
				message += "Error adding car to the database";
			}
		}

		return message;
	}

	@Transactional
	public String remove(String plate) {
		String message = "";
		if (carDaoRepository.remove(plate)) {
			message += "Car succesfully removed";
		} else {
			message += "Error removing car from the database";
		}
		return message;
	}

	@Transactional
	public String modify(Car c) {
		String message = "";
		
		if ("".equalsIgnoreCase(c.getPlate())) {
			message += "The field plate is empty";
		} else if (c.getPlate().length() != 7) {
			message += "The field plate must contain 7 characters";
		} else if ("".equalsIgnoreCase(c.getBrand())) {
			message += "The field brand is empty";
		} else if ("".equalsIgnoreCase(c.getModel())) {
			message += "The field model is empty";
		} else if ("".equalsIgnoreCase(message)) {
			if (carDaoRepository.modify(c)) {
				message += "Car succesfully modified";
			} else {
				message += "Error modifying the car from the database";
			}
		}
		return message;
	}

	public Car findByPlate(String plate) {
		return carDaoRepository.findByPlate(plate);
	}

	public List<Car> list() {
		return carDaoRepository.list();
	}

}
