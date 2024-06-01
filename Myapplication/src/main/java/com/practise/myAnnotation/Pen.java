package com.practise.myAnnotation;

public class Pen {

	private String type;
	private String color;
	private double price;
	
	public Pen() {
		super();
	}

	public Pen(String type, String color, double price) {
		super();
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [type=" + type + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
