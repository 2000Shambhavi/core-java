package com.xworkz.app;

public class Company implements CompanyRules {

	@Override
	public void getId() {
		System.out.println("invoking Id");
		
	}

	@Override
	public void getLaptop() {
		System.out.println("invoking Laptop");
		
	}

}
