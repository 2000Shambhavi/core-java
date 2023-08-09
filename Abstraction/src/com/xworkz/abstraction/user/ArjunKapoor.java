package com.xworkz.abstraction.user;
import com.xworkz.abstraction.app.*;

	public abstract class ArjunKapoor implements WashingMachine{
		
		private WashingMachine washingmachine;
		public ArjunKapoor(WashingMachine washingmachine) {
			this.washingmachine = washingmachine;
		}
		
		public void Disply() {
			
			if(washingmachine!= null) {
				System.out.println("washingmachine working, can disply...");
				this.washingmachine.display();
			}
			else {
				System.err.println("washingmachine is not working, cannot disply..");
			
			}		
		}

	}
