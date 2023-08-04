package com.xworkz.abstraction;

public class WirelessConnections extends Car {
	@Override
	public void budget(){
		System.out.println ("Budget 50 cr");
	}
	
	@Override
	public String getExpectedTime() {
		System.out.println("6 months");	
		return "6 month";
	}


}
