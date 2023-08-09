package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.app.*;
import com.xworkz.abstraction.implementation.*;

public class ElevatorRunner {
	public static void main(String[] args) {

	Elevator elevator = new Omega();
	elevator.carryLuggage();
	System.out.println("invoking the luggage..");
}
}