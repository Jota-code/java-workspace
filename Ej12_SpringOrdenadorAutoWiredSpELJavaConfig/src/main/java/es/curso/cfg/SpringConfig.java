package es.curso.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.curso.model.persistence.ComputerDao;

public class SpringConfig {

	//Esta clase es la que vamos a usar para dar de alta nuestros objetos y para
	//decirle a Spring que busque anotaciones en nuestro proyecto

	//Para decirle a Spring que esta clase va a ser una clase de configuración
	//usaremos la anotacion @Configuration.

	@Configuration
	//Tambien podemos decirle, una vez que hayamos dicho que es una clase de configuracion
	//Decirle a spring que vaya a buscar anotaciones de beans para dar de alta en el contexto
	//de spring. Podemos poner todos los paquetes que queramos separados por ","
	@ComponentScan(basePackages = {"es.curso"})
	public class ConfiguracionSpring {
		
		//Las clases de configuracion tambien tienen metodos anotados con @Bean
		//Spring ejecutara estos metodos para obtener beans dentro de su contexto.
		
		//Es decir, el siguiente metodo Spring lo ejecutara y el objeto devuelto
		//lo metera dentro del contexto con el "id" igual al nombre del metodo
		
		//<bean id="computerDao" class="computerDao"/>
		@Bean
		public ComputerDao computerDao() {
			ComputerDao computerDao = new ComputerDao();
			
			return computerDao;
		}
	}
	
}
