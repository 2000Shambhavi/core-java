package com.xworkz.app.diamond;

public class Drinks implements CoolDrinks, CokeCoolDrink, PepsiCoolDrink {

	@Override
	public void cool() {
		CokeCoolDrink.super.cool();
		PepsiCoolDrink.super.cool();
	}
	
}
