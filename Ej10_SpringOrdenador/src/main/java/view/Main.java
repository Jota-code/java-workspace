package view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.entity.Computer;

public class Main {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		context = new ClassPathXmlApplicationContext("AppContext.xml");
		
		Computer computer = context.getBean("computer", Computer.class);
		
		System.out.println(computer);
	}

	private static void showComputerData(int id) {
		// TODO Auto-generated method stub
		
	}

}
