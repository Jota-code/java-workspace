package com.ejercicios.hilosPrimos.main;

import java.util.Scanner;

import com.ejercicios.hilosPrimos.hilos.Hilo;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Hilo h1, h2, h3;
		int num1, num2, num3;

		System.out.println("Introduce 3 numeros y te diré si son primos");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		num3 = teclado.nextInt();

		teclado.nextLine();

		h1 = new Hilo("Hilo del numero 1", num1);
		h2 = new Hilo("Hilo del numero 2", num2);
		h3 = new Hilo("Hilo del numero 3", num3);
		
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("La ejecucion del hilo main ha terminado");

		teclado.close();

	}

}
