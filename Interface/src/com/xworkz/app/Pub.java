package com.xworkz.app;

public class Pub implements PubRules {

	@Override
	public void getDance() {
		System.out.println("invoking Dance");
		
	}

	@Override
	public void getDrinks() {
		
		System.out.println("invoking Drinks");
	}

}
