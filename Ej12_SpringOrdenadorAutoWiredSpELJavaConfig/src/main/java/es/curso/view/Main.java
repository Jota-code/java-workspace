package es.curso.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.cfg.SpringConfig;
import es.curso.model.entity.Computer;
import es.curso.model.persistence.ComputerDao;
import es.curso.util.Util;

public class Main {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Computer computer = context.getBean("computer", Computer.class);
		
		System.out.println(computer);
		System.out.println(computer.calculateComponentsPrice());
		
		System.out.println(Util.generateRandomBrands());
		
		int printStatus = ComputerDao.printComputerInFile(computer);
		if(printStatus == 1)	{
			System.out.println("Se ha introducido el ordenador en un fichero llamado computer.txt");
		}
		
	}

	private static void showComputerData(int id) {
		// TODO Auto-generated method stub
		
	}

}
