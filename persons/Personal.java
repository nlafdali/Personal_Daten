package persons;
import java.time.LocalDate;

public class Personal{
	//Attribute
	private String vorname;
	private String nachname;
	
	LocalDate geburtsdatum;
	private int geburtsjahr;
	private int geburtsmonat;
	private int geburtstag;
	//private double gehalt;
	
	static int num_Objekt;
	
	//Constructor
	public Personal(){}
	
	
	public Personal(String vorname, String nachname, int geburtsjahr, int geburtsmonat, int geburtstag){
		this(vorname, nachname, LocalDate.of(geburtsjahr, geburtsmonat, geburtstag));
		num_Objekt++;
	}
	//wie viel objekte sind erzeugt
	
	public static int get_num_Objekt()
	{
		return num_Objekt;
	}
	
	public Personal(String vorname, String nachname, LocalDate geburtsdatum) {
		
		this.vorname= vorname;
		this.nachname=nachname;
		this.geburtsdatum=geburtsdatum;
	}
	//setter und getter von nachname
	
	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getFullName(){
		return "Name: \t" + vorname + ", " + nachname;
	}
	public LocalDate getGeburtsdatum(){
		return geburtsdatum;
	}
	
	public String toString(){
		String result = getFullName() + "\nGeburtsdatum: \t"+ geburtsdatum + "\n";
		 
		System.out.println("--------------------------------");
		return result;
	}
	
	}


//	public void setGehalt(double d) {
//		
//		
//	}	
	