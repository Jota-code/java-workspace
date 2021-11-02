package es.curso.model.repository;

import java.util.ArrayList;
import java.util.List;

import es.curso.model.entity.Game;

public class GameDAO {

	public GameDAO() {

	}

	public List<Game> list() {
		List<Game> gameList = new ArrayList<Game>();

		Game g = new Game();
		g.setId(1);
		g.setName("ASSASINS CREED II");
		g.setCompany("BugiSoft");
		g.setScoreAverage(9.1f);

		gameList.add(g);

		g = new Game();
		g.setId(2);
		g.setName("GTA San Andreas");
		g.setCompany("RockStar Games");
		g.setScoreAverage(9.5f);

		gameList.add(g);

		g = new Game();
		g.setId(3);
		g.setName("MARVEL'S Spider Man");
		g.setCompany("Sony");
		g.setScoreAverage(8.7f);

		gameList.add(g);

		return gameList;
	}

	public Game findById(int id) {
		if (id == 1) {
			Game g = new Game();
			g.setId(1);
			g.setName("ASSASINS CREED II");
			g.setCompany("BugiSoft");
			g.setScoreAverage(9.1f);
			return g;
		} else if (id == 2) {
			Game g = new Game();
			g.setId(2);
			g.setName("GTA San Andreas");
			g.setCompany("RockStar Games");
			g.setScoreAverage(9.5f);
			return g;
		} else if (id == 3) {
			Game g = new Game();
			g.setId(3);
			g.setName("MARVEL'S Spider Man");
			g.setCompany("Sony");
			g.setScoreAverage(8.7f);
			return g;
		} else {
			return null;
		}

	}

}
