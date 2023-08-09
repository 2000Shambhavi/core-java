package com.xworkz.abstraction.implementation;
import com.xworkz.abstraction.app.WaterPurifier;

public class LG implements WaterPurifier {

	@Override
	public static boolean filter() {
		System.out.println("invoking LG");
		return true;
	}

}
