package com.xworkz.app;

public class Airport implements AirportRules {

	@Override
	public void getFlight() {
		System.out.println("invoking Flight");
	}

	@Override
	public void getPassport() {
		
		System.out.println("invoking Passport");
	}
	}
