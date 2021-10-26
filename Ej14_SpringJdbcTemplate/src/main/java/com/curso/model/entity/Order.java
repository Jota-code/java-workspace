package com.curso.model.entity;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Order {

	private int id;
	private double price;
	private Date date;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, double price, Date date) {
		super();
		this.id = id;
		this.price = price;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", date=" + date + "]";
	}

}
