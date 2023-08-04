package com.xworkz.app;

public class Headset {
	
		private int price;
		private String brand;
		private String color;
		private boolean isWireless;
		private int volume;
		@Override
		public String toString() {
			return " price " + this.price +" brand " + this.brand +" color " + this.color +" isWireless " + this.isWireless +
					" volume " + this.volume;
		}
		//getter
		public int getPrice(){
			return this.price;	
		}
		public String getBrand() {
			return this.brand;
		}
		public String getColor() {
			return this.color;
			
		}
		public boolean getIsWireless() {
			return this.isWireless;
		}
		public int getVolume() {
			return this.volume;
		}
		//setter
		public void setPrice(int price) {
			this.price=price; 
		}
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public void setColor(String color) {
			this.color=color;
		}
		public void setIsWireless(boolean isWireless) {
			this.isWireless=isWireless;
		}
		public void setVolume(int volume) {
			this.volume=volume;
		}
		

}
