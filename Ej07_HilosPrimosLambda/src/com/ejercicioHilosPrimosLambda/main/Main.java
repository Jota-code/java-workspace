package com.ejercicioHilosPrimosLambda.main;

import java.util.Scanner;

import com.ejercicioHilosPrimosLambda.threads.Hilo;

public class Main {

	public static void main(String[] args) {
		
		Hilo h1,h2,h3;
		Thread t1,t2,t3;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce 3 numeros y te diré si son primos");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		int num3 = teclado.nextInt();

		teclado.nextLine();

		h1 = new Hilo("Hilo del numero 1", num1);
		h2 = new Hilo("Hilo del numero 2", num2);
		h3 = new Hilo("Hilo del numero 3", num3);
		
		t1 = new Thread(h1.getThread());
		t2 = new Thread(h2.getThread());
		t3 = new Thread(h3.getThread());
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println("La ejecucion del hilo main ha terminado");
		
		teclado.close();
	}

}
