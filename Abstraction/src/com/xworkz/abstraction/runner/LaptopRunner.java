package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.app.*;
import com.xworkz.abstraction.implementation.*;
public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop laptop = new HPLaptop ();
		laptop.display();
		System.out.println("invoking Display");
	}

}
