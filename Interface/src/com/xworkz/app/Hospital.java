package com.xworkz.app;

public class Hospital implements HospitalRules {

	@Override
	public void getConsulted() {
		System.out.println("invoking Consulted");
	}

	@Override
	public void getDisease() {
		System.out.println("invoking Disease");
		
	}
}