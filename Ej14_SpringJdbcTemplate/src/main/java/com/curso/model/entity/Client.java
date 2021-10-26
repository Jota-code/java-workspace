package com.curso.model.entity;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Client {

	private int id;
	private String name;
	private int age;
	private List<ClientOrder> orderList;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String name, int age, List<ClientOrder> orderList) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.orderList = orderList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<ClientOrder> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<ClientOrder> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", age=" + age + ", orderList=" + orderList + "]";
	}

}
