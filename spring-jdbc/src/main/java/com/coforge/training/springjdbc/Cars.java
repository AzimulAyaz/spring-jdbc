package com.coforge.training.springjdbc;

public class Cars {
	private int id;
    private String name;
    private int price;
    
    //constructor for inserting a new car
	public Cars(String name, int price) { //id is auto increment
		super();
		this.name = name;
		this.price = price;
	}
    
	public Cars(int id, int price) { // Constructor is used for updating the price of a car
		super();
		this.id = id;
		this.price = price;
	}

	public Cars() {
		super();
	}

	public Cars(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
    
}
