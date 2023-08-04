package com.xworkz.chicken;

public class FarmChicken extends Chicken{
	
	int noOfDays;
	String careTaker;
	
	public FarmChicken(int price, String location, int noOfDays,String careTaker) {
		super(price,location);
		this.noOfDays=noOfDays;
		this.careTaker=careTaker;
		System.out.println("invoking int, String in farmchicken");
	}
@Override
void printInfo() {
	System.out.println("invoking printInfo in farmchicken..");
	System.out.println("this.price");
	System.out.println("this.location");
	System.out.println("this.noOfDays");
	System.out.println("this.careTaker");
}
}
