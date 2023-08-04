package com.xworkz.runner;
public class HelmetRunner {
	public static void main(String[] args) {
		Helmet helmet = new Helmet();
		System.out.println(helmet);
		helmet.setPrice(2050);
		helmet.setBrand("MLG BobberMotorbike");
		helmet.setColor("Matt Black");
		helmet.setIsForMen(false);
		helmet.setType("Open Face");
		
		System.out.println(helmet);
		
		}
	

	}
