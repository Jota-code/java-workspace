package es.babel.curso.model.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.babel.curso.model.entity.Game;
import es.babel.curso.model.repository.GameRepository;
import es.babel.curso.model.service.GameService;

@Service
public class GameServiceJPA implements GameService {

	@Autowired
	private GameRepository gameRepo;

	@Override
	public List<Game> listAll() {
		return gameRepo.findAll();
	}

	@Override
	public Game findGameById(int id) {
		return gameRepo.findById(id).orElse(null);
	}

	@Override
	public List<Game> findByCompanyName(String companyName) {
		return gameRepo.findByCompanyName(companyName);
	}

	@Override
	public List<Game> findByName(String name) {
		return gameRepo.findByName(name);
	}

	@Override
	@Transactional
	public void addModifyGame(Game g) {

		if (gameRepo.findById(g.getId()).isPresent()) {
			gameRepo.save(g);
			System.out.println("Game succesfully modified");
		} else {
			gameRepo.save(g);
			System.out.println("Game succesfully added");
		}

	}

	@Override
	@Transactional
	public void deleteGame(int id) {
		gameRepo.deleteById(id);
	}

}
