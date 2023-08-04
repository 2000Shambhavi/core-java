package com.xworkz.app;
	public class Grinder {
		
		private int price;
		private String type;
		private String color;
		private String brand;
		private String poweredBy;

		@Override
		public String toString() {
			return " price " + this.price +" type " + this.type + " color " + this.color +" brand " + this.brand +
					" poweredBy " + this.poweredBy;
	}
	//getter
		public int getPrice() {
			return this.price;
		}
		
		public String getType() {
			return this.type;
		}
		
		public String getColor() {
			return this.color;
		}
		
		public String getBrand() {
			return this.brand;
		}
		
		public String getpoweredBy() {
			return this.poweredBy;
		}
		
		//setter
		public void setPrice(int price) {
			this.price=price; 
		}
		public void setType(String type) {
			this.type=type;
		}
		public void setColor(String color) {
			this.color=color;
		}
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public void setPoweredBy(String poweredBy) {
			this.poweredBy=poweredBy;
		}
		

	}
