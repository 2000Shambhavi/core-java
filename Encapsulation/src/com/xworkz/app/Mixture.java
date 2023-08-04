package com.xworkz.app;

public class Mixture {
	
		private int price;
		private String brand;
		private String color;
		private float capacity;
		private int speed;
		@Override
		public String toString() {
			return " price " + this.price +" brand " + this.brand +" color " + this.color +" capacity " + this.capacity +
					" speed" + this.speed;
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
		public float getCapacity() {
			return this.capacity;
		}
		public int getSpeed() {
			return this.speed;
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
		public void setCapacity(float capacity) {
			this.capacity=capacity;
		}
		public void setSpeed(int speed) {
			this.speed=speed;
		}
		

	}

