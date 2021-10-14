package com.ejercicioInterfacesRecargadas.interfaces;

public interface Moveable {
	

	public default void move(int distance, int cv) {
		System.out.println("Me muevo " + (distance+cv) + " metros");
	}
}
