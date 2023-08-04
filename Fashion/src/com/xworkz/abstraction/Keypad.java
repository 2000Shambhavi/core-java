package com.xworkz.abstraction;

public class Keypad extends  Mobile {
	@Override
	public void processor() {
		System.out.println("os");
	}
	@Override
	public String getBrandName() {
		System.out.println("samsung");
		return "samsung";
	}

}
