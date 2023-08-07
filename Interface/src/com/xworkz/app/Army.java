package com.xworkz.app;

public class Army implements ArmyRules {

	@Override
	public void getDisipline() {
		System.out.println("invoking Disipline");
	}

	@Override
	public void getUniforms() {
		System.out.println("invoking Uniform");
	}
}