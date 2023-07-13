public class GovtBus{
	final static String service="Public Transport";
	final static int foundedIn=1948;
	Divisions busStations;
	Types classCoach;

	public static void main(String[] args) {
		GovtBus bus = new GovtBus();
        System.out.println(bus.service);
        System.out.println(bus.foundedIn);
        bus.busStations=Divisions.KOLAR;
        bus.classCoach=Types.SLEEPERS;
        System.out.println(bus.busStations);
        System.out.println(bus.classCoach);


        Scooty scooty = new Scooty();
         System.out.println(scooty.inventedBy);
        System.out.println(scooty.developIn);
        scooty.scooters=Types1.MOTORIZED;
         scooty.cylinder=Models.SINGLE;
        System.out.println(scooty.scooters);
        System.out.println(scooty.cylinder);

        Alphabets alphabets = new Alphabets();
         System.out.println(alphabets.noOfAlphabets);
        System.out.println(alphabets.noOfConsonant);
        alphabets.character=Vowels.A;
         alphabets.colors=Rainbow.RED;
        System.out.println(alphabets.character);
        System.out.println(alphabets.colors);


}
}

class Scooty{
	final static String inventedBy="J.F.Merkel";
	final static String developIn="Motor Cycle";
	Types1 scooters;
	Models cylinder;  
}
class Alphabets{
 final static int noOfAlphabets =26;
 final static int noOfConsonant = 21;
  Vowels character;
  Rainbow colors;
}
class Tv {

	final static String  ="";
	final static 
}
enum Divisions{
	KOLAR,
	MYSORE,
	MANDYA;
}

enum Types {
	AC,
	NONAC,
	SLEEPERS;
}

enum Types1{
	KICK,
	MOTORIZED;
} 
enum Models{
	SINGLE,
	TWIN;
}
enum Vowels{
	A,
	E,
	I,
	O,
	U;
}
enum Rainbow{
	RED,
	ORANGE,
	YELLOW;

}