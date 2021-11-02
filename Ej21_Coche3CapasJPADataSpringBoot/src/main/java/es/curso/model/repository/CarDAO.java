package es.curso.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.curso.model.entity.Car;

@Repository
public interface CarDAO extends JpaRepository<Car, String>{

}
