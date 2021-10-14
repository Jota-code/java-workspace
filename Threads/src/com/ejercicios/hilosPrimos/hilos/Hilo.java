package com.ejercicios.hilosPrimos.hilos;

public class Hilo extends Thread {

	private String name;
	private int num;

	public Hilo(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public void run() {
		int cont = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println("El numero " + num + " es primo");
		} else {
			System.out.println("El numero " + num + " no es primo");
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
