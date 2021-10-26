package com.curso.model.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.curso.model.entity.Client;

@Repository
public class ClientDaoJdbcTemplate implements ClientDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ClientDaoRowMapper clientDaoRowMapper;

	@Override
	public int insert(Client c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modify(Client c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Client searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createClientTable() {
		jdbcTemplate.execute("CREATE TABLE client");
		
	}
}
