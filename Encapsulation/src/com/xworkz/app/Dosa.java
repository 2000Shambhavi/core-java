package com.xworkz.app;

public class Dosa {

	private int price;
	private String type;
	private boolean isCrispy;
	private String hotelName;
	private String color;
	
	@Override
	public String toString() {
		return " price " + this.price +" type " + this.type + " isCrispy " + this.isCrispy +" hotelName " + this.hotelName +
				" color " + this.color;
	}
	//getter
	public int getPrice(){
		return this.price;	
	}
	public String getType() {
		return this.type;
	}
	public String getIsCrispy() {
		return this.isCrispy;
		
	}
	public float getHotelName() {
		return this.hotelName;
	}
	public int getColor() {
		return this.color;
	}
	
	//setter
	public void setPrice(int price) {
		this.price=price; 
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setIsCrispy(boolean isCrispy) {
		this.isCrispy=isCrispy;
	}
	public void setHotelName(String hotelName) {
		this.hotelName=hotelName;
	}
	public void setColor(String color) {
		this.color=color;
	}
	

}