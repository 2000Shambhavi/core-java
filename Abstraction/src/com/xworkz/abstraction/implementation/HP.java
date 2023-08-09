package com.xworkz.abstraction.implementation;
import com.xworkz.abstraction.app.*;

public class HP implements PrintingMachine {
	
		@Override
		public void print() {
			System.out.println("invoking the print in printing machine");
			return;
		}

	}

