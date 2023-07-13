public class Exam{
	final static int totalNumberOfSubjects = 3;
	final static String inventedBy = "ptloemy";
	SubjectsInCourse subjects;
	Results result;

	public static void main(String[] args)
	{
		Exam exam = new Exam();
		System.out.println(exam.totalNumberOfSubjects);
		System.out.println(exam.inventedBy);
		System.out.println("------------------------------------");
		exam.subjects = SubjectsInCourse.JAVA;
		exam.result = Results.FAIL;
		System.out.println(exam.subjects);
		System.out.println(exam.result);
		System.out.println("***********************");
		
		Alphabets alphabets = new Alphabets();
		System.out.println(alphabets.noOfAlphabets);
		System.out.println(alphabets.noOfVowels);
		System.out.println("------------------------------------");
		alphabets.letters = Alphabets1.R;
		alphabets.universalVOwels = Vowels.A;
		System.out.println(alphabets.letters);
		System.out.println(alphabets.universalVOwels);
		System.out.println("***********************");
		
		SolarSystem universe = new SolarSystem();
		System.out.println(universe.noOfPlanets);
		System.out.println(universe.noOfSun);
		System.out.println("------------------------------------");
		universe.planetsRevolvingSun= Planets.EARTH;
		universe.planetToSun = FirstPlanet.MERCURY;
		System.out.println(universe.planetToSun);
		System.out.println(universe.planetsRevolvingSun);
		System.out.println("***********************");
		
		Humans human = new Humans();
		System.out.println(human.noOfEyes);
		System.out.println(human.noOfHead);
		System.out.println("------------------------------------");
		human.mainParts = SenseOrgans.EARS;
		human.impOrgan = BloodPumping.HEART;
		System.out.println(human.mainParts);
		System.out.println(human.impOrgan);
		System.out.println("***********************");
		
		Seasons season = new Seasons();
		System.out.println(season.noOfSeasons);
		System.out.println(season.hotSeason);
		System.out.println("------------------------------------");
		season.seasonsOfYear= MainSeasons.SUMMER;
		season.climateInSeasons = Weather.HOT;
		System.out.println(season.seasonsOfYear);
		System.out.println(season.climateInSeasons);
	}
}
	enum SubjectsInCourse{
		C , JAVA , SQL , WEB;
	}
	enum Results{
		PASS , FAIL , ABSENT , WITHHELD;
	}
	class Alphabets
	{
		final static int noOfAlphabets = 26;
		final static int noOfVowels = 5;
		Alphabets1 letters;
		Vowels universalVOwels;
	}

	enum Alphabets1{
		A , B , C , D , E , F, G , H, I , J , K , L , M , N , O , P ,Q , R, S, T, U, V ,W , X,Y, Z;
	}
	enum Vowels{
		A , E , I , O ,U;
	}

	class SolarSystem{
		final static int noOfPlanets = 8;
		final static int noOfSun = 1;
		Planets planetsRevolvingSun;
		FirstPlanet planetToSun ;
	}
	enum Planets{
		MERCURY , EARTH , JUPITER , SATURN , VENUS , NEPTUNE ;
	}
	enum FirstPlanet{
		MERCURY , MARS;
	}

	class Humans{
		final static  int noOfEyes = 2;
		final static  int noOfHead = 1;
		SenseOrgans mainParts;
		BloodPumping impOrgan;
	}
	enum SenseOrgans{
		EARS , EYES , NOSE , TOUNGUE ;
	}
	enum BloodPumping{
		HEART , BRAIN , AURICLE , VENTRICLE
	}
	class Seasons{
		final static int noOfSeasons = 4;
		final static String hotSeason = "Summer";
		MainSeasons seasonsOfYear;
		Weather climateInSeasons;
	}
	enum MainSeasons{
		SUMMER , WINTER , SPRING , RAINY;
	}
	enum Weather{
		HOT , COLD ,DRIZZLING;
	}