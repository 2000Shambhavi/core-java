package com.xworkz.app;

	public class Helmet {
		private int price;
		private String brand;
		private String color;
		private boolean isForMen;
		private String type;
		@Override
		public String toString() {
			return " price " + this.price +" brand " + this.brand +" color " + this.color +" isForMen " + this.isForMen +
					" type " + this.type;
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
		public boolean getIsForMen() {
			return this.isForMen;
		}
		public String getType() {
			return this.type;
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
		public void setIsForMen(boolean isForMen) {
			this.isForMen=isForMen;
		}
		public void setType(String type) {
			this.type=type;
		}
		

	}

