//Method overloading
public class Institute{

	public static void main (String[] args){
	
	int returnedarea=area(18); // Method 1 calling method with int value1
	System.out.println(returnedarea);
	
	int returnedarea1=area (5,12);//calling method with int value1,int value2
	System.out.println(returnedarea1);
	
	float returned1getTemperature = getTemperature(3.0f,8.9f);//calling method with float value1, float value2
	System.out.println(returned1getTemperature);
		
	float returned1getTemperature1 = getTemperature(40, 4.7f);//calling method with int value1, float value2
	System.out.println(returned1getTemperature1);
	
	double getResult= getResult(64,(byte)21);	//calling method with int value1, double value2
	System.out.println(getResult);	
		
    double getResult1= getResult((short)30, 60.2d);	 //calling method with double value1, int value2
	System.out.println(getResult1);	
		
	int mobileNumber=mobileNumber(23,6);// Method 2 calling method with int n1,int n2
	System.out.println(mobileNumber);	
		
	int mobileNumber1= mobileNumber(34);  //calling method with int n1
	System.out.println(mobileNumber1);	
		
	int isPositive =isPositive(3,6);    //calling method with int num1,int num2
	System.out.println(isPositive);
		
		
	int isPositive1 =isPositive(8,8d);   //calling method with int short num1,int num2
	System.out.println(isPositive1);	
		
	int isPositive2 =isPositive((short)49,30);    //calling method with double s1, int s2
	System.out.println(isPositive2);	
		
	int isPositive3 =isPositive(45,(short)30);    //calling method with int s1, double s2
	System.out.println(isPositive3);	
		
	int totalMarks=totalMarks(40,53);  //Method 3 calling method with int sheet1,int sheet2
	System.out.println(totalMarks);	
		
	int totalMarks1 =totalMarks(80);   //calling method with int sheet1
	System.out.println(totalMarks1);	
		
	int scoreOfMatch= scoreOfMatch(47,27);  //calling method with int value1,int value2
	System.out.println(scoreOfMatch);	
		
	int scoreOfMatch1= scoreOfMatch(25,(short)50); //calling method with int value1,short value2
	System.out.println(scoreOfMatch1);	
		
	float cgpaOfStudent= cgpaOfStudent (7.0f, 35);  //calling method with float cgpa1, int cgpa2
	System.out.println(cgpaOfStudent);	
		
	float cgpaOfStudent1= cgpaOfStudent(10, 3.5f);	//calling method with int cgpa1,float cgpa2
	System.out.println(cgpaOfStudent1);
	}

	
// changingthe parameters
	public static int area(int value1){
	return value1*value1;
	}
	public static int area(int value1,int value2){
	return value1*value2;
}
// changing the data types
	public static float getTemperature(float value1, float value2){
		return value1;
	}
	public static float getTemperature(int value1, float value2){
		return value2;
	}
// changing order of parameters
	public static double getResult(int value1,double value2){
	return value2;	
	}
	public static double getResult1(double value1,int value2){
		return value1;
	}
	
	
	
	
    public static int mobileNumber(int n1,int n2){
	return n2;
}
	public static int mobileNumber(int n1){ 
	return n1;
}
// changing the data types
   public static int isPositive( int num1, int num2){
   return num1;
   }
	public static int isPositive( short num1, int num2){
	return num2;
   }
// changing order of parameters
	public static int isPositive(double s1 ,int s2){
	return s2;
	}
    public static int isPositive(int s1 ,double s2){
	return s1;
	}

	
	
// changing the parameters
	public static int totalMarks(int sheet1,int sheet2){
		return sheet1;
	}
	public static int totalMarks(int sheet1){
		return sheet1;
	}
// changing the data types
	public static int scoreOfMatch(int value1,int value2){
	return value1;
	}
	public static int scoreOfMatch(int value1,short value2){
	return value2;
	}
// changing order of parameters
    public static float cgpaOfStudent (float cgpa1, int cgpa2){	
	return cgpa1;
	}
	public static float cgpaOfStudent(int cgpa1, float cgpa2){	
	return cgpa2;
	}
}