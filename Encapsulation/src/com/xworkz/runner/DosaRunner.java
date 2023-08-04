package com.xworkz.runner;

public class DosaRunner {

public static void main(String[] args) {
	Dosa dosa = new Dosa();
	System.out.println(dosa);
	dosa.setPrice(60);
	dosa.setType("Ghee dosa");
	dosa.setIsCrispy(true);
	dosa.setHotelName("Udupi hotel");
	dosa.setColor("Brown");
	
	System.out.println(dosa);
	
	}
}