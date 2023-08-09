package com.xworkz.abstraction.user;
import com.xworkz.abstraction.app.*;

public abstract class Anusha implements Elevator {
	private Elevator elevator;
	 public Anusha(Elevator elevator) {
		 this.elevator=elevator;
	 }
	 public void carrypeople() {
		 if (elevator!=null) {
		 System.out.println("elevator working, can carry luggage...");
		 this.elevator.carryLuggage();
	 }
	 else {
		 System.out.println("elevator not working,can't carry luggage...");
	 }
}
}
