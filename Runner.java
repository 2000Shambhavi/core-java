public class Runner{
	public static void main (String[] args){
		Television television=new Television(833,"1080p","LCD","Sony Bravia","Charcoal");
		System.out.println(television.resolution);
		
		Television television1=new Television(700,"720p","LED","Sony Xperia","Black");
		System.out.println(television1.resolution);
		
		Television television2=new Television(850,"900p","LED","Sony X20","White");
		System.out.println(television2.resolution);
		
		Television television3=new Television(550,"360p","LED","Sony X10","Grey");
		System.out.println(television3.resolution);
		
		Television television4=new Television(430,"280p","LED","Sony 20s","Blue");
		System.out.println(television4.resolution);
		
	}
}
		class Television{
		static String brand;
		int screenSize;
		String resolution;
		String screenType;
		String model;
		String color;
			static{
			System.out.println("static Block");
			brand="Sony";
			}
			public Television(int sreenSize,String resolution,String screeTtype,String model,String color){
			this.screenSize=screenSize;
			this.resolution=resolution;
			this.screenType=screenType;
			this.model=model;
			this.color=color;
			}
	}
 