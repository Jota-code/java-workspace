package com.curso.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.curso.model.entity.Client;
import com.curso.model.entity.ClientOrder;

public class ClientDaoRowMapper implements RowMapper<Client>{

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client client = new Client();
		client.setId(rs.getInt("ID"));
		client.setName(rs.getString("NAME"));
		client.setAge(rs.getInt("AGE"));
		client.setOrderList((List<ClientOrder>) rs.getObject("ORDER"));
		
		
		return client;
	}

}
