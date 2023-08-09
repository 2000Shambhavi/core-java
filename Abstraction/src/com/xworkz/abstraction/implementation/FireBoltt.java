package com.xworkz.abstraction.implementation;
import com.xworkz.abstraction.app.*;

public class FireBoltt implements SmartWatch {

	@Override
	public boolean music() {
		System.out.println("invoking music");
		return true;
	}

	@Override
	public void print() {
		System.out.println("invoking Print");
		
	}

}
