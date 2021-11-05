package es.babel.curso.model.service;

import java.util.List;

import es.babel.curso.model.entity.Game;

public interface GameService {
	
	List<Game> listAll();
	Game findGameById(int id);
	void addModifyGame(Game g);
	void deleteGame(int id);
	List<Game> findByCompanyName(String companyName);
	List<Game> findByName(String name);
	
}
