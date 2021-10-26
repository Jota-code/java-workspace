package es.curso.view;

import java.util.List;
import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.Config;
import es.curso.model.business.CarManager;
import es.curso.model.entity.Car;

public class Main {

	private static ApplicationContext context;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(Config.class);

		CarManager carService = context.getBean(CarManager.class);
		int option = 1;

		do {
			showMenu();
			option = Integer.parseInt(sc.nextLine());
			String message = "";
			switch (option) {

			case 1:

				message += carService.insert(requestCar(new Car()));
				System.out.println(message);
				break;

			case 2:
				Car rmCar = requestCarByPlate(carService);
				message += carService.remove(rmCar.getPlate());
				break;

			case 3:
				Car updateCar= requestCarByPlate(carService);
				message += carService.modify(requestCar(updateCar));
				break;

			case 4:
				
				Car listCar = requestCarByPlate(carService);
				printCar(listCar);
				break;

			case 5:
				List<Car> CarList = carService.list();
				printCarList(CarList);
				break;

			case 0:
				break;

			}

		} while (option != 0);
		sc.close();
	}
	
	private static void printCarList(List<Car> CarList) {
		for (Car car : CarList) {
			printCar(car);
		}
		
	}

	private static void showMenu() {
		System.out.println("----------MENU-----------");
		System.out.println("1. Add new car");
		System.out.println("2. Delete car from the database");
		System.out.println("3. Modify car from the database");
		System.out.println("4. List car by its plate number");
		System.out.println("5. List all cars");
		System.out.println("0. Exit");

	}

	private static void printCar(Car c) {
		System.out.println(c);
	}

	private static Car requestCar(Car c) {
		System.out.println("Type the car plate");
		String plate = sc.nextLine();
		System.out.println("Type the car brand");
		String brand = sc.nextLine();
		System.out.println("Type the car model");
		String model = sc.nextLine();
		System.out.println("Type the car kms");
		int kmNumber = Integer.parseInt(sc.nextLine());
		c.setPlate(plate);
		c.setBrand(brand);
		c.setModel(model);
		c.setKmNumber(kmNumber);
		return c;

	}
	
	private static Car requestCarByPlate(CarManager carService)	{
		Car c;
		String plate = "";
		do	{
			System.out.println("Type the car plate");
			plate = sc.nextLine();
			c = carService.findByPlate(plate);
			
			if(c == null)	{
				System.out.println("CAR IS NULL");
			}
			
		} while(c==null);
		
		return c;
	}

	

}
