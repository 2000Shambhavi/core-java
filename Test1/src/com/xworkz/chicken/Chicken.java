package com.xworkz.chicken;

public class Chicken {
	int price;
	String location;
	public Chicken(int price,String location)
	{
		super();
		this.price=price;
		this.location=location;
		System.out.println("ivoking int, String in chicken");
	}
	void printInfo() {
		System.out.println("invoking printInfo in chicken..");
		System.out.println("this.price");
		System.out.println("this.location");
	}
}
