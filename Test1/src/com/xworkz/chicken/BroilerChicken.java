package com.xworkz.chicken;

public class BroilerChicken extends FarmChicken {
	boolean isAlive;
	float weight;
	
	public BroilerChicken(int price, String location, int noOfDays, String careTaker, boolean isAlive, float weight) {
		super(price, location, noOfDays, careTaker);
		this.isAlive = isAlive;
		this.weight = weight;
		System.out.println("invoking int,string,boolean,float in broilerChicken");
	}
	
@Override
	void printInfo(){
		System.out.println("running prinInfo in farmchicken...");
		super.printInfo();
		System.out.println(this.isAlive);
		System.out.println(this.weight);
	}	
}
