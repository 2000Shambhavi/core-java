package com.xworkz.abstraction.user;
import com.xworkz.abstraction.app.*;

public abstract class ViratKohli implements SmartWatch {
	private SmartWatch watch;
	 public ViratKohli(SmartWatch watch) {
		 this.watch=watch;
	 }
	 public void showTime() {
		 if (watch!=null) {
		 System.out.println("watch working, can hear music...");
		 this.watch.music();
	 }
	 else {
		 System.out.println("watch not working, cant hear music...");
	 }
}
}
