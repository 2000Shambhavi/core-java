package com.xworkz.app;

public class Bank implements BankRules {

	@Override
	public void getLoan() {
		System.out.println("invoking Loan");
	}

	@Override
	public void getPassbook() {
		System.out.println("invoking Passbook");
		
	}

}
