package com.xworkz.abstraction.implementation;
import com.xworkz.abstraction.app.*;

public class HPLaptop implements Laptop {
	@Override
	public Boolean display() {
		System.out.println("invoking the HPlaptop");		
		return true;

}
}