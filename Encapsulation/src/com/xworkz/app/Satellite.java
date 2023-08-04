package com.xworkz.app;
	public class Satellite {
		
		private  float bandWidth;
		private int distance;
		private int  cost;
		private String configuration;
		private  boolean propagationDelay;
		
	 @Override
	 public String toString() {
			return " bandWidth " + this.bandWidth +" distance " + this.distance +" cost " + this.cost +" configuration " + this.configuration + "propagationDelay" + this.propagationDelay;
	 }		
			public float getbandWidth (){
				return this.bandWidth;	
			}
			
			public int getdistance(){
				return this.distance;	
			}
			
			public int getcost (){
				return this.cost;	
			}
			
			public String getconfiguration (){
				return this. configuration;	
			}
			
			public boolean getpropagationDelay (){
				return this.propagationDelay;	
			}
			
			//setter
			public void setbandWidth(float bandWidth) {
				this.bandWidth=bandWidth; 
			}
		
			public void setcost(int cost) {
				this.cost=cost;
			}
			public void setdistance(int distance) {
				this.distance=distance;
			}
			public void setconfiguration(String configuration) {
				this.configuration=configuration;
			}
			
			public void setpropagationDelay(boolean propagationDelay) {
				this.propagationDelay=propagationDelay;
			}
	}

