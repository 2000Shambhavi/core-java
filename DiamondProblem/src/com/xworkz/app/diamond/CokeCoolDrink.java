package com.xworkz.app.diamond;

public interface CokeCoolDrink extends CoolDrinks {
	default public void cool() {
		System.out.println("invoking cool");
	}
}
