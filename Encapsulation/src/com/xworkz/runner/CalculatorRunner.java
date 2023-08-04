package com.xworkz.runner;

public class CalculatorRunner {

	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator);
		calculator.setPrice(1000);
		calculator.setType("Scientfic");
		calculator.setColor("Black");
		calculator.setBrand("Casio");
		calculator.setPoweredBy("Solar");
		
		System.out.println(calculator);
		
	}	
	}
