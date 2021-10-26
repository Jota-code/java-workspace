package com.curso.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.curso" })
public class Config {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");// MySQL 8
		dataSource.setUrl(
				"jdbc:mysql://localhost:3306/jdbcTemplate?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("");

		// Configuracion para H2
		/*
		 * dataSource.setDriverClassName("org.h2.Driver");
		 * dataSource.setUrl("jdbc:h2:file:c:/h2/jdbcTemplate");
		 * dataSource.setUsername("sa"); dataSource.setPassword("");
		 */
		return dataSource;
	}

	// Este sera el objeto que usemos para hacer las queries contra la BBDD
	// "JdbcTemplate"
	// Le pasamos el objeto DataSource que creamos en el anterior metodos
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
