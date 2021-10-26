package com.curso.model.persistence;

import java.util.List;

import com.curso.model.entity.Client;

public interface ClientDao {
	
	int insert(Client c);
	int delete(int id);
	int modify(Client c);
	Client searchById(int id);
	List<Client> searchByName(String name);
	List<Client> list();

}
