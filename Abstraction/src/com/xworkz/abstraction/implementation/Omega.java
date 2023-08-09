package com.xworkz.abstraction.implementation;
import com.xworkz.abstraction.app.*;

public class Omega implements Elevator {

	@Override
	public boolean carryLuggage() {
		System.out.println("invoking carries luggage");
		return true;
	}

}
