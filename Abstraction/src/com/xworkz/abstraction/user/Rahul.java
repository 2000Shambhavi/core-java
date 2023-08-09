package com.xworkz.abstraction.user;
import com.xworkz.abstraction.app.*;

public abstract class Rahul implements Laptop {
	private Laptop laptop;
	public Rahul(Laptop laptop) {
		this.laptop=laptop;
	}
	
	public void Disply() {
		
		if(laptop!= null) {
			System.out.println("laptop working, can display...");
			this.laptop.display();
		}
		else {
			System.err.println("laptop is not working, cannot display..");
		
		}		
	}

}
