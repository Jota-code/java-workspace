package es.curso.model.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import es.curso.model.entity.Car;
import es.curso.model.repository.CarDAO;

@Repository
public class CarDaoJPA implements CarDAO {

	// Para inyectarle el objeto entity manager no podemos usar la anotacion
	// @Autowired ya que no hay un objeto de tipo EntityManager en mi contexto
	// de spring. El objeto que tengo dado de alta es un objeto de tipo
	// EntityManagerFactory. Para inyectar un objeto de tipo EntityManager
	// a partir de un objeto EntityManagerFactory, usaremos la anotacion
	// @PersistenceContext
	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean insert(Car c) {
		try {
			em.persist(c);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean remove(String plate) {
		try {
			Car c = em.find(Car.class, plate);
			em.remove(c);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean modify(Car c) {
		try {
			em.merge(c);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Car findByPlate(String plate) {
		return em.find(Car.class, plate);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Car> list() {
		return em.createQuery("FROM Car c").getResultList();
	}

}
