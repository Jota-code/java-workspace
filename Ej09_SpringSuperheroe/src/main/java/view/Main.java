package view;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.entity.SuperHero;

public class Main {

	public static ApplicationContext context = null;
	public static Scanner teclado = new Scanner(System.in);
	public static ArrayList<SuperHero> power100SuperHeroesList = null;
	public static ArrayList<SuperHero> flyingSuperHeroesList = null;
	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("AppContext.xml");
		System.out.println("Contexto cargado");

		power100SuperHeroesList = context.getBean("powerSuperHeroesPrototypeList",ArrayList.class);
		flyingSuperHeroesList = context.getBean("flyingSuperHeroesPrototypeList",ArrayList.class);
		int opcion = 0;

		do {
			System.out.println("----------MENU-----------");
			System.out.println("1. Show default super heroes");
			System.out.println("2. Add power 100 super hero to his list");
			System.out.println("3. Add flying super hero to his list");
			System.out.println("4. Show power 100 super heroes list");
			System.out.println("5. Show flying super heroes list");

			opcion = Integer.parseInt(teclado.nextLine());

			switch (opcion) {
			case 1:
				showDefaultHeroes();
				break;
			case 2:
				addPower100SuperHero();
				break;
			case 3:
				addFlyingSuperHero();
				break;
			case 4:
				showPower100SuperHeoes();
				break;
			case 5:
				showFlyingSuperHeroes();
				break;
			case 6:
				break;
			}
		} while (opcion != 6);
		
		teclado.close();
	}

	private static void showFlyingSuperHeroes() {
		for (SuperHero superHero : flyingSuperHeroesList) {
			System.out.println(superHero);
		}
	}

	private static void showPower100SuperHeoes() {
		for (SuperHero superHero : power100SuperHeroesList) {
			System.out.println(superHero);
		}
		
	}

	private static void addFlyingSuperHero() {
		SuperHero flyingSuperHero = context.getBean("superHeroFlyingPrototype",SuperHero.class);
		System.out.println("Type his name");
		String name = teclado.nextLine();
		System.out.println("Type his super power");
		int power = Integer.parseInt(teclado.nextLine());
		
		flyingSuperHero.setSuperHeroName(name);
		flyingSuperHero.setPower(power);
		flyingSuperHeroesList.add(flyingSuperHero);
	}

	private static void addPower100SuperHero() {
		SuperHero power100SuperHero = context.getBean("superHeroPowerPrototype",SuperHero.class);
		System.out.println("Type his name");
		String name = teclado.nextLine();
		System.out.println("Type his super power");
		String superPower = teclado.nextLine();
		
		power100SuperHero.setSuperHeroName(name);
		power100SuperHero.setPowerName(superPower);
		power100SuperHeroesList.add(power100SuperHero);
	}

	private static void showDefaultHeroes() {
		ArrayList<SuperHero> superHeroes = new ArrayList<>();
		SuperHero hulk, spiderMan, captainAmerica;

		hulk = context.getBean("superHeroDefaultHulk", SuperHero.class);
		spiderMan = context.getBean("superHeroDefaultSpiderMan", SuperHero.class);
		captainAmerica = context.getBean("superHeroDefaultCaptainAmerica", SuperHero.class);
		superHeroes.add(hulk);
		superHeroes.add(spiderMan);
		superHeroes.add(captainAmerica);
		
		for (SuperHero superHero : superHeroes) {
			System.out.println(superHero);
		}
		
	}

}
