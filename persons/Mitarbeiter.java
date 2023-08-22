package persons;

import java.time.LocalDate;

public class Mitarbeiter extends Angestellter{
	private String abteilung;
	
	public Mitarbeiter(String vorname, String nachname, int geburtsjahr, int geburtsmonat, int geburtstag, String abteilung){
		super(vorname, nachname, LocalDate.of(geburtsjahr, geburtsmonat, geburtstag));
		this.abteilung = abteilung;
	}
	//getter und setter
	public String getAbteilung(){
		return abteilung;
	}
	public void setAbteilung(String abteilung){
		this.abteilung = abteilung;
	}
	@Override
	public String toString(){
		return super.toString() + "\n Abteilung\t" + getAbteilung() ;
		
	}	 
}