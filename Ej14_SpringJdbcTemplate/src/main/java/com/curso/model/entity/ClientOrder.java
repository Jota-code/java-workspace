package com.curso.model.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClientOrder {

	private int idClientOrder;
	private Client client;
	private Order order;

	public ClientOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientOrder(int idClientOrder, Client client, Order order) {
		super();
		this.idClientOrder = idClientOrder;
		this.client = client;
		this.order = order;
	}

	public int getIdClientOrder() {
		return idClientOrder;
	}

	public void setIdClientOrder(int idClientOrder) {
		this.idClientOrder = idClientOrder;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ClientOrder [idClientOrder=" + idClientOrder + ", client=" + client + ", order=" + order + "]";
	}

}
