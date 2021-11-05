package es.babel.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.babel.curso.model.entity.Game;
import es.babel.curso.model.service.GameService;

@RestController
@RequestMapping("/api")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping(path = "/games", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Game>> listAllGames(
			@RequestParam(name = "company_name", required = false) String companyName,
			@RequestParam(name = "name", required = false) String name) {
		List<Game> GameList = null;

		if (companyName != null) {
			System.out.println("Listing games by company: " + companyName);
			GameList = gameService.findByCompanyName(companyName);
		} else if(name!=null)	{
			System.out.println("Listing games by name: " + name);
			GameList = gameService.findByName(name);
		}
		
		else {
			System.out.println("Listing all games");
			GameList = gameService.listAll();
		}
		System.out.println(GameList);
		if (GameList != null) {
			return new ResponseEntity<List<Game>>(GameList, HttpStatus.OK);// 200 OK
		} else {
			return new ResponseEntity<List<Game>>(HttpStatus.NOT_FOUND);// 404 NOT FOUND
		}

	}

	@GetMapping(path = "/games/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Game> getGameById(@PathVariable("id") int id) {
		System.out.println("Searching game with id " + id);
		Game g = gameService.findGameById(id);
		if (g != null) {
			return new ResponseEntity<Game>(g, HttpStatus.OK);// 200 OK
		} else {
			return new ResponseEntity<Game>(HttpStatus.NOT_FOUND);// 404 NOT FOUND
		}
	}

	@PostMapping(path = "/games", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Game> addGame(@RequestBody Game g) {
		System.out.println("Adding new game...");
		if (g != null) {
			gameService.addModifyGame(g);
			return new ResponseEntity<Game>(g, HttpStatus.OK);// 200 OK
		} else {
			System.out.println("The game is null");
			return new ResponseEntity<Game>(HttpStatus.NOT_FOUND);// 404 NOT FOUND
		}

	}

}
