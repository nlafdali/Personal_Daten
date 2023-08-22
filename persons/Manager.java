package persons;
import java.time.LocalDate;

public class Manager extends Angestellter{
	private String projekt;
	
	public Manager(String vorname, String nachname, int geburtsjahr, int geburtsmonat, int geburtstag, String projekt){
		super(vorname, nachname, LocalDate.of(geburtsjahr, geburtsmonat, geburtstag));
		this.projekt = projekt;
	
	}
	//getter und setter
	public String getProjekt(){
		return projekt;
	}
	public void setProjekt(String projekt){
		this.projekt = projekt;
	}
	@Override
	public String toString(){
		return super.toString() + "\n Projekt\t" + getProjekt() ;
		
	}	 
}