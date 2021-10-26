package com.curso.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.curso.config.Config;
import com.curso.model.persistence.ClientDaoJdbcTemplate;

public class MainCreateTables {
	
	private static ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

	public static void main(String[] args) {
		
		ClientDaoJdbcTemplate clientDao = context.getBean("clientDaoJdbcTemplate",ClientDaoJdbcTemplate.class);
		clientDao.createClientTable();

	}

}
