package com.xworkz.runner;

public class NewsPaperRunner {
	
	public static void main(String [] args) {
		NewsPaper newspaper = new NewsPaper ();
		System.out.println(newspaper);
		newspaper.setPrice(300);
		newspaper.setWeight(3.0f);
		newspaper.setLanguage("Kannada");
		newspaper.setName("Vijay Karnataka");
		
		System.out.println(newspaper);
	}

	}

