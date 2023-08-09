package com.xworkz.abstraction.implementation;
import com.xworkz.abstraction.app.*;

public class Samsung implements WashingMachine {
		@Override
	public void display() {
			System.out.println("invoking the display");
		
	}

		public boolean washing() {
			System.out.println("invoking the SamsungWashingMachine");		
			return true;
		}

}

