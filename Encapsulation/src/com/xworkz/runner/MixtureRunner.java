package com.xworkz.runner;

public class MixtureRunner {
	public static void main(String[] args) {
	Mixture mixture = new Mixture();
	System.out.println(mixture);
	mixture.setPrice(300);
	mixture.setBrand("MTR");
	mixture.setColor("red");
	mixture.setCapacity(2.3f);
	mixture.setSpeed(10);
	
	System.out.println(mixture);
	
	}
	}

