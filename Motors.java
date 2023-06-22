public class Motors {
	public static void main(String args[]){
		char returnedVowel=vowel();
		System.out.println("a");
		int addedValue=add();
		System.out.println("30");
		boolean returnedNumber=checkTheNumber();
		System.out.println("true");
		long returnedValue=carNumber();
		System.out.println("8753381");
		float returnedMileage=carMileage();
		System.out.println("27.0");
		double returnedPrice=carPrice();
		System.out.println("4089562.999999");
		String returnedName=carOwnerName();
		System.out.println("Shambhavi");
		short returnedNum=number();
		System.out.println(100);
		
	}
	
	public static char vowel(){
		System.out.println("methodstarts");
		
		return 'a';
	}
	
	public static int add(){
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public static boolean checkTheNumber(){
		int number=10;
		if(number>=0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static long carNumber(){
		long number= 875338l;
		if (number>=100000){
			return 8753381;
		}
		else{
			return 0;
		}
	
	}
	
	public static float carMileage(){
		float mileage=27.0f;
		if(mileage>=10){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static double carPrice(){
		double price=4089562.999999d;
		return 1;
	}
	public static String carOwnerName(){
		String name="Shambhavi";
		return "Shambhavi";
	}
	public static short number(){
		short num=100;
		return 1;
	}
}
	