package com.xworkz.app;

	public class Tap {

		private int price;
		private String length;
		private String type ;
		private String color;
		private String madeOf;
		
		public String toString() {
			return " price " + this.price +" length " + this.length + " type " + this.type +" color " + this. color + " madeOf " + this.madeOf;
		}
		
		//getter
		public int getPrice(){
			return this.price;	
		}
		public String getLength() {
			return this.length;
		}
		
		public String getType() {
			return this.type;
			
		}
		public String getColor() {
			return this.color;	
		}
		public String getMadeOf() {
			return this.madeOf;
		}
		
		
		//setter
		public void setPrice(int price) {
			this.price=price; 
		}
		public void setLength(String length) {
			this.length=length;
		}
		public void setType(String type ) {
			this.type=type;
		}
		public void setColor(String color) {
			this.color=color;
		}
		public void setMadeOf(String madeOf) {
			this.madeOf=madeOf;
		}
	}
