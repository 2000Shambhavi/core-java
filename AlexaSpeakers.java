Public class AlexaSpeakers{
	static String brandName;
	static String color;
	static String batteryCapacity;
	static int price;
	static String virtualAssistant;
	static String assistantSupport;
	static String matterSupport;
	static float drivers;
	static boolean isMicrophoneMutable;
	static boolean isBluetoohConnectivity;
	static boolean isWifiConnectivity;
	static boolean isBatteryChargeable;
	static boolean isWireless;
	static String supportedBluetoothProfiles;
	static String wifiDimensions;
	static String boxDimensions;
	static int height;
	static int powerConsumption;
	static int volume;
	static int batteryLife;
	
	public AlexaSpeakers(String brandName,String color,String batteryCapacity,int price,String virtualAssistant,String assistantSupport,String matterSupport,float drivers,boolean isMicrophoneMutable,boolean isBluetoohConnectivity,boolean isWifiConnectivity,static boolean isBatteryChargeable,static boolean isWireless,String supportedBluetoothProfiles,String wifiDimensions,String boxDimensions,int height,int powerConsumption,int volume,int batteryLife){
		this.brandName=brandName;
		this.color=color;
		this.batteryCapacity=batteryCapacity;
		this.price=price;
		this.virtualAssistant=virtualAssistant;
		this.assistantSupport=assistantSupport;
		this.matterSupport=matterSupport;
		this.drivers=drivers;
		this.isMicrophoneMutable=isMicrophoneMutable;
		this.isBluetoohConnectivity=isBluetoohConnectivity;
		this.isWifiConnectivity=isWifiConnectivity;
		this.isBatteryChargeable=isBatteryChargeable;
		this.isWireless=isWireless;
		this.supportedBluetoothProfiles=supportedBluetoothProfiles;
		this.wifiDimensions=wifiDimensions;
		this.boxDimensions=boxDimensions;
		this.height=height;
		this.powerConsumption=powerConsumption;
		this.volume=volume;
		this.batteryLife=batteryLife;
	}
	
	public static void playRadioStations(){
	}
	public static void streamMusic(){
	}
	public static void playPodcasts(){
	}
	public static void setTimersAndAlarms(){
	}
	public static void playRadioStations(){
	}
	public static void playGames(){
	}
	public static void tailoredNewsReports(){
	}
	public static void askWebBasedQuestions(){
	}
	public static void controlSmartHomeDevices(){
	}
	public static void makeCalls(){
	}
	
	pubic static void main(String[] args){AlexaSpeakers alexaSpeakers=new AlexaSpeakers("AmazonDot5thGen","Charcoal","4000mAh",5499,"AlexaBuiltIn","AmazonAlexa","WifiOnly",1*1.73/4.39 cm,true,true,true,true,true,"A2DP AVRCP","3.9*3.9*3.7/100100*89mm","6.74.2*3.8",9,80,4-5);
	
	System.out.println(AlexaSpeakers.brandName);
	System.out.println(AlexaSpeakers.color);
	System.out.println(AlexaSpeakers.batteryCapacity);
	System.out.println(AlexaSpeakers.price);
	System.out.println(AlexaSpeakers.virtualAssistant);
	System.out.println(AlexaSpeakers.assistantSupport);
	System.out.println(AlexaSpeakers.matterSupport);
	System.out.println(AlexaSpeakers.drivers);
	System.out.println(AlexaSpeakers.isMicrophoneMutable);
	System.out.println(AlexaSpeakers.isWifiConnectivity);
	System.out.println(AlexaSpeakers.isBatteryChargeable);
	System.out.println(AlexaSpeakers.isWireless);
	System.out.println(AlexaSpeakers.supportedBluetoothProfiles);
	System.out.println(AlexaSpeakers.wifiDimensions);
	System.out.println(AlexaSpeakers.boxDimensions);
	System.out.println(AlexaSpeakers.height);
	System.out.println(AlexaSpeakers.powerConsumption);
	System.out.println(AlexaSpeakers.volume);
	System.out.println(AlexaSpeakers.batteryLife);
	}
}