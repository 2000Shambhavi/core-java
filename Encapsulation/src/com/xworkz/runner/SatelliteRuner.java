package com.xworkz.runner;
	public class SatelliteRunner {

		public static void main(String [] args) {
			Satellite satellite = new Satellite();
			System.out.println(satellite);
			
			satellite.setbandWidth(200.0f);
			satellite.setdistance(200);
			satellite.setcost(2000);
			satellite.setconfiguration("2500s");
			satellite.setpropagationDelay(false);
			
			System.out.println(satellite);
		}
	}
