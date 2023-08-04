package com.xworkz.abstraction;

public class Fashion3 extends Fashion{
	
	@Override
	public void design() {
		System.out.println("Design Polka Dot Sarees");
	}
	
	@Override
	public String getPerfectMaterial() {
		System.out.println("Satin Silk");
		return "Satin Silk";
	}

}
