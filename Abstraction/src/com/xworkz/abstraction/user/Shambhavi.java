package com.xworkz.abstraction.user;
import com.xworkz.abstraction.app.*;

public  class Shambhavi implements PrintingMachine {
		private PrintingMachine machine;
		public Shambhavi(PrintingMachine machine) {
			this.machine = machine;
		}
		@SuppressWarnings("unused")
		public void print(){
			Object print = null;
			if(print!=null) {
			System.out.println("machine is working, can print");
				this.machine.print();
				}
			else {
					System.out.println("machine not working");
				}
			
			
		}


}
