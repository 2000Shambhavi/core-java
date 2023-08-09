package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.app.*;
import com.xworkz.abstraction.implementation.*;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		PrintingMachine machine = new HP();
		machine.print();
	}

}
