package com.mindtree.entity;

public class Product {
	private int id;
	private String name;
	private int quantity;
	private double price;

	public Product() {
		super();

	}

	public Product(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice_per_unit() {
		return price;
	}

	public void setPrice_per_unit(double price) {
		this.price = price;
	}

}
