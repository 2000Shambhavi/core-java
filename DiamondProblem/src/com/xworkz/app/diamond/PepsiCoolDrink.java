package com.xworkz.app.diamond;

public interface PepsiCoolDrink extends CoolDrinks{
	
	default public void cool() {
		System.out.println("invoking cool");
	
	}
}
