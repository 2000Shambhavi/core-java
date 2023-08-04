package com.xworkz.runner;

public class GrinderRunner {

		public static void main(String[] args) {
			Grinder grinder = new Grinder();
			System.out.println(grinder);
			
			grinder.setPrice(1500);
			grinder.setType("Butterfly");
			grinder.setColor("Blue");
			grinder.setBrand("Prestige");
			grinder.setPoweredBy("Electricity");
			
			System.out.println(grinder);
			
		}

	}


