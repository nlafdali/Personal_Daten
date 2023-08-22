package persons;

import java.time.LocalDate;

public class Angestellter extends Personal{
	//attribute
	private double gehalt;
	//constructor
	public Angestellter(String vorname, String nachname, LocalDate geburtsdatum) {
		
		super(vorname, nachname, geburtsdatum);

	}
	public Angestellter(String vorname, String nachname, int geburtsjahr, int geburtsmonat, int geburtstag, double gehalt){
		super(vorname, nachname, LocalDate.of(geburtsjahr, geburtsmonat, geburtstag));
		this.gehalt = gehalt;
	}
	//getter und setter
	public double getGehalt(){
		return gehalt;
	}
	public void setGehalt(double gehalt){
		this.gehalt = gehalt;
	}
	@Override
	public String toString(){
		return super.toString() + "\n Gehalt\t" + getGehalt() ;
		
	}	 
}