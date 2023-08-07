package com.xworkz.app;

public class Hostel implements HostelRules{

	@Override
	public void getEating() {
		System.out.println("invoking Eating");
	}

	@Override
	public void getWashing() {
		
		System.out.println("invoking Washing");
	}
	

}
