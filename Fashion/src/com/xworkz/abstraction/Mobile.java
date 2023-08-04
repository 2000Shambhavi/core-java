package com.xworkz.abstraction;

public abstract class Mobile {
	public abstract void processor();
	public abstract String getBrandName();
	public final int getPrice() {
		return 0;
	}
}
