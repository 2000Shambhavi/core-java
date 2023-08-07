package com.xworkz.runner;
import com.xworkz.app.Monkey;
import com.xworkz.app.Bangalore;
import com.xworkz.app.Plant;
import com.xworkz.app.Icecream;

public class AllRunner {

	public static void main(String[] args) {
		Monkey monkey = new Monkey("Ranji",25, 4);
		System.out.println("Print info");
		
		Bangalore bangalore = new Bangalore("Malleshwaram","Karnataka", "India");
		System.out.println("Print info");
		
		Plant plant=new Plant("Rose","Red","FloweringPlant");
		System.out.println("Print info");
	
		Icecream icecream=new Icecream("cone", true ,"Chocolate");
		System.out.println("Print info");
	}

}
