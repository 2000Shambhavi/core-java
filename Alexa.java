public class Alexa{
	String name;
	String power;
	int bluetoothVersion;
	String batteryLife;
	boolean isWireless;
	AlexaColor color = AlexaColor.Charcoal;
	NumberOfSpeakers speakers=NumberOfSpeakers.ONE;
	public Alexa(String name,String power,int bluetoothVersion,String batteryLife,boolean isWireless){
		this.name=name;
		this.power=power;
		this.bluetoothVersion=bluetoothVersion;
		this.batteryLife=batteryLife;
		this.isWireless=isWireless;
	}
	public static void main(String[] args){
		Alexa alexa = new Alexa("AmazonDot5thGen","4W",5,"4hr",true);
		System.out.println(alexa.name);
		System.out.println(alexa.power);
		System.out.println(alexa.bluetoothVersion);
		System.out.println(alexa.batteryLife);
		System.out.println(alexa.isWireless);
		System.out.println(alexa.color.getValue());
		System.out.println(alexa.speakers.getValue());	
	}
	public String getName(){
		return name;
	}
	public String getPower(){
		return power;
	}
	public int getBluetoothVersion(){
		return bluetoothVersion;
	}
	public String getBatteryLife(){
		return batteryLife;
	}
	public boolean getIsWireless(){
		return isWireless;
	}
	
	
}
enum AlexaColor{
	BLACK("black"),WHITE("white"),CHARCOAL("charcoal");
	String value;
	AlexaColor(String value){
		this.value=value;
	}
	public String getValue(){
		return value;
	}
}
enum NumberOfSpeakers{
	ONE(1),TWO(2),THREE(3);
	int value;
	NumberOfSpeakers(int value){
		this.value=value;
	}
	public int getValue(){
		return value;
	}
	
}