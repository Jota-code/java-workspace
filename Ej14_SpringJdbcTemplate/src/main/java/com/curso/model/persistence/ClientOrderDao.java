package com.curso.model.persistence;
import java.util.List;

import com.curso.model.entity.Order;

public interface ClientOrderDao {
	
	int addOrderToClient(int id);
	List<Order> clientOrders(int id);

}
