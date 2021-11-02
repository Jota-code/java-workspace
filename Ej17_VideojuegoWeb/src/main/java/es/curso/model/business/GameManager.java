package es.curso.model.business;

import es.curso.model.repository.GameDAO;

import java.util.List;

import es.curso.model.entity.Game;

public class GameManager {
	
	private GameDAO gameDao;
	
	public List<Game> list()	{
		gameDao = new GameDAO();
		return gameDao.list();
	}
	
	public Game findById(int id)	{
		gameDao = new GameDAO();
		return gameDao.findById(id);
	}

}
