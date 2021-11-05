package es.babel.curso.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.babel.curso.model.entity.Game;

public interface GameRepository extends JpaRepository<Game, Integer>{
	List<Game> findByCompanyName(String companyName);
	List<Game> findByName(String name);
}
