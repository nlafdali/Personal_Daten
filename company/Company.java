package company;
import persons.Personal;

import java.util.ArrayList;

import persons.Angestellter;
import persons.Auszubildender;
import persons.Manager;
import persons.Mitarbeiter;

public class Company {
	
	public static ArrayList<Personal> persList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Personal ang1 = new Mitarbeiter("Nadine", "Lafd", 1999, 8, 9, "IT.Abteilung");
		Personal ang2 = new Mitarbeiter("joudy", "Jad", 2000,12,19, "Buchhaltung");
		Personal mit = new Mitarbeiter("chou", "Laad", 1979, 7, 9, "Logistik");
		Personal azubi = new Auszubildender("Sara", "Eisermann", 2001, 7, 11, 2023, "Fachinformatiker");
		Personal mang = new Manager("Gernot", "Grünwald", 1967, 8, 15, "OCA Pruefung");
		
		((Angestellter)ang1).setGehalt(6500.00);
		((Angestellter)ang2).setGehalt(4600.50);
		//((Mitarbeiter)mang).setAbteilung("Digitalisierung");
		((Angestellter)mang).setGehalt(9600.50);
		
		persList.add(ang1);
		persList.add(ang2);
		persList.add(azubi);
		persList.add(mang);
		persList.add(mit);
		
		printDaten();
		//System.out.println(findMitarbeiter("Laad"));
		
		//System.out.println(p2.toString());
	}
	public static void printDaten() {
		for(Personal pers:persList) {
			System.out.println(pers);
		}
	}
	public static Personal findMitarbeiter(String name) {
		boolean istList = true;
		Personal result = null;
		for(Personal pers : persList) {
			if(pers.getNachname().equals(name)) {
				result = pers;
				istList = true;
				break;
			}
		if (istList) 
			return result ;
		else
			System.out.println(name + " nicht gefunden!!!\n versuchen sie nochmal");
		}

		return result;
		
		}
	}
