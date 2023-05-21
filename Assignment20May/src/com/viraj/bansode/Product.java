package com.viraj.bansode;

public class Product {
	
	private String name;
	private String place;
	private String color;
	private int warranty;
	
	public Product() {
	}
	
	public Product(String name, String place, String color, int warranty) {
		super();
		this.name = name;
		this.place = place;
		this.color = color;
		this.warranty = warranty;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public String getPlace() {
		return place;
	}

	public int getWarranty() {
		return warranty;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", place=" + place + ", color=" + color + ", warranty=" + warranty + "]";
	}


}
