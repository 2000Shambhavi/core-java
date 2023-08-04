package com.xworkz.abstraction;

public class SLV3 extends Rocket {
	@Override
	public void budget() {
		System.out.println ("Budget 20 cr");
	}
	
	@Override
	public String getExpectedTime() {
		System.out.println("9 months");	
		return "9 months";
	}
}
