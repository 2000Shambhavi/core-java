public class Accessories{
	public static void main(String[] args){
	
	boolean returnedResult=isPrimeNumber(18);
	System.out.println(returnedResult);
	int returnedValue=add(20,10);
	System.out.println(returnedValue);
	boolean returnedName=checkName("Shambhavi B");
	System.out.println(returnedName);
	boolean returnResult=marks(8.5f);
	System.out.println(returnResult);
	int returnProduct=mul(10,8);
	System.out.println(returnProduct);
	boolean returnedAge=marriage(20);
	System.out.println(returnedAge);
	char returnGender=gender("female");
	System.out.println("returnGender");
	boolean returnnumber=adharNumber(1254568l);
	System.out.println(returnnumber);
	double returnvelocity=velocity(2.0d,0.3d);
	System.out.println(returnvelocity);
	}
	
	public static boolean isPrimeNumber(int number){
		
		if(number%2==0){
			System.out.println("is prime number");
			return true;
		}
		else{
			System.out.println("is not prime number");
			return false;
		}
	}
	
	public static int add(int a,int b){
		int c=a+b;
		return c;
		
	}
	
	public static boolean checkName(String name){
		if(name.length()>=5){
			System.out.println("name is valid");
			return true;
		}
		else{
			System.out.println("name is not valid");
			return false;
		}
	}
	
	public static boolean marks(float cgpa){
		if(cgpa>=8.9f){
			System.out.println("pass");
			return true;
		}
		else{
			System.out.println("fail");
			return false;
		}
	}
	
	public static int mul(int d,int e){
		int f=d*e;
		if(f>=2){
			System.out.println("answer is valid");
			return f;
		}
		else{
			System.out.println("answer is not valid");
			return 0;
		}
	}
	
	public static boolean marriage(int age){
		if(age>=18){
			System.out.println("eligible for marriage");
			return true;
		}
		else{
			System.out.println("not eligible");
			return false;
		}
	}
	
	public static char gender(String g){
		if(g == "female"){
			System.out.println("gender is female");
			return 'f';
		}
		else{
			System.out.println("gender is male");
			return 'm';
		}
	}
	
	public static boolean adharNumber(long number){
		if(number>=10){
			System.out.println("number is valid");
			return true;
		}
		else{
			System.out.println("number is invalid");
			return false;
		}
	}
	
	public static double velocity(double d1,double d2){
		if(d1>0.0d){
			System.out.println("velocity is greater than zero");
			return d1;
		}
		else{
			System.out.println("velocity is lesser than zero");
		    return d2;
		}
	}
}