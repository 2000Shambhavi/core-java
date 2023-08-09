package com.xworkz.abstraction.user;
import com.xworkz.abstraction.app.*;

public abstract class SachinT implements WaterPurifier{
	private WaterPurifier purifier;
	 public SachinT(WaterPurifier purifier) {
		 this.purifier=purifier;
	 }
	 public void purifyWater() {
		 if (purifier!=null) {
		 System.out.println("purifier working, can purify...");
		 this.purifier.filter();
	 }
	 else {
		 System.out.println("purifier not working,cant purify...");
	 }
}
}