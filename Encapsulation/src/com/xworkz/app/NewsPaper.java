package com.xworkz.app;

public class NewsPaper {
	private int price;
	private float weight;
	private String language;
	private String name;


	@Override
	public String toString() {
		return " price " + this.price + " weight " + this.weight  + " language " + this.language + " name "  +  this.name ;
	}
	//getter
	public int getPrice() {
		return this.price;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public String getName() {
		return this.name;
	}
	
	//setter
	
	public void setPrice(int price) {
		this.price=price; 
	}
	
	public void setWeight(float weight) {
		this.weight=weight; 
	}
	
	public void setLanguage(String language) {
		this.language=language; 
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
}
