public class Chair{
	int numberOfPersons;
	String cityName;
	int totalPopulation;
	float humidity;
	char gender;
	
	public Chair()
	{
		System.out.println("default constructor");
		System.out.println(numberOfPersons);
		System.out.println(totalPopulation);
		System.out.println(cityName);
	}
	
	
	public Chair(int numberOfPersons1 , String cityName1 , int totalPopulation1, float humidity1,char gender1)
	{
		System.out.println("parametrised constructor");
		numberOfPersons = numberOfPersons1;
		cityName = cityName1;
		totalPopulation=totalPopulation1;
		humidity = humidity1;
		gender = gender1;
		
	}
	
	public static void main(String[] args)
	{
		new Chair();
		System.out.println("**********************");
		Chair chair = new Chair(10 , "Belagavi" , 50 , 25.2f , 'f');
		System.out.println(chair.numberOfPersons);
		System.out.println(chair.cityName);
		System.out.println(chair.totalPopulation);
		System.out.println(chair.humidity);
		System.out.println(chair.gender);
	}
}