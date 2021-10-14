package com.ejercicioInterfacesRecargadas.main;

import com.ejercicioInterfacesRecargadas.entity.Boat;
import com.ejercicioInterfacesRecargadas.entity.Car;
import com.ejercicioInterfacesRecargadas.entity.Motorcycle;
import com.ejercicioInterfacesRecargadas.entity.Plane;

public class Main {

	public static void main(String[] args) {
		
		
		Motorcycle moto1;
		Car coche1;
		Boat barco1;
		Plane avion1;
		
		moto1 = new Motorcycle(1, 30, "moto");
		coche1 = new Car(2, 300, "Nissan Silvia S15");
		barco1 = new Boat(3, 1200, "WADW");
		avion1 = new Plane(4, 3000, "Boeing 747");
		
		System.out.println(moto1);
		moto1.move(30, moto1.getCv());
		
		System.out.println(coche1);
		coche1.move(30, coche1.getCv());
		
		System.out.println(barco1);
		barco1.move(30, barco1.getCv());
		
		System.out.println(avion1);
		avion1.move(30, avion1.getCv());
		
		

	}

}
