package com.xworkz.app;

public class Metro implements MetroRules {
	
		@Override
		public void getTicket() {
			System.out.println("invoking Ticket");
			
		}

		@Override
		public void getReach() {
			System.out.println("invoking Reach");
			
		}
	}

