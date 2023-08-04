public class Television{
public static void main(String args[]){
	String brand=("Sony");
	String screenSize=("179");
	String resolution=("1080p");
	String operatingSystem=("Android OS");
	String screenType=("flat-panel LCD");
	String speaker=("DolbyDigital");
	String design=("NeoQUALED");
	String model=("Sony Bravia");
	String color=("Black");
	String wattage=("90-170W");
	String modelYear=("2020");
	
	String powerConsumption=new String("0.2w/hr");
	String panel=new String("LCD");
	String controlMethod=new String("Remote");
	String processor=new String("Gen1 4nm");
	String localDimming=new String("FullArray");
	String connectivity=new String("Bluetooth,Wifi");
	String ports=new String("19-pin plug");
	String height=new String("833mm");
	String weight=new String("10.8kg");
	
	String returenedValue= brand.toUpperCase();
	System.out.println(returenedValue);
	
	String returnedResult= brand.toLowerCase();
	System.out.println(returnedResult);
	
	boolean result= brand.startsWith("Sony");
	System.out.println(result);
	
	boolean newValue= model.endsWith("Xperia");
	System.out.println(newValue);
	
	String replacedValue=color.replace('C','b');
	System.out.println(replacedValue);
}
}
	

	
