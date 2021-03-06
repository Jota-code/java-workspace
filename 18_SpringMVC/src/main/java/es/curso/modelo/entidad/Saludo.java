package es.curso.modelo.entidad;

//https://www.baeldung.com/spring-mvc-session-attributes
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
//@Scope("session")
@SessionScope
public class Saludo {
	private List<String> listaSaludos = new ArrayList<>();

	public List<String> getListaSaludos() {
		return listaSaludos;
	}

	public void setListaSaludos(List<String> listaSaludos) {
		this.listaSaludos = listaSaludos;
	}
	
	
}
