package com.xworkz.runner;
import com.xworkz.app.Army;
import com.xworkz.app.ArmyRules;
import com.xworkz.app.Saloon;
import com.xworkz.app.SaloonRules;
import com.xworkz.app.Hostel;
import com.xworkz.app.HostelRules;
import com.xworkz.app.Bank;
import com.xworkz.app.BankRules;
import com.xworkz.app.Company;
import com.xworkz.app.CompanyRules;
import com.xworkz.app.Hospital;
import com.xworkz.app.HospitalRules;
import com.xworkz.app.Husband;
import com.xworkz.app.HusbandRules;
import com.xworkz.app.Metro;
import com.xworkz.app.MetroRules;
import com.xworkz.app.Pub;
import com.xworkz.app.PubRules;
import com.xworkz.app.Temple;
import com.xworkz.app.TempleRules;
import com.xworkz.app.Vtu;
import com.xworkz.app.VtuRules;
import com.xworkz.app.Airport;
import com.xworkz.app.AirportRules;

public class AllRunner {

	public static void main(String[] args) {
		ArmyRules array= new Army();
		array.getDisipline();
		array.getUniforms();
		System.out.println("rules:"+Army.EVERYONE_SHOULD_SPEAK);
		
		SaloonRules saloon = new Saloon();
		saloon.getCutting();
		saloon.getDescent();
		System.out.println("rules:"+Saloon.EXPENSES);
		
		HostelRules hostel = new Hostel();
		hostel.getEating();
		hostel.getWashing();
		System.out.println("rules:"+hostel.COST);
		
		AirportRules airport = new Airport ();
		airport.getPassport();
		airport.getFlight();
		System.out.println("rules:"+airport.PRICE);
		
		BankRules bank = new Bank();
		bank.getLoan();
		bank.getPassbook();
		System.out.println("rules:"+bank.KEEP_ORNAMENTS);

		VtuRules vtu = new Vtu();
		vtu.getUsn();
		vtu.getPlacement();
		System.out.println("rules:"+vtu.VTU_ALLOW_THROUGH_CET);

		PubRules pub = new Pub();
		pub.getDance();
		pub.getDrinks();
		System.out.println("rules:"+pub.AGE);
		
		CompanyRules company = new Company();
		company.getId();
		company.getLaptop();
		System.out.println("rules:"+company.Proper_dress_up);

		HospitalRules hospital=new Hospital();
		hospital.getConsulted();
		hospital.getDisease();
		System.out.println("rules"+hospital.TYPE);
		
		MetroRules metro=new Metro();
		metro.getReach();
		metro.getTicket();
		System.out.println("rules"+metro.DESTINATION);
		
		HusbandRules husband=new Husband();
		husband.getSafety();
		husband.getThings();
		System.out.println("rules"+husband.MAINTAINING_THE_HOUSE);
	}

}
