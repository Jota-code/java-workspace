package es.babel.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.babel.curso.model.entity.Game;
import es.babel.curso.model.service.GameService;

//Esta clase sera el punto de arranque de nuestra aplicacion. 
//Mediante la anotacion @SpringBootApplication le decimos a Spring que:
//1. Busque anotaciones de Spring para dar de alta objetos e inyectar 
//dependencias. Estas clases anotadas deben de estar en este paquete
//o en un paquete hijo
//2. Se autoconfigure la aplicacion, en este caso al ser una aplicacion
//web configurara un Tomcat para desplegarla
//3. Buscara metodos dentro de esta clase anotados con @Bean para
//dar de alta objetos en el contexto de Spring. En este ejemplo
//no daremos ninguno, pero en el cliente si que daremos de alta
//alguno.
@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	GameService gs;

	public static void main(String[] args) {
		System.out.println("Servicio Rest -> Cargando el contexto de Spring...");
		// Mediante el metodo "run" arrancaremos el contexto de Spring
		// y daremos de alta todos los objetos que hayamos configurado
		// en nuestra aplicacion así como sus dependecias con otros
		// objetos.
		SpringApplication.run(Application.class, args);
		System.out.println("Servicio Rest -> Contexto de Spring cargado!");
	}

	@Override
	public void run(String... args) throws Exception {
		Game g = new Game();
		g.setName("AC 1");
		g.setCompanyName("Ubisoft");
		g.setPrice(70);
		g.setAuthor("Montreal");
		g.setScore(8.5);
		gs.addModifyGame(g);
		
	}
}
