package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.app.*;
import com.xworkz.abstraction.implementation.LG;

public class WaterPurifierRunner {

	public static void main(String[] args) {
		WaterPurifier purifier = new LG();
		purifier.filter();
	}
}
