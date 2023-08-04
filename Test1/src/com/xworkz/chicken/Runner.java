package com.xworkz.chicken;

public class Runner {

	public static void main(String[] args) {

		System.out.println("invoking main in Runner");
	    Chicken chicken= new Chicken (400,"HSR");
		chicken.printInfo();
		
		FarmChicken formchicken = new FarmChicken (500,"Mudhol",4,"Ranjita");
		formchicken.printInfo();
		
		BroilerChicken broilerchicken= new BroilerChicken (500,"Mudhol",4,"Ranjita",false,2.4f);
		broilerchicken.printInfo();
	}

}
