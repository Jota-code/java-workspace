package com.ejercicioHilosPrimosLambda.threads;

public class Hilo {
	
	private int number;
	private String name;
	
	public Hilo(String name,int number)	{
		this.name = name;
		this.number = number;
	}

	private Runnable thread = () ->	{
		System.out.println("Ejecutando el hilo "+Thread.currentThread().getName());

		long time = System.nanoTime();
		
		int cont = 0;
		for (int i = 1; i <= this.number; i++) {
			if (this.number % i == 0) {
				cont++;
			}
			if(cont>2)	{
				break;
			}
		}
		if (cont == 2) {
			System.out.println("El numero " + this.number + " es primo y ha tardado "+(System.nanoTime()-time)+" nanosegundos");
		} else {
			System.out.println("El numero " + this.number + " no es primo y ha tardado "+(System.nanoTime()-time)+ " nanosegundos");
		}
	};

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Runnable getThread() {
		return thread;
	}

	public void setThread(Runnable thread) {
		this.thread = thread;
	}

	

}
