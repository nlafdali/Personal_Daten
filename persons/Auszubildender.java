package persons;
import java.time.LocalDate;

public class Auszubildender extends Angestellter{
	//attributes
	private int lehrgang ;
	private String bezeichnung;
	static int nAzubiObjekt;
	
	
	public Auszubildender(String vorname, String nachname, int geburtsjahr, int geburtsmonat, int geburtstag, int lehrgang,String bezeichnung){
		super(vorname, nachname, LocalDate.of(geburtsjahr, geburtsmonat, geburtstag));
		this.lehrgang = lehrgang;
		this.bezeichnung = bezeichnung;
		nAzubiObjekt++;
	}
	public static int get_nAzubiObjekt()
	{
		return nAzubiObjekt;
	}
		public int getLehrgang(){
		return lehrgang;
	}
	public void setLehrgang(int lehrgang){
		this.lehrgang = lehrgang;
	}
	public String getBezeichnung(){
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung=bezeichnung;
	}
	@Override
	public String toString(){
		return super.toString() + "\n Lehrgang\t" + getLehrgang() +
			"\nBezeichnung\t" + getBezeichnung();
		
	}	 
}